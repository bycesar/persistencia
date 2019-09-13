/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.repositorio;

import com.taller.demo.models.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CESAR
 */
@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumnos, Integer>{
    
}
