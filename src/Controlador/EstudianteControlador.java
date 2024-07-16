/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Estudiante;

/**
 *
 * @author USER
 */
public class EstudianteControlador {
    private Estudiante estudiante;
    //CONEXION
    Conexion conexion=new Conexion();
    Connection connection=(Connection)conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearEstudiante(Estudiante es){
        try {
            String consultaSQL = "INSERT INTO estudiantes (numeroMatricula,jornada,idpersona) VALUES ('"+es.getNumeroMatricula()+"','"+es.getJornada()+"','"+es.getIdPersona()+"');";
            PreparedStatement ejecutar = (PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0){
                System.out.println("El estudiante se creo con exito ¡¡¡");
            }else{
                System.out.println("Ingrese datos validos ¡¡¡");
            }
        } catch (Exception e) {
            System.out.println("Comuniquese con el administrador");
        }
        
    }
    
    
}
