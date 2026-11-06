package com.salesianostriana.dam.spring.data.jpa.config;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Proyecto {

    @Id
    @GeneratedValue
    private Long idProyecto;

    private String nombre;

    private String descripcion;

    @OneToMany
    private Set<Tarea> listaTareas;

}
