/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooejercicioresuelto4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class POOEjercicioResuelto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingresa un numero para la edad de Juan: ");
    double edjuan=scanner.nextDouble();
    
    double edalber = Calculos4.calcular_edalber(edjuan);
    double edana = Calculos4.calcular_edana(edjuan); 
    double edmama = Calculos4.calcular_edmama(edjuan, edalber, edana);
    System.out.println(" Juan: " + edjuan);
    System.out.println(" Alberto: " + edalber);
    System.out.println(" Ana: " + edana);
    System.out.println(" Mama: " + edmama);
    }
}

