/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CESAR
 */
@Entity
@Table(name = "Lugares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugares.findAll", query = "SELECT l FROM Lugares l")
    , @NamedQuery(name = "Lugares.findByIdLugar", query = "SELECT l FROM Lugares l WHERE l.idLugar = :idLugar")
    , @NamedQuery(name = "Lugares.findByLugarCodigo", query = "SELECT l FROM Lugares l WHERE l.lugarCodigo = :lugarCodigo")
    , @NamedQuery(name = "Lugares.findByLugarNombre", query = "SELECT l FROM Lugares l WHERE l.lugarNombre = :lugarNombre")
    , @NamedQuery(name = "Lugares.findByLugarNivel", query = "SELECT l FROM Lugares l WHERE l.lugarNivel = :lugarNivel")})
public class Lugares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lugar")
    private Integer idLugar;
    @Size(max = 20)
    @Column(name = "lugar_codigo")
    private String lugarCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "lugar_nombre")
    private String lugarNombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lugar_nivel")
    private int lugarNivel;
    @OneToMany(mappedBy = "idLugarNatal")
    private List<Personas> personasList;
    @OneToMany(mappedBy = "idLugarResidencia")
    private List<Personas> personasList1;
    @OneToMany(mappedBy = "idLugarReferencia")
    private List<Lugares> lugaresList;
    @JoinColumn(name = "id_lugar_referencia", referencedColumnName = "id_lugar")
    @ManyToOne
    private Lugares idLugarReferencia;

    public Lugares() {
    }

    public Lugares(Integer idLugar) {
        this.idLugar = idLugar;
    }

    public Lugares(Integer idLugar, String lugarNombre, int lugarNivel) {
        this.idLugar = idLugar;
        this.lugarNombre = lugarNombre;
        this.lugarNivel = lugarNivel;
    }

    public Integer getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(Integer idLugar) {
        this.idLugar = idLugar;
    }

    public String getLugarCodigo() {
        return lugarCodigo;
    }

    public void setLugarCodigo(String lugarCodigo) {
        this.lugarCodigo = lugarCodigo;
    }

    public String getLugarNombre() {
        return lugarNombre;
    }

    public void setLugarNombre(String lugarNombre) {
        this.lugarNombre = lugarNombre;
    }

    public int getLugarNivel() {
        return lugarNivel;
    }

    public void setLugarNivel(int lugarNivel) {
        this.lugarNivel = lugarNivel;
    }

    @XmlTransient
    public List<Personas> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Personas> personasList) {
        this.personasList = personasList;
    }

    @XmlTransient
    public List<Personas> getPersonasList1() {
        return personasList1;
    }

    public void setPersonasList1(List<Personas> personasList1) {
        this.personasList1 = personasList1;
    }

    @XmlTransient
    public List<Lugares> getLugaresList() {
        return lugaresList;
    }

    public void setLugaresList(List<Lugares> lugaresList) {
        this.lugaresList = lugaresList;
    }

    public Lugares getIdLugarReferencia() {
        return idLugarReferencia;
    }

    public void setIdLugarReferencia(Lugares idLugarReferencia) {
        this.idLugarReferencia = idLugarReferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLugar != null ? idLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugares)) {
            return false;
        }
        Lugares other = (Lugares) object;
        if ((this.idLugar == null && other.idLugar != null) || (this.idLugar != null && !this.idLugar.equals(other.idLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.demo.Lugares[ idLugar=" + idLugar + " ]";
    }
    
}
