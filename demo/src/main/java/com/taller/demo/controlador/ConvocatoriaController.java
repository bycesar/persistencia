/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.controlador;

import com.taller.demo.models.Convocatoria;
import com.taller.demo.repositorio.ConvocatoriaRepositorio;
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
public class ConvocatoriaController {
    @Autowired
     private ConvocatoriaRepositorio convocatoriaRepository;
    
    @GetMapping("/Convocatoria")
        public List<Convocatoria> getAllConvocatorias() {
        return convocatoriaRepository.findAll();
       }
        
        @RequestMapping(value="/Convocatoria",method=RequestMethod.POST)
@ResponseBody
 @CrossOrigin
 public Convocatoria createConvocatoria(@Valid @RequestBody Convocatoria convocatoria) {

  return convocatoriaRepository.save(convocatoria);

 }
    
}
