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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CESAR
 */
@Entity
@Table(name = "Personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p")
    , @NamedQuery(name = "Personas.findByIdPersona", query = "SELECT p FROM Personas p WHERE p.idPersona = :idPersona")
    , @NamedQuery(name = "Personas.findByPersonaIdentificacion", query = "SELECT p FROM Personas p WHERE p.personaIdentificacion = :personaIdentificacion")
    , @NamedQuery(name = "Personas.findByPersonaPrimerApellido", query = "SELECT p FROM Personas p WHERE p.personaPrimerApellido = :personaPrimerApellido")
    , @NamedQuery(name = "Personas.findByPersonaSegundoApellido", query = "SELECT p FROM Personas p WHERE p.personaSegundoApellido = :personaSegundoApellido")
    , @NamedQuery(name = "Personas.findByPersonaPrimerNombre", query = "SELECT p FROM Personas p WHERE p.personaPrimerNombre = :personaPrimerNombre")
    , @NamedQuery(name = "Personas.findByPersonaSegundoNombre", query = "SELECT p FROM Personas p WHERE p.personaSegundoNombre = :personaSegundoNombre")
    , @NamedQuery(name = "Personas.findByPersonaGenero", query = "SELECT p FROM Personas p WHERE p.personaGenero = :personaGenero")
    , @NamedQuery(name = "Personas.findByPersonaSexo", query = "SELECT p FROM Personas p WHERE p.personaSexo = :personaSexo")
    , @NamedQuery(name = "Personas.findByPersonaEstadoCivil", query = "SELECT p FROM Personas p WHERE p.personaEstadoCivil = :personaEstadoCivil")
    , @NamedQuery(name = "Personas.findByPersonaEtnia", query = "SELECT p FROM Personas p WHERE p.personaEtnia = :personaEtnia")
    , @NamedQuery(name = "Personas.findByPersonaIdiomaRaiz", query = "SELECT p FROM Personas p WHERE p.personaIdiomaRaiz = :personaIdiomaRaiz")
    , @NamedQuery(name = "Personas.findByPersonaTipoSangre", query = "SELECT p FROM Personas p WHERE p.personaTipoSangre = :personaTipoSangre")
    , @NamedQuery(name = "Personas.findByPersonaTelefono", query = "SELECT p FROM Personas p WHERE p.personaTelefono = :personaTelefono")
    , @NamedQuery(name = "Personas.findByPersonaCelular", query = "SELECT p FROM Personas p WHERE p.personaCelular = :personaCelular")
    , @NamedQuery(name = "Personas.findByPersonaCorreo", query = "SELECT p FROM Personas p WHERE p.personaCorreo = :personaCorreo")
    , @NamedQuery(name = "Personas.findByPersonaFechaRegistro", query = "SELECT p FROM Personas p WHERE p.personaFechaRegistro = :personaFechaRegistro")
    , @NamedQuery(name = "Personas.findByPersonaDiscapacidad", query = "SELECT p FROM Personas p WHERE p.personaDiscapacidad = :personaDiscapacidad")
    , @NamedQuery(name = "Personas.findByPersonaTipoDiscapacidad", query = "SELECT p FROM Personas p WHERE p.personaTipoDiscapacidad = :personaTipoDiscapacidad")
    , @NamedQuery(name = "Personas.findByPersonaPorcentaDiscapacidad", query = "SELECT p FROM Personas p WHERE p.personaPorcentaDiscapacidad = :personaPorcentaDiscapacidad")
    , @NamedQuery(name = "Personas.findByPersonaCarnetConadis", query = "SELECT p FROM Personas p WHERE p.personaCarnetConadis = :personaCarnetConadis")
    , @NamedQuery(name = "Personas.findByPersonaCallePrincipal", query = "SELECT p FROM Personas p WHERE p.personaCallePrincipal = :personaCallePrincipal")
    , @NamedQuery(name = "Personas.findByPersonaNumeroCasa", query = "SELECT p FROM Personas p WHERE p.personaNumeroCasa = :personaNumeroCasa")
    , @NamedQuery(name = "Personas.findByPersonaCalleSecundaria", query = "SELECT p FROM Personas p WHERE p.personaCalleSecundaria = :personaCalleSecundaria")
    , @NamedQuery(name = "Personas.findByPersonaReferencia", query = "SELECT p FROM Personas p WHERE p.personaReferencia = :personaReferencia")
    , @NamedQuery(name = "Personas.findByPersonaSector", query = "SELECT p FROM Personas p WHERE p.personaSector = :personaSector")
    , @NamedQuery(name = "Personas.findByPersonaIdioma", query = "SELECT p FROM Personas p WHERE p.personaIdioma = :personaIdioma")
    , @NamedQuery(name = "Personas.findByPersonaTipoResidencia", query = "SELECT p FROM Personas p WHERE p.personaTipoResidencia = :personaTipoResidencia")
    , @NamedQuery(name = "Personas.findByPersonaFechaNacimiento", query = "SELECT p FROM Personas p WHERE p.personaFechaNacimiento = :personaFechaNacimiento")
    , @NamedQuery(name = "Personas.findByPersonaActiva", query = "SELECT p FROM Personas p WHERE p.personaActiva = :personaActiva")
    , @NamedQuery(name = "Personas.findByPersonaCategoriaMigratoria", query = "SELECT p FROM Personas p WHERE p.personaCategoriaMigratoria = :personaCategoriaMigratoria")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Lob
    @Column(name = "persona_foto")
    private byte[] personaFoto;
    @Size(max = 20)
    @Column(name = "persona_identificacion")
    private String personaIdentificacion;
    @Size(max = 25)
    @Column(name = "persona_primer_apellido")
    private String personaPrimerApellido;
    @Size(max = 25)
    @Column(name = "persona_segundo_apellido")
    private String personaSegundoApellido;
    @Size(max = 25)
    @Column(name = "persona_primer_nombre")
    private String personaPrimerNombre;
    @Size(max = 25)
    @Column(name = "persona_segundo_nombre")
    private String personaSegundoNombre;
    @Size(max = 10)
    @Column(name = "persona_genero")
    private String personaGenero;
    @Size(max = 10)
    @Column(name = "persona_sexo")
    private String personaSexo;
    @Size(max = 30)
    @Column(name = "persona_estado_civil")
    private String personaEstadoCivil;
    @Size(max = 50)
    @Column(name = "persona_etnia")
    private String personaEtnia;
    @Size(max = 30)
    @Column(name = "persona_idioma_raiz")
    private String personaIdiomaRaiz;
    @Size(max = 5)
    @Column(name = "persona_tipo_sangre")
    private String personaTipoSangre;
    @Size(max = 40)
    @Column(name = "persona_telefono")
    private String personaTelefono;
    @Size(max = 40)
    @Column(name = "persona_celular")
    private String personaCelular;
    @Size(max = 50)
    @Column(name = "persona_correo")
    private String personaCorreo;
    @Column(name = "persona_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date personaFechaRegistro;
    @Column(name = "persona_discapacidad")
    private Boolean personaDiscapacidad;
    @Size(max = 20)
    @Column(name = "persona_tipo_discapacidad")
    private String personaTipoDiscapacidad;
    @Column(name = "persona_porcenta_discapacidad")
    private Integer personaPorcentaDiscapacidad;
    @Size(max = 20)
    @Column(name = "persona_carnet_conadis")
    private String personaCarnetConadis;
    @Size(max = 200)
    @Column(name = "persona_calle_principal")
    private String personaCallePrincipal;
    @Size(max = 10)
    @Column(name = "persona_numero_casa")
    private String personaNumeroCasa;
    @Size(max = 200)
    @Column(name = "persona_calle_secundaria")
    private String personaCalleSecundaria;
    @Size(max = 200)
    @Column(name = "persona_referencia")
    private String personaReferencia;
    @Size(max = 200)
    @Column(name = "persona_sector")
    private String personaSector;
    @Size(max = 50)
    @Column(name = "persona_idioma")
    private String personaIdioma;
    @Size(max = 30)
    @Column(name = "persona_tipo_residencia")
    private String personaTipoResidencia;
    @Column(name = "persona_fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date personaFechaNacimiento;
    @Column(name = "persona_activa")
    private Boolean personaActiva;
    @Size(max = 50)
    @Column(name = "persona_categoria_migratoria")
    private String personaCategoriaMigratoria;
    @JoinColumn(name = "id_lugar_natal", referencedColumnName = "id_lugar")
    @ManyToOne
    private Lugares idLugarNatal;
    @JoinColumn(name = "id_lugar_residencia", referencedColumnName = "id_lugar")
    @ManyToOne
    private Lugares idLugarResidencia;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas1")
    private Personas personas;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Docentes docentes;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Alumnos alumnos;

    public Personas() {
    }

    public Personas(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public byte[] getPersonaFoto() {
        return personaFoto;
    }

    public void setPersonaFoto(byte[] personaFoto) {
        this.personaFoto = personaFoto;
    }

    public String getPersonaIdentificacion() {
        return personaIdentificacion;
    }

    public void setPersonaIdentificacion(String personaIdentificacion) {
        this.personaIdentificacion = personaIdentificacion;
    }

    public String getPersonaPrimerApellido() {
        return personaPrimerApellido;
    }

    public void setPersonaPrimerApellido(String personaPrimerApellido) {
        this.personaPrimerApellido = personaPrimerApellido;
    }

    public String getPersonaSegundoApellido() {
        return personaSegundoApellido;
    }

    public void setPersonaSegundoApellido(String personaSegundoApellido) {
        this.personaSegundoApellido = personaSegundoApellido;
    }

    public String getPersonaPrimerNombre() {
        return personaPrimerNombre;
    }

    public void setPersonaPrimerNombre(String personaPrimerNombre) {
        this.personaPrimerNombre = personaPrimerNombre;
    }

    public String getPersonaSegundoNombre() {
        return personaSegundoNombre;
    }

    public void setPersonaSegundoNombre(String personaSegundoNombre) {
        this.personaSegundoNombre = personaSegundoNombre;
    }

    public String getPersonaGenero() {
        return personaGenero;
    }

    public void setPersonaGenero(String personaGenero) {
        this.personaGenero = personaGenero;
    }

    public String getPersonaSexo() {
        return personaSexo;
    }

    public void setPersonaSexo(String personaSexo) {
        this.personaSexo = personaSexo;
    }

    public String getPersonaEstadoCivil() {
        return personaEstadoCivil;
    }

    public void setPersonaEstadoCivil(String personaEstadoCivil) {
        this.personaEstadoCivil = personaEstadoCivil;
    }

    public String getPersonaEtnia() {
        return personaEtnia;
    }

    public void setPersonaEtnia(String personaEtnia) {
        this.personaEtnia = personaEtnia;
    }

    public String getPersonaIdiomaRaiz() {
        return personaIdiomaRaiz;
    }

    public void setPersonaIdiomaRaiz(String personaIdiomaRaiz) {
        this.personaIdiomaRaiz = personaIdiomaRaiz;
    }

    public String getPersonaTipoSangre() {
        return personaTipoSangre;
    }

    public void setPersonaTipoSangre(String personaTipoSangre) {
        this.personaTipoSangre = personaTipoSangre;
    }

    public String getPersonaTelefono() {
        return personaTelefono;
    }

    public void setPersonaTelefono(String personaTelefono) {
        this.personaTelefono = personaTelefono;
    }

    public String getPersonaCelular() {
        return personaCelular;
    }

    public void setPersonaCelular(String personaCelular) {
        this.personaCelular = personaCelular;
    }

    public String getPersonaCorreo() {
        return personaCorreo;
    }

    public void setPersonaCorreo(String personaCorreo) {
        this.personaCorreo = personaCorreo;
    }

    public Date getPersonaFechaRegistro() {
        return personaFechaRegistro;
    }

    public void setPersonaFechaRegistro(Date personaFechaRegistro) {
        this.personaFechaRegistro = personaFechaRegistro;
    }

    public Boolean getPersonaDiscapacidad() {
        return personaDiscapacidad;
    }

    public void setPersonaDiscapacidad(Boolean personaDiscapacidad) {
        this.personaDiscapacidad = personaDiscapacidad;
    }

    public String getPersonaTipoDiscapacidad() {
        return personaTipoDiscapacidad;
    }

    public void setPersonaTipoDiscapacidad(String personaTipoDiscapacidad) {
        this.personaTipoDiscapacidad = personaTipoDiscapacidad;
    }

    public Integer getPersonaPorcentaDiscapacidad() {
        return personaPorcentaDiscapacidad;
    }

    public void setPersonaPorcentaDiscapacidad(Integer personaPorcentaDiscapacidad) {
        this.personaPorcentaDiscapacidad = personaPorcentaDiscapacidad;
    }

    public String getPersonaCarnetConadis() {
        return personaCarnetConadis;
    }

    public void setPersonaCarnetConadis(String personaCarnetConadis) {
        this.personaCarnetConadis = personaCarnetConadis;
    }

    public String getPersonaCallePrincipal() {
        return personaCallePrincipal;
    }

    public void setPersonaCallePrincipal(String personaCallePrincipal) {
        this.personaCallePrincipal = personaCallePrincipal;
    }

    public String getPersonaNumeroCasa() {
        return personaNumeroCasa;
    }

    public void setPersonaNumeroCasa(String personaNumeroCasa) {
        this.personaNumeroCasa = personaNumeroCasa;
    }

    public String getPersonaCalleSecundaria() {
        return personaCalleSecundaria;
    }

    public void setPersonaCalleSecundaria(String personaCalleSecundaria) {
        this.personaCalleSecundaria = personaCalleSecundaria;
    }

    public String getPersonaReferencia() {
        return personaReferencia;
    }

    public void setPersonaReferencia(String personaReferencia) {
        this.personaReferencia = personaReferencia;
    }

    public String getPersonaSector() {
        return personaSector;
    }

    public void setPersonaSector(String personaSector) {
        this.personaSector = personaSector;
    }

    public String getPersonaIdioma() {
        return personaIdioma;
    }

    public void setPersonaIdioma(String personaIdioma) {
        this.personaIdioma = personaIdioma;
    }

    public String getPersonaTipoResidencia() {
        return personaTipoResidencia;
    }

    public void setPersonaTipoResidencia(String personaTipoResidencia) {
        this.personaTipoResidencia = personaTipoResidencia;
    }

    public Date getPersonaFechaNacimiento() {
        return personaFechaNacimiento;
    }

    public void setPersonaFechaNacimiento(Date personaFechaNacimiento) {
        this.personaFechaNacimiento = personaFechaNacimiento;
    }

    public Boolean getPersonaActiva() {
        return personaActiva;
    }

    public void setPersonaActiva(Boolean personaActiva) {
        this.personaActiva = personaActiva;
    }

    public String getPersonaCategoriaMigratoria() {
        return personaCategoriaMigratoria;
    }

    public void setPersonaCategoriaMigratoria(String personaCategoriaMigratoria) {
        this.personaCategoriaMigratoria = personaCategoriaMigratoria;
    }

    public Lugares getIdLugarNatal() {
        return idLugarNatal;
    }

    public void setIdLugarNatal(Lugares idLugarNatal) {
        this.idLugarNatal = idLugarNatal;
    }

    public Lugares getIdLugarResidencia() {
        return idLugarResidencia;
    }

    public void setIdLugarResidencia(Lugares idLugarResidencia) {
        this.idLugarResidencia = idLugarResidencia;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public Personas getPersonas1() {
        return personas1;
    }

    public void setPersonas1(Personas personas1) {
        this.personas1 = personas1;
    }

    public Docentes getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes = docentes;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.demo.Personas[ idPersona=" + idPersona + " ]";
    }
    
}
