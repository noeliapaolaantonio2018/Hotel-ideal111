
package proyectojava.modelo;

import proyectojava.modelo.Tipo_de_habitacion;
import java.time.LocalDate;

/**
 *
 * @author Noelia
 */
public class Habitacion {
    private int id_habitacion=-1;
    private int piso;
    private Tipo_de_habitacion tiphabitacion;
    private int cant_de_camas;
    private double precio_diario;

    public Habitacion(int id_habitacion, int piso, Tipo_de_habitacion tiphabitacion, int cant_de_camas, double precio_diario) {
        this.id_habitacion = id_habitacion;
        this.piso = piso;
        this.tiphabitacion = tiphabitacion;
        this.cant_de_camas = cant_de_camas;
        this.precio_diario = precio_diario;
    }
    public Habitacion(int piso, Tipo_de_habitacion tiphabitacion,int cant_de_camas,double precio_diario) {
        this.id_habitacion = -1;
        this.piso=piso;
        this.tiphabitacion=tiphabitacion;
        this.cant_de_camas=cant_de_camas;
        this.precio_diario=precio_diario;
    }
    
    public Habitacion(){
        this.id_habitacion = -1;
    }

    public int getId_habitacion() {
        return id_habitacion; }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion; }

    public int getPiso() {
        return piso;}

    public void setPiso(int piso) {
        this.piso = piso; }

    public Tipo_de_habitacion getCaracteristicas() {
        return tiphabitacion;}

    public void setCaracteristicas(Tipo_de_habitacion tiphabitacion) {
        this.tiphabitacion = tiphabitacion; }

    public int getCant_de_camas() {
        return cant_de_camas; }

    public void setCant_de_camas(int cant_de_camas) {
        this.cant_de_camas = cant_de_camas;}

    public double getPrecio_diario() {
        return precio_diario; }

    public void setPrecio_diario(double precio_diario) {
        this.precio_diario = precio_diario;}
    
    
}
