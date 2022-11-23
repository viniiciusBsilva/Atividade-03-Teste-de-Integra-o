package br.ativdd03.atividade03ESII.repository;

import br.ativdd03.atividade03ESII.entity.Locacao;

import java.util.List;
import java.util.Optional;

public class LocacaoRepositoryImpl {

    private LocacaoRepository locacaoRepository;

    public Locacao salvar(Locacao locacao){
        return locacaoRepository.save(locacao);
    }

    public List<Locacao> listaLocacao(){
        return locacaoRepository.findAll();
    }

    public Optional<Locacao> buscarPorId(Long id){
        return locacaoRepository.findById(id);
    }

    public void removerId(Long id){
        locacaoRepository.deleteById(id);
    }
}
