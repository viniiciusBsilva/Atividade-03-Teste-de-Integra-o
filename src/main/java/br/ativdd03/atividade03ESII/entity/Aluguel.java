package br.ativdd03.atividade03ESII.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Aluguel implements Serializable {

    @OneToMany(cascade= {CascadeType.ALL})
    private List<Locacao> locacao = new ArrayList<>();

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "valor_pago")
    private Double valorPago;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;
}
