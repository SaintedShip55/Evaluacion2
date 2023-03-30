import java.nio.file.DirectoryIteratorException;

public class Main {
    public static void main(String[] args) {
        Persona perso1= new Persona();
        perso1.setApellido("Villa");
        perso1.setNombre("Carlos");
        perso1.setEdad(19);
        /*Direccion dire =new Direccion();
        perso1.setDireccion(dire);
        dire.setCalle("Av. Industrias");
        dire.setCiudad("Chihuahua");
        dire.setColonia("Complejo Indsutria Chihuahua");
        dire.setCP("31123");
        dire.setNumero(11101);
        dire.setEstado("Chihuahua");*/
        perso1.imprimirdatos();
    }
}
class Direccion{
    private String calle;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private int numero;

    public Direccion() {

    }

    public Direccion(String calle, String colonia, String cp, String ciudad, String estado, int numero) {
        this.calle = "-----";
        this.colonia = "-----";
        this.cp = "-----";
        this.ciudad = "------";
        this.estado = "-----";
        this.numero = 0;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCP() {
        return cp;
    }

    public void setCP(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void imprimirdatos(){
        System.out.println("Dirección");
        System.out.println(calle+" #"+numero+", "+colonia+", cp: "+cp+", "+ciudad+", "+estado);
    }
}
class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Persona() {
        this.nombre = "-----";
        this.apellido = "-----";
        this.edad = 0;
        this.direccion = null;//la direccion aun no existe
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void imprimirdatos(){
        System.out.println("Persona:");
        System.out.println(nombre +" "+apellido+", "+edad+" años");
        if(direccion==null)
            System.out.println("No hay dirección");
        else
        direccion.imprimirdatos();
    }
}