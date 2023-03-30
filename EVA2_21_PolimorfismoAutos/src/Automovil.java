public class Automovil extends Vehiculo implements controldatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
    }

    public Automovil(String marca, int velocidad,String modelo, int año) {
        super(marca,velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambairvelocidad(int cambio) {
        int vel=velocidad+cambio;
        if(vel>=0)
            velocidad=vel;

    }

    @Override
    public void tablero() {
        System.out.println("Automovil");
        System.out.println("Velocdad: "+velocidad);
        System.out.println("Combustible (Pendiente)");
        System.out.println("Revoluciones: (Pendiente)");
    }
}
