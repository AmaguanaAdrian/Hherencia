/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Estudiante extends Persona {
   private int idEstudiante;
   private String numeroMatricula;
   private String jornada;
   private int idPersona;
   

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada, int idPersona) {
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada,int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo, String usuario, String clave) {
        super(idPersona, nombre, apellidos, telefono, fechaNacimiento, cedula, direccion, correoElectronico, sexo, usuario, clave);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
                "-------DATOS ESTUDIANTE-----------\n"+
                "Id Estudiante:"+getIdEstudiante()+"\n"+
                "Numero deMatricula:"+getNumeroMatricula()+"\n"+
                "Jornada:"+getJornada();
       }
}