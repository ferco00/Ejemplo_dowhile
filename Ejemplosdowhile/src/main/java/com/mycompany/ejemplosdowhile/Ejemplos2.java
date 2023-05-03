/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosdowhile;

/**
 *
 * @author Luis Fernando
 */
import java.util.Scanner;

public class Ejemplos2 {

    public void Formato2() {
        Scanner entrada = new Scanner(System.in);
        int edad, cuenta, semestre, grupo = 0;
        String nombre = " ";

        do {
        System.out.println("Solo se podran guardar datos si eres mayor de edad");
        System.out.println("Cual es tu edad: ");
        edad = entrada.nextInt();

        } while (edad < 17);
                    System.out.println("Introduce tu nombre ");
            nombre = entrada.next();
            System.out.println("Introduce tu numero de cuenta ");
            cuenta = entrada.nextInt();
            System.out.println("Introduce tu semestre ");
            semestre = entrada.nextInt();
            System.out.println("Introduce tu grupo ");
            grupo = entrada.nextInt();
            System.out.println("Datos guardados");
    }

    public static void main(String[] args) {
        Ejemplos2 formato2 = new Ejemplos2();
        formato2.Formato2();
    }
}
