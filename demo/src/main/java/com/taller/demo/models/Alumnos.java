/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.demo.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CESAR
 */
@Entity
@Table(name = "Alumnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a")
    , @NamedQuery(name = "Alumnos.findByIdAlumno", query = "SELECT a FROM Alumnos a WHERE a.idAlumno = :idAlumno")
    , @NamedQuery(name = "Alumnos.findByAlumnoCodigo", query = "SELECT a FROM Alumnos a WHERE a.alumnoCodigo = :alumnoCodigo")
    , @NamedQuery(name = "Alumnos.findByAlumnoTipoColegio", query = "SELECT a FROM Alumnos a WHERE a.alumnoTipoColegio = :alumnoTipoColegio")
    , @NamedQuery(name = "Alumnos.findByAlumnoTipoBachillerato", query = "SELECT a FROM Alumnos a WHERE a.alumnoTipoBachillerato = :alumnoTipoBachillerato")
    , @NamedQuery(name = "Alumnos.findByAlumnoAnioGraduacion", query = "SELECT a FROM Alumnos a WHERE a.alumnoAnioGraduacion = :alumnoAnioGraduacion")
    , @NamedQuery(name = "Alumnos.findByAlumnoEducacionSuperior", query = "SELECT a FROM Alumnos a WHERE a.alumnoEducacionSuperior = :alumnoEducacionSuperior")
    , @NamedQuery(name = "Alumnos.findByAlumnoTituloSuperior", query = "SELECT a FROM Alumnos a WHERE a.alumnoTituloSuperior = :alumnoTituloSuperior")
    , @NamedQuery(name = "Alumnos.findByAlumnoNivelAcademico", query = "SELECT a FROM Alumnos a WHERE a.alumnoNivelAcademico = :alumnoNivelAcademico")
    , @NamedQuery(name = "Alumnos.findByAlumnoPension", query = "SELECT a FROM Alumnos a WHERE a.alumnoPension = :alumnoPension")
    , @NamedQuery(name = "Alumnos.findByAlumnoOcupacion", query = "SELECT a FROM Alumnos a WHERE a.alumnoOcupacion = :alumnoOcupacion")
    , @NamedQuery(name = "Alumnos.findByAlumnoTrabaja", query = "SELECT a FROM Alumnos a WHERE a.alumnoTrabaja = :alumnoTrabaja")
    , @NamedQuery(name = "Alumnos.findByAlumnoNivelFormacionPadre", query = "SELECT a FROM Alumnos a WHERE a.alumnoNivelFormacionPadre = :alumnoNivelFormacionPadre")
    , @NamedQuery(name = "Alumnos.findByAlumnoNivelFormacionMadre", query = "SELECT a FROM Alumnos a WHERE a.alumnoNivelFormacionMadre = :alumnoNivelFormacionMadre")
    , @NamedQuery(name = "Alumnos.findByAlumnoNombreContactoEmergencia", query = "SELECT a FROM Alumnos a WHERE a.alumnoNombreContactoEmergencia = :alumnoNombreContactoEmergencia")
    , @NamedQuery(name = "Alumnos.findByAlumnoParentescoContacto", query = "SELECT a FROM Alumnos a WHERE a.alumnoParentescoContacto = :alumnoParentescoContacto")
    , @NamedQuery(name = "Alumnos.findByAlumnoNumeroContacto", query = "SELECT a FROM Alumnos a WHERE a.alumnoNumeroContacto = :alumnoNumeroContacto")
    , @NamedQuery(name = "Alumnos.findByAlumnoActivo", query = "SELECT a FROM Alumnos a WHERE a.alumnoActivo = :alumnoActivo")
    , @NamedQuery(name = "Alumnos.findByAlumnoObservacion", query = "SELECT a FROM Alumnos a WHERE a.alumnoObservacion = :alumnoObservacion")})
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    @Size(max = 30)
    @Column(name = "alumno_codigo")
    private String alumnoCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "alumno_tipo_colegio")
    private String alumnoTipoColegio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "alumno_tipo_bachillerato")
    private String alumnoTipoBachillerato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "alumno_anio_graduacion")
    private String alumnoAnioGraduacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alumno_educacion_superior")
    private boolean alumnoEducacionSuperior;
    @Size(max = 200)
    @Column(name = "alumno_titulo_superior")
    private String alumnoTituloSuperior;
    @Size(max = 50)
    @Column(name = "alumno_nivel_academico")
    private String alumnoNivelAcademico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alumno_pension")
    private boolean alumnoPension;
    @Size(max = 200)
    @Column(name = "alumno_ocupacion")
    private String alumnoOcupacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alumno_trabaja")
    private boolean alumnoTrabaja;
    @Size(max = 100)
    @Column(name = "alumno_nivel_formacion_padre")
    private String alumnoNivelFormacionPadre;
    @Size(max = 100)
    @Column(name = "alumno_nivel_formacion_madre")
    private String alumnoNivelFormacionMadre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "alumno_nombre_contacto_emergencia")
    private String alumnoNombreContactoEmergencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "alumno_parentesco_contacto")
    private String alumnoParentescoContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "alumno_numero_contacto")
    private String alumnoNumeroContacto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alumno_activo")
    private boolean alumnoActivo;
    @Size(max = 100)
    @Column(name = "alumno_observacion")
    private String alumnoObservacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idAlumno")
    private Solicitud solicitud;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @OneToOne(optional = false)
    private Personas idPersona;
    @JoinColumn(name = "id_sec_economico", referencedColumnName = "id_sec_economico")
    @ManyToOne
    private SectorEconomico idSecEconomico;

    public Alumnos() {
    }

    public Alumnos(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Alumnos(Integer idAlumno, String alumnoTipoColegio, String alumnoTipoBachillerato, String alumnoAnioGraduacion, boolean alumnoEducacionSuperior, boolean alumnoPension, boolean alumnoTrabaja, String alumnoNombreContactoEmergencia, String alumnoParentescoContacto, String alumnoNumeroContacto, boolean alumnoActivo) {
        this.idAlumno = idAlumno;
        this.alumnoTipoColegio = alumnoTipoColegio;
        this.alumnoTipoBachillerato = alumnoTipoBachillerato;
        this.alumnoAnioGraduacion = alumnoAnioGraduacion;
        this.alumnoEducacionSuperior = alumnoEducacionSuperior;
        this.alumnoPension = alumnoPension;
        this.alumnoTrabaja = alumnoTrabaja;
        this.alumnoNombreContactoEmergencia = alumnoNombreContactoEmergencia;
        this.alumnoParentescoContacto = alumnoParentescoContacto;
        this.alumnoNumeroContacto = alumnoNumeroContacto;
        this.alumnoActivo = alumnoActivo;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getAlumnoCodigo() {
        return alumnoCodigo;
    }

    public void setAlumnoCodigo(String alumnoCodigo) {
        this.alumnoCodigo = alumnoCodigo;
    }

    public String getAlumnoTipoColegio() {
        return alumnoTipoColegio;
    }

    public void setAlumnoTipoColegio(String alumnoTipoColegio) {
        this.alumnoTipoColegio = alumnoTipoColegio;
    }

    public String getAlumnoTipoBachillerato() {
        return alumnoTipoBachillerato;
    }

    public void setAlumnoTipoBachillerato(String alumnoTipoBachillerato) {
        this.alumnoTipoBachillerato = alumnoTipoBachillerato;
    }

    public String getAlumnoAnioGraduacion() {
        return alumnoAnioGraduacion;
    }

    public void setAlumnoAnioGraduacion(String alumnoAnioGraduacion) {
        this.alumnoAnioGraduacion = alumnoAnioGraduacion;
    }

    public boolean getAlumnoEducacionSuperior() {
        return alumnoEducacionSuperior;
    }

    public void setAlumnoEducacionSuperior(boolean alumnoEducacionSuperior) {
        this.alumnoEducacionSuperior = alumnoEducacionSuperior;
    }

    public String getAlumnoTituloSuperior() {
        return alumnoTituloSuperior;
    }

    public void setAlumnoTituloSuperior(String alumnoTituloSuperior) {
        this.alumnoTituloSuperior = alumnoTituloSuperior;
    }

    public String getAlumnoNivelAcademico() {
        return alumnoNivelAcademico;
    }

    public void setAlumnoNivelAcademico(String alumnoNivelAcademico) {
        this.alumnoNivelAcademico = alumnoNivelAcademico;
    }

    public boolean getAlumnoPension() {
        return alumnoPension;
    }

    public void setAlumnoPension(boolean alumnoPension) {
        this.alumnoPension = alumnoPension;
    }

    public String getAlumnoOcupacion() {
        return alumnoOcupacion;
    }

    public void setAlumnoOcupacion(String alumnoOcupacion) {
        this.alumnoOcupacion = alumnoOcupacion;
    }

    public boolean getAlumnoTrabaja() {
        return alumnoTrabaja;
    }

    public void setAlumnoTrabaja(boolean alumnoTrabaja) {
        this.alumnoTrabaja = alumnoTrabaja;
    }

    public String getAlumnoNivelFormacionPadre() {
        return alumnoNivelFormacionPadre;
    }

    public void setAlumnoNivelFormacionPadre(String alumnoNivelFormacionPadre) {
        this.alumnoNivelFormacionPadre = alumnoNivelFormacionPadre;
    }

    public String getAlumnoNivelFormacionMadre() {
        return alumnoNivelFormacionMadre;
    }

    public void setAlumnoNivelFormacionMadre(String alumnoNivelFormacionMadre) {
        this.alumnoNivelFormacionMadre = alumnoNivelFormacionMadre;
    }

    public String getAlumnoNombreContactoEmergencia() {
        return alumnoNombreContactoEmergencia;
    }

    public void setAlumnoNombreContactoEmergencia(String alumnoNombreContactoEmergencia) {
        this.alumnoNombreContactoEmergencia = alumnoNombreContactoEmergencia;
    }

    public String getAlumnoParentescoContacto() {
        return alumnoParentescoContacto;
    }

    public void setAlumnoParentescoContacto(String alumnoParentescoContacto) {
        this.alumnoParentescoContacto = alumnoParentescoContacto;
    }

    public String getAlumnoNumeroContacto() {
        return alumnoNumeroContacto;
    }

    public void setAlumnoNumeroContacto(String alumnoNumeroContacto) {
        this.alumnoNumeroContacto = alumnoNumeroContacto;
    }

    public boolean getAlumnoActivo() {
        return alumnoActivo;
    }

    public void setAlumnoActivo(boolean alumnoActivo) {
        this.alumnoActivo = alumnoActivo;
    }

    public String getAlumnoObservacion() {
        return alumnoObservacion;
    }

    public void setAlumnoObservacion(String alumnoObservacion) {
        this.alumnoObservacion = alumnoObservacion;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    public SectorEconomico getIdSecEconomico() {
        return idSecEconomico;
    }

    public void setIdSecEconomico(SectorEconomico idSecEconomico) {
        this.idSecEconomico = idSecEconomico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.demo.Alumnos[ idAlumno=" + idAlumno + " ]";
    }
    
}
