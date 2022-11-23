package br.ativdd03.atividade03ESII.builder;

import br.ativdd03.atividade03ESII.entity.Locacao;

import java.time.LocalDate;

public class LocacaoBuilder {

    private Locacao lococao;

    private  LocacaoBuilder(){}

    public static LocacaoBuilder umaLocacao(){
        LocacaoBuilder builder = new LocacaoBuilder();

        builder.lococao = new Locacao();
        builder.lococao.setCliente(ClienteBuilder.umCliente().constroi());
        builder.lococao.setImovel(ImovelBuilder.umImovel().constroi());
        builder.lococao.setAtivo(false);
        builder.lococao.setDataInicio(LocalDate.now());
        builder.lococao.setDataFim(LocalDate.now().plusDays(5));
        builder.lococao.setDataVencimento(LocalDate.now().plusDays(5));
        builder.lococao.setPercentualMulta(11.0);
        return builder;
    }
}
