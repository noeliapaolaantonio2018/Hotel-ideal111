/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.accesobasedatos;

import proyectojava.modelo.Conexion;
import proyectojava.modelo.HuespedData;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alejo
 */
public class AccesoABaseDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/prueba", "root", "");
            HuespedData huespedData = new HuespedData(conexion);
            
            
//            Alumno alumno1 = new Alumno("Ramon", LocalDate.of(2003, 2, 15));
//            alumnoData.guardarAlumno(alumno1);
//            System.out.println("El id del alumno es: " + alumno1.getId());

            huespedData.obtenerHuspedes().forEach(huesped -> {
                System.out.println("Nombre: " + huesped.getNombre_apellido() );
            });
            
        
            
            
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
   
        
    }
    
}
