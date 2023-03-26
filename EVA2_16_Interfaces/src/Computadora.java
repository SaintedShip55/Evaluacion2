public class Computadora extends Prodcuto implements Mostrardatos{
    private String marca;
    private String procesador;

    public Computadora(){

    }
    public Computadora(double precio, String nombre, String marca, String procesador) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPecio());
        System.out.println("Marca: "+marca);
        System.out.println("Procesador: "+procesador);
    }
}
