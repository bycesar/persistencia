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
@Table(name = "SectorEconomico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SectorEconomico.findAll", query = "SELECT s FROM SectorEconomico s")
    , @NamedQuery(name = "SectorEconomico.findByIdSecEconomico", query = "SELECT s FROM SectorEconomico s WHERE s.idSecEconomico = :idSecEconomico")
    , @NamedQuery(name = "SectorEconomico.findBySecEconomicoCodigo", query = "SELECT s FROM SectorEconomico s WHERE s.secEconomicoCodigo = :secEconomicoCodigo")
    , @NamedQuery(name = "SectorEconomico.findBySecEconomicoDescripcion", query = "SELECT s FROM SectorEconomico s WHERE s.secEconomicoDescripcion = :secEconomicoDescripcion")
    , @NamedQuery(name = "SectorEconomico.findBySecEconomicoActivo", query = "SELECT s FROM SectorEconomico s WHERE s.secEconomicoActivo = :secEconomicoActivo")})
public class SectorEconomico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sec_economico")
    private Integer idSecEconomico;
    @Size(max = 10)
    @Column(name = "sec_economico_codigo")
    private String secEconomicoCodigo;
    @Size(max = 200)
    @Column(name = "sec_economico_descripcion")
    private String secEconomicoDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sec_economico_activo")
    private boolean secEconomicoActivo;
    @OneToMany(mappedBy = "idSecEconomico")
    private List<Alumnos> alumnosList;

    public SectorEconomico() {
    }

    public SectorEconomico(Integer idSecEconomico) {
        this.idSecEconomico = idSecEconomico;
    }

    public SectorEconomico(Integer idSecEconomico, boolean secEconomicoActivo) {
        this.idSecEconomico = idSecEconomico;
        this.secEconomicoActivo = secEconomicoActivo;
    }

    public Integer getIdSecEconomico() {
        return idSecEconomico;
    }

    public void setIdSecEconomico(Integer idSecEconomico) {
        this.idSecEconomico = idSecEconomico;
    }

    public String getSecEconomicoCodigo() {
        return secEconomicoCodigo;
    }

    public void setSecEconomicoCodigo(String secEconomicoCodigo) {
        this.secEconomicoCodigo = secEconomicoCodigo;
    }

    public String getSecEconomicoDescripcion() {
        return secEconomicoDescripcion;
    }

    public void setSecEconomicoDescripcion(String secEconomicoDescripcion) {
        this.secEconomicoDescripcion = secEconomicoDescripcion;
    }

    public boolean getSecEconomicoActivo() {
        return secEconomicoActivo;
    }

    public void setSecEconomicoActivo(boolean secEconomicoActivo) {
        this.secEconomicoActivo = secEconomicoActivo;
    }

    @XmlTransient
    public List<Alumnos> getAlumnosList() {
        return alumnosList;
    }

    public void setAlumnosList(List<Alumnos> alumnosList) {
        this.alumnosList = alumnosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSecEconomico != null ? idSecEconomico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SectorEconomico)) {
            return false;
        }
        SectorEconomico other = (SectorEconomico) object;
        if ((this.idSecEconomico == null && other.idSecEconomico != null) || (this.idSecEconomico != null && !this.idSecEconomico.equals(other.idSecEconomico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.demo.SectorEconomico[ idSecEconomico=" + idSecEconomico + " ]";
    }
    
}
