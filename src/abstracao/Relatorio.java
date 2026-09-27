package com.github.gihyaa.techfatec.abstracao;

import com.github.gihyaa.techfatec.implementacao.Exportador;

public abstract class Relatorio {
    protected Exportador exportador;

    protected Relatorio(Exportador exportador) {
        this.exportador = exportador;
    }

    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    protected abstract String getTitulo();

    protected abstract String gerarConteudo();

    public void gerar() {
        exportador.exportar(getTitulo(), gerarConteudo());
    }
}
