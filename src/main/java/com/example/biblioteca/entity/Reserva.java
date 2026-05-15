package com.example.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "reservas")
public class Reserva extends BaseReserva{

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Computador computador;

    

}
