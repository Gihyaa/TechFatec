package com.github.gihyaa.techfatec.abstracao;

import com.github.gihyaa.techfatec.implementacao.Exportador;

public class RelatorioDesempenhoRH extends Relatorio {
    public RelatorioDesempenhoRH(Exportador exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio de Desempenho de RH";
    }

    @Override
    protected String gerarConteudo() {
        return "Colaboradores avaliados: 85 | Media de desempenho: 8,4 | Turnover: 3,2%";
    }
}
