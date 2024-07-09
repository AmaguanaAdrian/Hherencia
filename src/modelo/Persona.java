/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Persona {
    //atributos

    private int idPersona;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String fechaNacimiento;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String usuario;
    private String clave;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellidos, int telefono, String fechaNacimiento, String cedula, String direccion, String correoElectronico, String sexo, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //regla negocos
    public String imprimir() {
        return "-------DATOS PERSONA-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombre() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico() + "\n"
                + "Telefono:" + getTelefono() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Fecha de Nacimiento" + getFechaNacimiento();
    }

    //metodo de validacion cedula existente
    public void validarcedula() {
        int[] listaDigitos = new int[9];
        String cedula = this.getCedula();
        if (cedula.length() > 10) {
            System.out.println("Ingrese una cedula valida");
        } else if (cedula.length() == 10) {
            //crecion de lista por cada uno que se va generando
            for (int i = 0; i < cedula.length() - 1; i++) {
                listaDigitos[i] = cedula.charAt(i) - '0';
            }
            for (int casa : listaDigitos) {
                System.out.println(casa);
            }
        } else {
            System.out.println("Revise el numero de cedula");
        }
    }

   
}