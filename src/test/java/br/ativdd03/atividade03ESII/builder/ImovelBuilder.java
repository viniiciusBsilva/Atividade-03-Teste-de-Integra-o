package br.ativdd03.atividade03ESII.builder;

import br.ativdd03.atividade03ESII.entity.Imovel;

public class ImovelBuilder {
    private Imovel imovel;

    private ImovelBuilder(){ }

    public static ImovelBuilder umImovel(){
        ImovelBuilder builder = new ImovelBuilder();

        builder.imovel = new Imovel();
        builder.imovel.setTipoImovel("Apartamento");
        builder.imovel.setCep(3214);
        builder.imovel.setEndereco("Rua 45 casa 72");
        builder.imovel.setValorAluguelSugerido(1000.00);

        return builder;
    }

    public ImovelBuilder comTipo(String tipoImovel){
        this.imovel.setTipoImovel(tipoImovel);
        return this;
    }

    public Imovel constroi(){
        return this.imovel;
    }

}
