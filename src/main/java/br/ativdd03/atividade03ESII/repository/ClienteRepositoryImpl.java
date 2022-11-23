package br.ativdd03.atividade03ESII.repository;

import br.ativdd03.atividade03ESII.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteRepositoryImpl {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarporId(Long id){
        return clienteRepository.findById(id);
    }

    public void removerId(Long id){
        clienteRepository.deleteById(id);
    }
}

