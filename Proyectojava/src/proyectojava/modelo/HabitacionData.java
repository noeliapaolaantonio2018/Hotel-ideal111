
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava.modelo;

import proyectojava.modelo.Habitacion;
import proyectojava.modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class HabitacionData {
     private Connection connection = null;
     private Conexion conexion;

    public HabitacionData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarHabitacion(Habitacion habitacion){
        try {
            
            String sql = "INSERT INTO habitacion (piso, tipohabitacion, cant_de_camas, precio_diario) VALUES ( ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, habitacion.getPiso());
            statement.setInt(2, habitacion.getCaracteristicas().getId_tipo_de_camas());
            statement.setInt(3, habitacion.getCant_de_camas());
            statement.setDouble(4, habitacion.getPrecio_diario());
            
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                habitacion.setId_habitacion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un habitacion");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un habitacion: " + ex.getMessage());
        }
    }
    
    
}
