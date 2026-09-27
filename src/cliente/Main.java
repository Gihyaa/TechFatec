package com.github.gihyaa.techfatec.cliente;

import com.github.gihyaa.techfatec.abstracao.Relatorio;
import com.github.gihyaa.techfatec.abstracao.RelatorioDesempenhoRH;
import com.github.gihyaa.techfatec.abstracao.RelatorioVendas;
import com.github.gihyaa.techfatec.implementacao.Exportador;
import com.github.gihyaa.techfatec.implementacao.ExportadorExcel;
import com.github.gihyaa.techfatec.implementacao.ExportadorHTML;
import com.github.gihyaa.techfatec.implementacao.ExportadorPDF;

public class Main {
    public static void main(String[] args) {
        Exportador pdf = new ExportadorPDF();
        Exportador excel = new ExportadorExcel();
        Exportador html = new ExportadorHTML();

        System.out.println("=== 1. Relatorio de Vendas em PDF ===");
        Relatorio vendas = new RelatorioVendas(pdf);
        vendas.gerar();

        System.out.println();
        System.out.println("=== 2. Relatorio de Vendas alterado para Excel em tempo de execucao ===");
        vendas.setExportador(excel);
        vendas.gerar();

        System.out.println();
        System.out.println("=== 3. Relatorio de RH em HTML ===");
        Relatorio rh = new RelatorioDesempenhoRH(html);
        rh.gerar();
    }
}
