package br.ativdd03.atividade03ESII.repository;

import br.ativdd03.atividade03ESII.entity.Aluguel;

import java.util.List;
import java.util.Optional;

public class AluguelRepositoryImpl {

    private AluguelRepository aluguelRepository;

    public Aluguel salvar(Aluguel aluguel){
        return aluguelRepository.save(aluguel);
    }

    public List<Aluguel> listaAluguel(){
        return aluguelRepository.findAll();
    }

    public Optional<Aluguel> buscarPorId(Long id){
        return aluguelRepository.findById(id);
    }

    public void removerId(Long id){
        aluguelRepository.deleteById(id);
    }

}
