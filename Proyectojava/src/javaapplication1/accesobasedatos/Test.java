/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.accesobasedatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author programador
 */
public class Test {
    public static void main(String...arg){
        String url ="jdbc:mysql://localhost/hotelideal1";
        String usuario = "root";
        String password ="";
        Connection conexion;
        PreparedStatement ps;
        
        try {
            Class.forName ("org.mariadb.jdbc.Driver");
            conexion= DriverManager.getConnection(url,usuario,password);
            // CREATE
            ps = conexion.prepareStatement("INSERT INTO huesped"
                   + " ( nombre_apellido, numero_documento, direccion, telefono, email)" 
                   + " VALUE( ? , ? , ? , ? , ? );");
                    ps.setString (1,"Brito Daniela");
                    ps.setInt(2, 23456780);
                    ps.setString(3, "falucho 880");
                    ps.setInt(4, 2345673);
                    ps.setString(5, "noly85@hotmail.com");
                    ps.executeUpdate();
                    ps.close();
                    
           // UPDATE
           ps=conexion.prepareStatement("UPDATE huesped SET activo=0");
           ps.executeUpdate();
           ps.close();
           
           //DELETE
           ps=conexion.prepareStatement("DELETE FROM huesped WHERE ID=?");
           ps.setInt(1, 2);
           ps.executeUpdate();
           ps.close();
           
           //READ
           ps=conexion.prepareStatement("SELECT * FROM huesped");
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               System.out.println("Nombre:"+rs.getString(2));
           }
           
           
           
           
           
           
           
           
                   
                    
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static PreparedStatement executeUpDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
