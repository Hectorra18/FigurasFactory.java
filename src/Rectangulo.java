public class Rectangulo implements Figuras{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetroFigura() {

       double perimetrorec = lado1 * 2 + lado2 * 2;

return perimetrorec;
    }

    @Override
    public double calcularAreaFigura() {

        double arearec = lado1*lado2;
    return arearec;

    }
}
