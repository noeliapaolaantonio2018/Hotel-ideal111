
package proyectojava.modelo;

/**
 *
 * @author Noelia
 */
public class Tipo_de_habitacion {
    private int id_tipo_de_camas;
    private String simple;
    private String queen;
    private String kin_size;

    public String getSimple() {
        return simple;}
    public void setSimple(String simple) {
        this.simple = simple;}
    public String getQueen() {
        return queen;}
    public void setQueen(String queen) {
        this.queen = queen;}
    public String getKin_size() {
        return kin_size;}
    public void setKin_size(String kin_size) {
        this.kin_size = kin_size;}
    public int getId_tipo_de_camas() {
        return id_tipo_de_camas; }
    public void setId_tipo_de_camas(int id_tipo_de_camas) {
        this.id_tipo_de_camas = id_tipo_de_camas;}
    public Tipo_de_habitacion(int id_tipo_de_camas, String simple, String queen, String kin_size) {
        this.id_tipo_de_camas = id_tipo_de_camas;
        this.simple = simple;
        this.queen = queen;
        this.kin_size = kin_size; }
    
    public Tipo_de_habitacion(String simple, String queen, String kin_size) {
        this. id_tipo_de_camas=-1;
        this.simple = simple;
        this.queen = queen;
        this.kin_size = kin_size; }

 public Tipo_de_habitacion(){
        this.id_tipo_de_camas = -1;
    }
    
}
