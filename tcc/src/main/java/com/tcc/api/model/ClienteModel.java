package com.tcc.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeC", length = 50)
    private String nome;

    @Column(name = "sobrenomeC", length = 50)
    private String sobrenome;

    @Column(name = "cpfC", length = 15, unique = true)
    private String cpf;

    @Column(name = "logradouro", length = 200)
    private String logradouro;

    @Column(name = "cidade", length = 50)
    private String cidade;

    @Column(name = "emailC", length = 50, unique = true)
    private String email;

    @Column(name = "senhaC", length = 16)
    private String senha;

    @Column(name = "tipo")
    private boolean tipo;

}
