package proyectojava.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import javaapplication1.modelo.Conexion;
//import javaapplication1.modelo.Tipo_de_habitacion;

/**
 *
 * @author Noelia
 */
public class Tipo_de_habitacionData {
    private Connection connection = null;

    public Tipo_de_habitacionData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarTipo_de_habitacion(Tipo_de_habitacion tipo_de_habitacion){
        try {
            
            String sql = "INSERT INTO tipo_de_habitacion (id_tipo_de_camas, simple, queen, kin_size) VALUES ( ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipo_de_habitacion.getId_tipo_de_camas());
            statement.setString(2, tipo_de_habitacion.getSimple());
            statement.setString(3, tipo_de_habitacion.getQueen());
            statement.setString(3, tipo_de_habitacion.getKin_size());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                tipo_de_habitacion.setId_tipo_de_camas(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id_tipo_de_habitacion luego de insertar una tipo_de_habitacion");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una tipo_de_habitacion: " + ex.getMessage());
        }
    }
    
    public List<Tipo_de_habitacion> obtenerTipo_de_habitacion(){
        List<Tipo_de_habitacion> tipo_de_habitaciones = new ArrayList<Tipo_de_habitacion>();
            

        try {
            String sql = "SELECT * FROM tipo_de_habitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Tipo_de_habitacion tipo_de_habitacion;
            while(resultSet.next()){
                tipo_de_habitacion = new Tipo_de_habitacion();
                tipo_de_habitacion.setId_tipo_de_camas(resultSet.getInt("id_tipo_de_camas"));
                tipo_de_habitacion.setSimple(resultSet.getString("habitacion simple"));
                tipo_de_habitacion.setQueen(resultSet.getString("habitacion Queen"));
                tipo_de_habitacion.setKin_size(resultSet.getString("habitacion Kin_size"));

                tipo_de_habitaciones.add(tipo_de_habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el tipo_de_habitacion: " + ex.getMessage());
        }
        
        
        return tipo_de_habitaciones;
    }
    
}
