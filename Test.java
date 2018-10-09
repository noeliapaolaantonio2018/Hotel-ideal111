/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelilusion;


import hotelilusion.modelo.HuespedData;
import java.text.ParseException;
import java.time.LocalDate,

/**
 *
 * @author agus
 */

public class HotelIlusion {
    
    public static void main(String[] args){
        
        Conexion conexion;
        
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotelilusion", "root", "");
            HuespedData huespedData = new HuespedData(conexion);
            
 //         Huesped huesped1 = new Huesped("Agustin Ligorria", 44058111, 
 //         "Jacinto Suarez 222", 26641212, agus@gmail.com);
 //         huespedData.guardarHuesped(huesped1);
 //         System.out.println("El id del huesped es: " + huesped1.getId_huesped());
 
        huespedData.obtenerHuesped().forEach(huesped -> {
            System.out.println("Nombre_apellido: " + huesped.getNombre_apellido());
        });
        
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + 
                    e.getMessage());
        }
    }
    
}