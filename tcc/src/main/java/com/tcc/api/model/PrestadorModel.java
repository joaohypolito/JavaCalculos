package com.tcc.api.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "prestador")
public class PrestadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeP", length = 50)
    private String nome;

    @Column(name = "sobrenomeP", length = 50)
    private String sobrenome;

    @Column(name = "cpfP", length = 15, unique = true)
    private String cpf;

    @Column(name = "emailP", length = 50, unique = true)
    private String email;

    @Column(name = "senhaP", length = 16)
    private String senha;

    @Column(name = "tipo")
    private boolean tipo;


}
