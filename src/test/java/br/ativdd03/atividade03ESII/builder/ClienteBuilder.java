package br.ativdd03.atividade03ESII.builder;

import br.ativdd03.atividade03ESII.entity.Cliente;

import java.time.LocalDate;

public class ClienteBuilder {

    private Cliente cliente;

    private ClienteBuilder(){}

    public static ClienteBuilder umCliente(){

        ClienteBuilder builder = new ClienteBuilder();
        builder.cliente = new Cliente();
        builder.cliente.setName("Vinicius");
        builder.cliente.setCpf(1234);
        builder.cliente.setEmail("vinicius@gmail.com");
        builder.cliente.setTelefone1(32103021);
        builder.cliente.setTelefone2(21392193);
        builder.cliente.setDt_Nascimento(LocalDate.of(30,11,2000));

        return builder;
    }

    public ClienteBuilder comNome(String nome){
        cliente.setName(nome);
        return this;
    }

    public Cliente constroi(){ return cliente;}

}
