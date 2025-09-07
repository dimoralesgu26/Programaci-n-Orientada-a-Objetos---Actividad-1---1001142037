/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooejerciciopropuesto14;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POOEjercicioPropuesto14 {

    public static void main(String[] args) {
    double numero, cuadrado, cubo;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" Ingresa un numero: ");
    numero = scanner.nextDouble();
    
    cuadrado = Calculos14.calcular_cuadrado(numero);
    cubo = Calculos14.calcular_cubo(numero);
    
    System.out.println(" Numero: " + numero);
    System.out.println(" Cuadrado: " + cuadrado);
    System.out.println(" Cubo: " + cubo);
    }
}
