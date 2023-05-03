/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplosdowhile;

/**
 *
 * @author Luis Fernando
 */
import java.util.Scanner;

public class Ejemplosdowhile {

    public void Formato() {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número entre 5 y 50: ");
            num = entrada.nextInt();
        } while (num < 5 & num > 50);
        System.out.println("El número " + num + " esta dentro del limite");
    }

    public static void main(String[] args) {
        Ejemplosdowhile formato = new Ejemplosdowhile();
        formato.Formato();
    }
}
