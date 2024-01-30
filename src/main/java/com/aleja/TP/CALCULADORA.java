package com.aleja.TP;

import java.util.Scanner;

public class Mainjava {
    public static void main(String[] args); {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        for (int i = 0; i < 5; i++) {
            System.out.print("PRIMER VALOR: ");
            int valor1 = 10 ;
            System.out.print("SEGUNDO VALOR");
            int valor2 = 30;
            System.out.print("OPERACIÒN (+, - , *, /):");
            char operacion = scanner.next().charAt(0);
            int resultado = 0;
            boolean operacionvalida= true;

            switch (operacion) {
                case '+':
                    resultado = calculadora.suma(valor1,valor2);
                break;
                case '-':
                    resultado = calculadora.resta(valor1,valor2);
                case '*':
                        resultado = calculadora.multiplicacion(valor1,valor2);
                                break;
                case'/':
                    resultado = calculadora.division(valor1,valor2);
                    break;
                default:
                    operacionvalida = false;
                    System.out.println("operacion no valida");
                    break;
            }

            if (operacionvalida) {
                System.out.println("Resultado:" + resultado);
                if (resultado < 0) {
                    System.out.println("Tenè cuidado, el resultado es negativo");
                } else if (resultado >= 0 && resultado < 10000) {
                    System.out.println("Resultado dentro de los limites");
                } else {
                    System.out.println("error, resultado muy grande");
                    System.out.println("-----------------");
                    scanner.close();

            }
            }
        }
    }
}
class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }
    public int multiplicacion(int a, int b) {
        return a * b;

    }
    public int division(int a, int b){
        if (b != 0) {
            return a / b;
        }else{
        System.out.println("error: division por cero");
        return 0;
        }

    }
}
