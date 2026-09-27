package com.github.gihyaa.techfatec.cliente;

import com.github.gihyaa.techfatec.abstracao.Relatorio;
import com.github.gihyaa.techfatec.abstracao.RelatorioDesempenhoRH;
import com.github.gihyaa.techfatec.abstracao.RelatorioVendas;
import com.github.gihyaa.techfatec.implementacao.Exportador;
import com.github.gihyaa.techfatec.implementacao.ExportadorExcel;
import com.github.gihyaa.techfatec.implementacao.ExportadorHTML;
import com.github.gihyaa.techfatec.implementacao.ExportadorPDF;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Exportador> FORMATOS = new LinkedHashMap<>();
    private static int etapaAtual = 0;

    public static void main(String[] args) {
        FORMATOS.put("PDF", new ExportadorPDF());
        FORMATOS.put("XLSX", new ExportadorExcel());
        FORMATOS.put("HTML", new ExportadorHTML());

        imprimirCabecalho();

        Relatorio relatorioDeVendas = new RelatorioVendas(FORMATOS.get("PDF"));
        executarEtapa("Relatorio de Vendas exportado em PDF", relatorioDeVendas);

        relatorioDeVendas.setExportador(FORMATOS.get("XLSX"));
        executarEtapa("Mesmo Relatorio de Vendas trocado para XLSX em tempo de execucao", relatorioDeVendas);

        Relatorio relatorioDeRH = new RelatorioDesempenhoRH(FORMATOS.get("HTML"));
        executarEtapa("Relatorio de Desempenho de RH exportado em HTML", relatorioDeRH);

        System.out.println();
        System.out.printf("Validacao concluida: %d etapas executadas com %d formatos disponiveis %s.%n",
                etapaAtual, FORMATOS.size(), FORMATOS.keySet());
    }

    private static void imprimirCabecalho() {
        String linha = "#".repeat(70);
        System.out.println(linha);
        System.out.println("  TechFatec BI - Validacao do desacoplamento (Padrao Bridge)");
        System.out.println(linha);
    }

    private static void executarEtapa(String descricao, Relatorio relatorio) {
        etapaAtual++;
        System.out.println();
        System.out.println(">> Etapa " + etapaAtual + " | " + descricao);
        System.out.println("-".repeat(70));
        relatorio.gerar();
    }
}
