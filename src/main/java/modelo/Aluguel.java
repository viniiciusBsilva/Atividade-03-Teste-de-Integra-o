package modelo;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Aluguel {
    private Locacao  locacao = new Locacao();
    private LocalDate data_de_vencimento;

}
