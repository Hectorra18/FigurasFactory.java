public class Circulo implements Figuras{

private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetroFigura() {

       double perimetrocir = 2 * Math.PI * radio;
        return perimetrocir;
    }

    @Override
    public double calcularAreaFigura() {

        double areacir = Math.PI * Math.pow(radio,2);

        return areacir;
    }
}
