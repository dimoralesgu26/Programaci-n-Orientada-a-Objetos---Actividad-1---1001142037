/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooejerciciopropuesto17;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POOEjercicioPropuesto17 {

    public static void main(String[] args) {
    double radio, area_circulo, longitud_circunferencia;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" Ingresa un numero para el radio: ");
    radio = scanner.nextDouble();
    
    area_circulo = Calculos17.calcular_area_circulo(radio);
    longitud_circunferencia = Calculos17.calcular_longitud_circunferencia(radio);
    
    System.out.println(" Area circulo: " + area_circulo);
    System.out.println(" Longitud circunferencia: " + longitud_circunferencia);
    }
}
