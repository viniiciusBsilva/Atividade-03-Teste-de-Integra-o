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
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf")
    private Integer cpf;

    @Column(name = "telefone_1")
    private Integer telefone1;

    @Column(name = "telefone_2")
    private Integer telefone2;

    @Column(name = "email")
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dt_Nascimento;
}
