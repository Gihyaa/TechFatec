package com.github.gihyaa.techfatec.implementacao;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String titulo, String conteudo) {
        System.out.println("[PDF] Gerando documento PDF: " + titulo);
        System.out.println("[PDF] Conteudo: " + conteudo);
        System.out.println("[PDF] Arquivo " + titulo.replace(" ", "_") + ".pdf exportado com sucesso.");
    }
}
