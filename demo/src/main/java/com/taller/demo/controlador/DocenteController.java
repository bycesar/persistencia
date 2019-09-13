/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.controlador;

import com.taller.demo.models.Docentes;
import com.taller.demo.repositorio.DocenteRepositorio;
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
public class DocenteController {
    @Autowired
     private DocenteRepositorio docenteRepository;
    
    @GetMapping("/Docentes")
        public List<Docentes> getAllDocenteses() {
        return docenteRepository.findAll();
       }
        
        @RequestMapping(value="/Docentes",method=RequestMethod.POST)
@ResponseBody
 @CrossOrigin
 public Docentes createDocentes(@Valid @RequestBody Docentes docente) {

  return docenteRepository.save(docente);

 }
}
