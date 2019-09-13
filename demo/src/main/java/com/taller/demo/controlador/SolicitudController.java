/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.controlador;

import com.taller.demo.models.Solicitud;
import com.taller.demo.repositorio.SolicitudRepositorio;
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
public class SolicitudController {
    @Autowired
     private SolicitudRepositorio solicitudRepository;
    
    @GetMapping("/Solicitud")
        public List<Solicitud> getAllSolicituds() {
        return solicitudRepository.findAll();
       }
    
        @RequestMapping(value="/Solicitud",method=RequestMethod.POST)
@ResponseBody
 @CrossOrigin
 public Solicitud createSolicitud(@Valid @RequestBody Solicitud solicitud) {

  return solicitudRepository.save(solicitud);

 }
}
