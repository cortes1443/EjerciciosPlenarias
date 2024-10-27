package com.semana10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejcio110 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        leerDatos(nombres);
        System.out.println("");

        Iterator<String> iterator = nombres.iterator();

        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }

    }

    static void leerDatos(ArrayList<String> arr){
        String entrada;

        System.out.print("\nIngrese un nombre: ");
        entrada = sc.nextLine();

        while(!entrada.equals("terminar")){
            arr.add(entrada);
            System.out.print("\nIngrese un nombre: ");
            entrada = sc.nextLine();
        }
    }
}
