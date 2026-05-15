package com.example.biblioteca.entity;

import java.time.LocalDateTime;

import com.example.biblioteca.enums.NivelAcesso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
@EqualsAndHashCode(callSuper = false)
public class Usuario extends BaseEntity {

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 200, unique = true)
    private String email;

    @Column(nullable = false, length = 200)
    private String senha;

    @Column(nullable = false, length = 200, unique = true)
    private String matricula;

    @Column(nullable = false, length = 200)
    private NivelAcesso role;

    @Column(nullable = false, length = 200)
    private LocalDateTime dataCadastro;

    @Column
    private boolean ativo;
}
