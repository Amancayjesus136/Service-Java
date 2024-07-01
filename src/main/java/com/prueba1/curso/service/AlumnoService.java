package com.prueba1.curso.service;

import com.prueba1.curso.models.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> allAlumnos();

    Alumno storeAlumno(Alumno alumno);
}
