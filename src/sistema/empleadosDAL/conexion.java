/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.empleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabi
 */
public class conexion {
    
    String strConexionDB = "jdbc:sqlite:C:/Users/Gabi/Desktop/GITHUB PROYECTOS/CRUD BASICO CON JAVA/BASE DE DATOS/Sistema.s3db";

    Connection conn = null;
    
    public conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            
            System.out.println("conexion establecida");
            
        } catch (Exception e) {
            
            System.out.println("error de conexion" + e );
        }
    }
    
}