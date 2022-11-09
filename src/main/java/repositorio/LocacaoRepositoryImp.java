package repositorio;

import modelo.Locacao;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class LocacaoRepositoryImp implements LocacaoRepository{

    private EntityManager manager;

    public LocacaoRepositoryImp(EntityManager manager) {
        this.manager = manager;
    }


    @Override
    public void salva(Locacao locacao) {
        manager.merge(locacao );

    }

    @Override
    public List<Locacao> emAtraso() {
        return manager
                .createQuery("from Locacao l where l.dataDevolucao is null and l.dataPrevista < :hoje", Locacao.class)
                .setParameter("hoje", LocalDate.now() )
                .getResultList();
    }


    @Override
    public List<Locacao> encerradasPorPeriodo(LocalDate dataInicio, LocalDate dataFim) {

        String jpql = "from Locacao l "
                + "where l.dataDevolucao is not null "
                + "and l.dataLocacao between :dataInicio and :dataFim";

        return manager
                .createQuery(jpql, Locacao.class)
                .setParameter("dataInicio", dataInicio )
                .setParameter("dataFim", dataFim )
                .getResultList();
    }
}
