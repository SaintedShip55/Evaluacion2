public class Main {
    public static void main(String[] args) {

    }
}
interface IntA{
    void A();
}
interface IntB(){
    void B();
}
interface IntC extends IntA, IntB{
    void C();
}
class Prueba implements  IntC{

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

    @Override
    public void C() {

    }
}