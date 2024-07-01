package com.prueba1.curso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_alumnos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alumno;
    private String alum_nombres;
    private String alum_apellidos;
    private String alum_edad;
    private String alum_correo;
    private String alum_genero;

    public Long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Long id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getAlum_nombres() {
        return alum_nombres;
    }

    public void setAlum_nombres(String alum_nombres) {
        this.alum_nombres = alum_nombres;
    }

    public String getAlum_apellidos() {
        return alum_apellidos;
    }

    public void setAlum_apellidos(String alum_apellidos) {
        this.alum_apellidos = alum_apellidos;
    }

    public String getAlum_edad() {
        return alum_edad;
    }

    public void setAlum_edad(String alum_edad) {
        this.alum_edad = alum_edad;
    }

    public String getAlum_correo() {
        return alum_correo;
    }

    public void setAlum_correo(String alum_correo) {
        this.alum_correo = alum_correo;
    }

    public String getAlum_genero() {
        return alum_genero;
    }

    public void setAlum_genero(String alum_genero) {
        this.alum_genero = alum_genero;
    }
}
