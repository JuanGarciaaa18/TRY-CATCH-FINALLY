package com.inventario.main;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;

        String message = "\n\n!Bienvenido a Bancoapp¡\n\n";

        message += "1. ¿Quieres Retirar dinero?\n";
        message += "2. ¿Quieres ingresar dinero?\n";
        message += "3. ¿Quieres transferir dinero?\n";
        System.out.println(message);

        System.out.println("Elige tu opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                int sueldo = 25000;
                System.out.print("Su sueldo actual es:" + sueldo + "\n");
                System.out.print("intruduce la cantidad de dinero que quieres retirar:");
                try {
                    String input = scanner1.nextLine();
                    int numero = Integer.parseInt(input);


                    int resultado = sueldo - numero;
                    System.out.println("te quedo " + resultado + " en la cuenta");
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un número entero válido.");
                } catch (ArithmeticException e) {
                    System.out.println("Error: No tienes los fondos suficientes.");
                } finally {

                    System.out.println("Gracias por usar el programa.");
                    scanner.close(); // Cierra el scanner
                }

                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                int sueldo1 = 25000;
                System.out.print("Su sueldo actual es:" + sueldo1 + "\n");
                System.out.print("intruduce la cantidad de dinero que quieres ingresar:");
                try {
                    String input = scanner2.nextLine();
                    int numero = Integer.parseInt(input);


                    int resultado = sueldo1 + numero;
                    System.out.println("te quedo " + resultado + " en la cuenta");
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un número entero válido.");
                } catch (ArithmeticException e) {
                    System.out.println("Error: No puedes ingresar menos de 0 pesos.");
                } finally {

                    System.out.println("Gracias por usar el programa.");
                    scanner.close(); // Cierra el scanner
                }

                break;
            case 3:

                break;


        }
    }
}

