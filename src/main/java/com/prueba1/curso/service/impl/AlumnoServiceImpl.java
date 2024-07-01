package com.prueba1.curso.service.impl;

import com.prueba1.curso.models.Alumno;
import com.prueba1.curso.respository.AlumnoRepository;
import com.prueba1.curso.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> allAlumnos(){
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno storeAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}