package Colleciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollecitionGuide {

public static void main (String[] args){
    List<String> lenguajes = new ArrayList<>();
    lenguajes.add("Kotlin");
    lenguajes.add("Java");
    lenguajes.add("C#");
    lenguajes.add("Python ");
    lenguajes.add("Typescript");


    // Recorrer la lista
    for (String lenguaje :lenguajes){
        System.out.println(lenguaje);
    }

    System.out.println("Elemento java existe?" + lenguajes.contains("Java"));
    System.out.println("El elemento del indice 1"+lenguajes.get(1));
    lenguajes.set(3,"Golang");
    System.out.println("Removimiendo el ultimo lenguaje");
    lenguajes.remove(4);
}

}
