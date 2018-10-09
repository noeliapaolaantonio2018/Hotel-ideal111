package hotelilusion;

/**
 *
 * @author Noelia
 */
public class Huesped {
    private int id_huesped;
    private String nombre_apellido;
    private int numero_documento;
    private String direccion;
    private int telefono;
    private String email;

    public int getId_huesped() {
        return id_huesped;}
    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;}
    public String getNombre_apellido() {
        return nombre_apellido;}
    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;}
    public int getNumero_documento() {
        return numero_documento; }
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;}
    public String getDireccion() {
        return direccion;}
    public void setDireccion(String direccion) {
        this.direccion = direccion;}
    public int getTelefono() {
        return telefono;}
    public void setTelefono(int telefono) {
        this.telefono = telefono;}
    public String getEmail() {
        return email;}
    public void setEmail(String email) {
        this.email = email;}
     public Huesped(int id_huesped, String nombre_apellido, int numero_documento, String direccion, int telefono, String email) {
        this.id_huesped = id_huesped;
        this.nombre_apellido = nombre_apellido;
        this.numero_documento = numero_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
     
     public Huesped(String nombre_apellido, int numero_documento, String direccion, int telefono, String email) {
        this.id_huesped =-1;
        this.nombre_apellido = nombre_apellido;
        this.numero_documento = numero_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
     public Huesped(){
        this.id_huesped = -1;
    }
    
    
}
