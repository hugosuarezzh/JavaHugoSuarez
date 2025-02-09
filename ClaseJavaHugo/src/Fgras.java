public class Fgras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(20);
        Triangulo triangulo = new Triangulo(20,15);
        Rectangulo rectangulo = new Rectangulo(17,40);
        Cuadrado cuadrado = new Cuadrado(3);

        System.out.println("El area del Cuadrado es de: " +  cuadrado.calcularArea());
        System.out.println("El area del Circulo es de: " +  circulo.calcularArea());
        System.out.println("El area del Triangulo es de: " +  triangulo.calcularArea());
        System.out.println("El area del Rectangulo es de: " +  rectangulo.calcularArea());
    }
}
