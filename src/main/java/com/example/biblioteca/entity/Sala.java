package com.example.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salas")
@EqualsAndHashCode(callSuper = false)
public class Sala extends BaseEntity {

    @Column(nullable = false, length = 200, unique = true)
    private String nome;

    @Column(nullable = false)
    @Min(1)
    @Max(5)
    private int capacidadeMaxima;
    
    @Column(nullable = false)
    private String descricao;

    @Column
    private boolean ativo;

}
