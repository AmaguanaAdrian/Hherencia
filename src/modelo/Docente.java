/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Docente extends Persona{
    //1.Atriuto propios
    private int idDocente;
    private String especialidad;
    private String titulo;
    private String registroSenescyt;
    private String escalaSalarial;
    
     public Docente() {
    }
//Atributos propios
    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

//Constructor superclase

    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial, int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo, String usuario, String clave) {
        super(idPersona, nombre, apellidos, telefono, fechaNacimiento, cedula, direccion, correoElectronico, sexo, usuario, clave);
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }
    
//Encapsulamiento

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenescyt() {
        return registroSenescyt;
    }

    public void setRegistroSenescyt(String registroSenescyt) {
        this.registroSenescyt = registroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    public String imprimir(){
        return "-------DATOS PERSONA-----------\n"+
                "Id:"+getIdPersona()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellidos:"+getApellidos()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Correo Electrónico:"+getCorreoElectronico()+"\n"+
                "Telefono:"+getTelefono()+"\n"+
                "Fecha de Nacimiento"+getFechaNacimiento()+
                "Sexo:"+getSexo()+"\n"+
                "--------DATOS DOCENTE--------\n"+
                "iId Docente:"+getIdDocente()+"\n"+
                "Especialidad:"+getEspecialidad()+"\n"+
                "Titulo:"+getTitulo()+"\n"+
                "Registro Senescyt:"+getRegistroSenescyt()+"\n"+
                "Escala Salarial:"+getEscalaSalarial();
                
    }

 
}