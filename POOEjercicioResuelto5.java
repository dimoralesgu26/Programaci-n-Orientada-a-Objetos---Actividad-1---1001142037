/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooejercicioresuelto5;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POOEjercicioResuelto5 {
    public static void main(String[] args) {
    double suma, x, y;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingresa un numero para suma: ");
    suma=scanner.nextDouble();
    System.out.println("Ingresa un numero para x: ");
    x=scanner.nextDouble();
    System.out.println("Ingresa un numero para y: ");
    y=scanner.nextDouble();
    
    suma=Calculos5.calcular_suma(suma, x);
    x=Calculos5.calcular_x(x, y);
    suma = suma + (x/y);
    
    System.out.println(" El valor de la suma es: " + suma);
    
    }
}
