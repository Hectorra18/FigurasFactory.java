public class FigurasFactory {

public Figuras obtenerFigura(TipoFigura tipoFigura, double... args){

    return switch (tipoFigura){
        case Circulo -> new Circulo(args[0]);
        case Rectangulo -> new Rectangulo(args[0],args[1]);
        case Triangulo -> new Triangulo(args[0],args[1],args[2]);
    };
}
}
