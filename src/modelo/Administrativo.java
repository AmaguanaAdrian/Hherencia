/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Administrativo extends Persona {

    private int idAdministrativo;
    private String cargo;
    private String area;
    

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area) {
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo, String usuario, String clave) {
        super(idPersona, nombre, apellidos, telefono, fechaNacimiento, cedula, direccion, correoElectronico, sexo, usuario, clave);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }

  
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String imprimir() {
        return "-------DATOS PERSONALES-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombre() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico()+ "\n"
                +"Fecha Nacimiento:"+getFechaNacimiento()+ "\n"
                +"Sexo:"+getSexo()+ "\n"
                +"Teléfono:"+getTelefono()+ "\n"
                +"-------DATOS ADMINISTRATIVOS------"+ "\n"
                +"Id Administrativo:"+getIdAdministrativo()+ "\n"
                +"Cargo:"+getCargo()+ "\n"
                +"Área:"+getArea();

    }
    
}