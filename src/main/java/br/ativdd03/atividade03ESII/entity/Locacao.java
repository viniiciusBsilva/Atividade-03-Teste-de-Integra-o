package br.ativdd03.atividade03ESII.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Locacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade= {CascadeType.MERGE, CascadeType.PERSIST})
    private Imovel imovel;

    @ManyToOne(cascade= {CascadeType.MERGE, CascadeType.PERSIST})
    private Cliente cliente;

    @Column(name = "valor_aluguel")
    private Double valorAluguel;

    @Column(name = "percentual_multa")
    private Double percentualMulta;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "ativo")
    private Boolean ativo;

}

