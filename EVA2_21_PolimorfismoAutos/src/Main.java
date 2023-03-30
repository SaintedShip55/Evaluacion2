public class Main {
    public static void main(String[] args) {
        Automovil auto1=new Automovil("Volskwagen",35,"Jetta",2016);
        modificarvel(auto1, 50);
        bici bici1=new bici("Apache",20,"BMX");
        modificarvel(bici1,10);
    }
    public static void modificarvel(controldatos datos , int vel){
        datos.cambairvelocidad(vel);
        datos.tablero();
    }
}
