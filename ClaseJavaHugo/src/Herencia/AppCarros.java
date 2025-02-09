package Herencia;

public class AppCarros {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("rojo");
        SUV suv = new SUV(true, "Azul");

        System.out.println(sedan.toString());
        System.out.println(suv.toString());
    }
}
