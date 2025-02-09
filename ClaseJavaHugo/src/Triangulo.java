import javax.swing.plaf.PanelUI;

public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura){
     this.base = base;
     this.altura = altura;
    }
    public double calcularArea(){
        return (base * altura) / 2;
    }
}
