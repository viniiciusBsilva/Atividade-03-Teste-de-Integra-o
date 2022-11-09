package repositorio;

import modelo.Locacao;

import java.time.LocalDate;
import java.util.List;

public interface LocacaoRepository {
    void salva(Locacao locacao);

    List<Locacao> emAtraso();

    List<Locacao> encerradasPorPeriodo(LocalDate dataInicio, LocalDate dataFim);
}
