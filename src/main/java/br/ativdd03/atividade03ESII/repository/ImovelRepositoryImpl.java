package br.ativdd03.atividade03ESII.repository;


import br.ativdd03.atividade03ESII.entity.Imovel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ImovelRepositoryImpl {
    @Autowired
    private ImovelRepository imovelRepository;

    public Imovel salvar(Imovel imovel){
        return imovelRepository.save(imovel);
    }

    public List<Imovel> listaImovel(){
        return imovelRepository.findAll();
    }

    public Optional<Imovel> buscarPorId(Long id){
        return imovelRepository.findById(id);
    }

    public void removerId(Long id){
        imovelRepository.deleteById(id);
    }

}
