/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Controlador.AdministrativoControlador;
import Controlador.DocenteControlador;
import Controlador.EstudianteControlador;
import Controlador.PersonaControlador;
import java.util.Scanner;
import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author USER
 */
public class main2 {
    public static void main(String[]args){
//        ArrayList<CuentaAhorros> listaCuentaAhorro = new ArrayList<>();
//        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera ejecutar:\n"
                    + "1.Crear Cuenta\n"
                    + "2.Consultar Saldo\n"
                    + "3.Imprimir Estado de Cuenta\n"
                    + "4.Depósitos\n"
                    + "5.Retiros\n"
                    + "6.Gestion de Usuarios\n"
                    + "0.Salir");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija el tipo de Cuenta que quiere Crear\n"
                        + "1.Cuenta de Ahorros\n"
                        + "2.Cuenta Corriente");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
//                        CuentaAhorros ca = new CuentaAhorros(false, monto, 1, 0, 12, 1.35);
//                        listaCuentaAhorro.add(ca);
//                        ca.imprimir();
                    } else if (sm1 == 2) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA CORRIENTE---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
//                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, 1.35);
//                        listaCuentaCorriente.add(cc);
//                        cc.imprimir();
                    }
                } else {
                    System.out.println("Ingrese una opción del menú");
                }
            } else if (op1 == 0) {
                i = 0;
            }else if (op1 == 6){
                System.out.println("Eliga la transacción a realizar\n"+
                        "1.Crear Persona\n"+
                        "2.Crear Estudiante\n"+
                        "3.Crear Administrativo\n"+
                        "4.Crear Docente");
                int mp=es.nextInt();
                if(mp==1){
                    System.out.println("Ingrese los datos informativos");
                    Persona p=new Persona();
                    es.nextLine();
                    System.out.println("Ingrese sus Nombres:");
                    p.setNombre(es.nextLine());
                    System.out.println("Ingrese sus Apellidos:");
                    p.setApellidos(es.nextLine());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    
                    PersonaControlador pc=new PersonaControlador();
                    pc.crearPersona(p);
                }else if(mp==2){
                    System.out.println("Ingrese los datos personales");
                    Persona p=new Persona();
                    System.out.println("Ingrese sus Nombres:");
                    p.setNombre(es.nextLine());
                    es.nextLine();
                    System.out.println("Ingrese sus Apellidos:");
                    p.setApellidos(es.nextLine());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc=new PersonaControlador();
                    pc.crearPersona(p);
                     System.out.println("Ingrese los siguientes datos del estudiante");
                     //Modelo
                   int idPersona = pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------"+idPersona);
                    Estudiante est=new Estudiante();
                    System.out.println("Ingrese numero de matricula:");
                    p.setNombre(es.next());
                    System.out.println("Ingrese la jornada de estudio");
                    est.setJornada(es.next());
                    est.setIdPersona(idPersona);
                    EstudianteControlador estC = new EstudianteControlador();
                    estC.crearEstudiante(est);
                   
                    
                }else if (mp == 3) {
                    System.out.println("Ingrese los siguientes datos personales");
                    //MODELO DE LA SUPER CLASE
                    Persona p = new Persona();
                    System.out.println("Ingrese sus Nombres:");
                    p.setNombre(es.nextLine());
                    es.nextLine();
                    System.out.println("Ingrese sus Apellidos:");
                    p.setApellidos(es.nextLine());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    System.out.println("Ingrese los siguientes datos Administrativos");
                    //OBTENER EL ID DE LA TABLA PERSONAS (SUPER CLASE)
                   int idPersona=pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------------"+idPersona);
                    //MODELO DE LA SUBCLASE   
                    Administrativo ad = new Administrativo();
                    System.out.println("Ingrese el cargo:");
                    ad.setCargo(es.next());
                    System.out.println("Ingrese su área de trabajo:");
                    ad.setArea(es.next());
                  
                    
                    AdministrativoControlador adC=new AdministrativoControlador();
                    adC.crearAdministrativo(ad, idPersona);

                    }else if (mp == 4) {
                    System.out.println("Ingrese los siguientes datos personales");
                    // MODELO DE LA SUPER CLASE
                    Persona p = new Persona();
                    es.nextLine();
                    System.out.println("Ingrese sus Nombres:");
                    p.setNombre(es.nextLine());
                    System.out.println("Ingrese sus Apellidos:");
                    p.setApellidos(es.nextLine());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    // CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    System.out.println("Ingrese los siguientes datos del docente");
                    // OBTENER EL ID DE LA TABLA PERSONAS (SUPER CLASE)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------------" + idPersona);
                    // MODELO DE LA SUBCLASE
                    Docente doc = new Docente();
                    System.out.println("Ingrese la especialidad:");
                    doc.setEspecialidad(es.next());
                    System.out.println("Ingrese el título:");
                    doc.setTitulo(es.next());
                    System.out.println("Ingrese el registro Senescyt:");
                    doc.setRegistroSenescyt(es.next());
                    System.out.println("Ingrese la escala salarial:");
                    doc.setEscalaSalarial(es.next());

                    DocenteControlador docC = new DocenteControlador();
                    docC.crearDocente(doc, idPersona);
               }

              
            }

        } while (i == 1);
    }
}
