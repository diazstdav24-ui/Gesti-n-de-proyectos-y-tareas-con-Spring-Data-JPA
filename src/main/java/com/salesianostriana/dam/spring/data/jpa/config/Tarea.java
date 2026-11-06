package com.salesianostriana.dam.spring.data.jpa.config;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue
    private Long idTarea;

    private String titulo;

    private boolean estado;

    @ManyToOne
    private Proyecto proyecto;

    @ManyToMany
    private Set<Etiqueta> listaEtiquetas;

    @OneToMany
    private Set<Comentario> listaComentarios;


    public void addComentario(Comentario comentario){
        listaComentarios.add(comentario);
        comentario.setTarea(this);
    }
}
