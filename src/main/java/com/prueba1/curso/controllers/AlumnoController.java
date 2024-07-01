package com.prueba1.curso.controllers;

import com.prueba1.curso.models.Alumno;
import com.prueba1.curso.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Alumno>> listarAlumnos() {
        try {
            List<Alumno> alumnos = alumnoService.allAlumnos();
            return ResponseEntity.ok(alumnos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<Object> registrarAlumno(@RequestBody Alumno alumno) {
        try {
            if (alumno.getAlum_nombres() == null || alumno.getAlum_apellidos() == null ||
                    alumno.getAlum_edad() == null || alumno.getAlum_correo() == null ||
                    alumno.getAlum_genero() == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Faltan campos obligatorios");
            }

            Alumno nuevoAlumno = alumnoService.storeAlumno(alumno);
            return ResponseEntity.status(HttpStatus.CREATED).body("Alumno registrado correctamente: " + nuevoAlumno.getId_alumno());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos incorrectos: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno al procesar la solicitud");
        }
    }
}



