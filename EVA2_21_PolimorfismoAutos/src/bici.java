public class bici extends Vehiculo implements controldatos{
    private String tipo;

    public bici() {
        super();
    }

    public bici(String marca,int velocidad,String tipo) {
        super(marca,velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambairvelocidad(int cambio) {
        int vel=velocidad+cambio;
        if(vel>=0)
            velocidad=vel;
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta");
        System.out.println("Velocdad: "+velocidad);
    }
}
