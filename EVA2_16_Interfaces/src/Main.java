public class Main {
    public static void main(String[] args) {
        Persona perso1 =new Persona("Carlos",19);
        perso1.imprimirdatos();
        Computadora compu1=new Computadora(50000,"Asus","Proyect","Ryzen 7");
        compu1.imprimirdatos();
    }
}
class Persona implements Mostrardatos{
    private String nombre;
    private int edad;
    public Persona() {
        this.nombre="";
        this.edad=0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}