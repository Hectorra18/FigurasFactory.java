import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;

   do {
       FigurasFactory figurasFactory = new FigurasFactory();
       Scanner scan = new Scanner(System.in);

       System.out.println("Seleccione el tipo de figura:\n1: Triangulo.\n2: " + "Rectangulo.\n3: Circulo. " + "\n4: Salir del programa.");
       int tipo = scan.nextInt();
       switch (tipo) {
           case 1 -> {
               System.out.println("Inserta la longitud del primer lado:");
               double lado1= scan.nextDouble();
               System.out.println("Inserta la longitud del segundo lado:");
               double lado2= scan.nextDouble();
               System.out.println("Inserta la longitud del tercer lado:");
               double lado3= scan.nextDouble();
               Figuras figuras = figurasFactory.obtenerFigura(TipoFigura.Triangulo,lado1,lado2,lado3);
               System.out.println("El perimetro del triangulo es: " + figuras.calcularPerimetroFigura());
               System.out.println("El area del triangulo es: " + figuras.calcularAreaFigura() + "\n");


           }
           case 2 -> {

               System.out.println("Inserta la longitud del primer lado:");
               double lado1 = scan.nextDouble();
               System.out.println("Inserta la longitud del segundo lado:");
               double lado2 = scan.nextDouble();
               Figuras figuras = figurasFactory.obtenerFigura(TipoFigura.Rectangulo,lado1,lado2);
               System.out.println("El perimetro del rectangulo es: " + figuras.calcularPerimetroFigura());
               System.out.println("El area del rectangulo es: " + figuras.calcularAreaFigura() + "\n");
           }
           case 3 -> {

               System.out.println("Inserta el radio del circulo:");
               double radio = scan.nextDouble();
               Figuras figuras = figurasFactory.obtenerFigura(TipoFigura.Circulo,radio);
               System.out.println("El perimetro del circulo es: " + figuras.calcularPerimetroFigura());
               System.out.println("El area del circulo es: " + figuras.calcularAreaFigura() + "\n");
   }
           case 4 -> {
               System.out.println("Saliendo del sistema");
               continuar = false;
            }


            }

     }while (continuar);
   }
}
