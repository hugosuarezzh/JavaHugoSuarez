package Herencia;

public class SUV extends Herencia{
    boolean cuatroRuedas;

    public SUV(boolean cuatroRuedas, String color){
        super(color);
        this.cuatroRuedas = cuatroRuedas;
    }

    public String toString(){
        return "Color: " + color +
                "\nCuatro Ruedas: " + cuatroRuedas;
    }
}
