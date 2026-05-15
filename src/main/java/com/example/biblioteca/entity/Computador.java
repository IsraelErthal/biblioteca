package com.example.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "computadores")
@EqualsAndHashCode(callSuper = false)
public class Computador extends BaseEntity {

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false)
    @Min(1)
    private int capacidadeMaxima;

    @Column
    private boolean ativo;

}
