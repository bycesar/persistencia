/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CESAR
 */
@Entity
@Table(name = "Convocatoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convocatoria.findAll", query = "SELECT c FROM Convocatoria c")
    , @NamedQuery(name = "Convocatoria.findByIdConvocatoria", query = "SELECT c FROM Convocatoria c WHERE c.idConvocatoria = :idConvocatoria")
    , @NamedQuery(name = "Convocatoria.findByFechaConvocatoriaInicio", query = "SELECT c FROM Convocatoria c WHERE c.fechaConvocatoriaInicio = :fechaConvocatoriaInicio")
    , @NamedQuery(name = "Convocatoria.findByFechaConvocatoriaFin", query = "SELECT c FROM Convocatoria c WHERE c.fechaConvocatoriaFin = :fechaConvocatoriaFin")})
public class Convocatoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_convocatoria")
    private Integer idConvocatoria;
    @Column(name = "fecha_convocatoria_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaConvocatoriaInicio;
    @Column(name = "fecha_convocatoria_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaConvocatoriaFin;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idConvocatoria")
    private Solicitud solicitud;
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @OneToOne(optional = false)
    private Docentes idDocente;

    public Convocatoria() {
    }

    public Convocatoria(Integer idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public Integer getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(Integer idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public Date getFechaConvocatoriaInicio() {
        return fechaConvocatoriaInicio;
    }

    public void setFechaConvocatoriaInicio(Date fechaConvocatoriaInicio) {
        this.fechaConvocatoriaInicio = fechaConvocatoriaInicio;
    }

    public Date getFechaConvocatoriaFin() {
        return fechaConvocatoriaFin;
    }

    public void setFechaConvocatoriaFin(Date fechaConvocatoriaFin) {
        this.fechaConvocatoriaFin = fechaConvocatoriaFin;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConvocatoria != null ? idConvocatoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convocatoria)) {
            return false;
        }
        Convocatoria other = (Convocatoria) object;
        if ((this.idConvocatoria == null && other.idConvocatoria != null) || (this.idConvocatoria != null && !this.idConvocatoria.equals(other.idConvocatoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.demo.Convocatoria[ idConvocatoria=" + idConvocatoria + " ]";
    }
    
}
