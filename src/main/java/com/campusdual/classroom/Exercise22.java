package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {


    //metodo para crear una coleccion de tipo lista, se inicializa como ArrayList
    public static List<String> createArrayList() {

            List<String> customList = new ArrayList<>();
            customList.add("GKFFD");
            customList.add("TNANA");
            customList.add("MPMSL");
            customList.add("PSWME");
            customList.add("LZMLF");
            customList.add("JYEBV");
            customList.add("YELNT");
            customList.add("JSNKR");
            customList.add("JFESF");
            customList.add("TMJLL");

            return customList;
    }

    //se imprime por consola los elementos de la lista y la posicion de cada elemento
    public static void printElementsAndIndex(List<String> customList) {
        //recorremos la lista
        for(String s : customList){
            System.out.println(s + " se encuentra en la posicion: " + customList.indexOf(s));
        }

    }

    //metodo para añadir un elemento a la lista
    public static boolean addElementToList(List<String> customList, String element) {

        if(customList.add(element)){
            System.out.println("Nuevo elemento añadido.");
            return true;
        } else {
            System.out.println("No se pudo añadir el nuevo elemento.");
            return false;
        }


    }

    public static void main(String[] args) {

        //creamos una coleccion de tipo lista y la almacenamos en myList
        List<String> myList = createArrayList();

        //añadimos un nuevo elemento en myList
        addElementToList(myList, "AAAAA");

        //mostramos por consola myList
        printElementsAndIndex(myList);


    }


}
