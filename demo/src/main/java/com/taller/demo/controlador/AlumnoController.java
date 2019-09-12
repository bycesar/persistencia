/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.controlador;

import com.taller.demo.models.Alumnos;
import com.taller.demo.repositorio.AlumnoRepositorio;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CESAR
 */

@RestController
@RequestMapping("/api")
public class AlumnoController {
     @Autowired
     private AlumnoRepositorio alumnoRepository;
     
     @GetMapping("/Alumnos")
        public List<Alumnos> getAllEmpleados() {
        return alumnoRepository.findAll();
       }
        
      
@RequestMapping(value="/Alumnos",method=RequestMethod.POST)
@ResponseBody
 @CrossOrigin
 public Alumnos createAlumnos(@Valid @RequestBody Alumnos alumno) {

  return alumnoRepository.save(alumno);

 }
}
