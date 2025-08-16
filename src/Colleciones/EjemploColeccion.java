package Colleciones;
import java.util.ArrayList;
import java.util.Collection;

public class EjemploColeccion {

    public static void main(String[] args){
        Collection<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        System.out.println("Tamaño: " + colores.size()); // Salida: 2
    }

}
