public abstract class Prodcuto {
    private double precio;
    private String nombre;
    public Prodcuto(double pecio, String nombre) {
        this.precio = pecio;
        this.nombre = nombre;
    }

    public Prodcuto() {
    }

    public double getPecio() {
        return precio;
    }

    public void setPecio(double pecio) {
        this.precio = pecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
