package figuras;

public class Rectangulo extends Figuras{

    private double largo;
    private double ancho;

    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return ancho*largo;
    }
}
