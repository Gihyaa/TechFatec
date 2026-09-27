package com.github.gihyaa.techfatec.implementacao;

public class ExportadorHTML implements Exportador {
    @Override
    public void exportar(String titulo, String conteudo) {
        System.out.println("[HTML] <html><head><title>" + titulo + "</title></head>");
        System.out.println("[HTML] <body><h1>" + titulo + "</h1><p>" + conteudo + "</p></body></html>");
        System.out.println("[HTML] Arquivo " + titulo.replace(" ", "_") + ".html exportado com sucesso.");
    }
}
