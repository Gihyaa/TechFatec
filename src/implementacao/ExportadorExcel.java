package com.github.gihyaa.techfatec.implementacao;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String titulo, String conteudo) {
        System.out.println("[XLSX] Criando planilha: " + titulo);
        System.out.println("[XLSX] Celulas: " + conteudo);
        System.out.println("[XLSX] Arquivo " + titulo.replace(" ", "_") + ".xlsx exportado com sucesso.");
    }
}
