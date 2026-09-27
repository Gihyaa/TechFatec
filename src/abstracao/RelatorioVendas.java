package com.github.gihyaa.techfatec.abstracao;

import com.github.gihyaa.techfatec.implementacao.Exportador;

public class RelatorioVendas extends Relatorio {
    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio de Vendas";
    }

    @Override
    protected String gerarConteudo() {
        return "Total de vendas: R$ 150.000,00 | Produtos vendidos: 1.200 | Ticket medio: R$ 125,00";
    }
}
