package com.aleja.Clase3;

import java.util.Scanner;

public class P6Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("ingrese un double:");

        double precio = scanner.nextDouble();
        System.out.println("ingrese un entero:");

        int dia_semana = scanner.nextInt();
        System.out.println("cadena ingresada:" + cadena) ;
        System.out.println("precio ingresado:" + precio);
        System.out.println("dia de la semana ingresada:" + dia_semana);

        scanner.close();


    }
}
