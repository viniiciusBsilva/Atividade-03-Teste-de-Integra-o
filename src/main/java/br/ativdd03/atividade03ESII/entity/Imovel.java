package br.ativdd03.atividade03ESII.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo_imovel")
    private String tipoImovel;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "valor_aluguel_sugerido")
    private Double valorAluguelSugerido;
}
