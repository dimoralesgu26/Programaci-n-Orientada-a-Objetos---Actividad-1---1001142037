/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooejerciciopropuesto12;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POOEjercicioPropuesto12 {

    public static void main(String[] args) {
    double horas_laboradas, valor_hora, retencion, salario_bruto, salario_neto;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" Ingresa un numero para horas laboradas: ");
    horas_laboradas=scanner.nextDouble();
    
    System.out.println(" Ingresa un numero para valor hora: ");
    valor_hora=scanner.nextDouble();
    
    System.out.println(" Ingresa un numero para la retencion: ");
    retencion=scanner.nextDouble();
    
    salario_bruto = Calculos12.calcular_salario_bruto(horas_laboradas, valor_hora);
    retencion = Calculos12.calcular_porcentaje_retencion(retencion);
    
    double valor_retencion_fuente = Calculos12.calcular_valor_retencion_fuente(retencion, salario_bruto);
    
    salario_neto = Calculos12.calcular_salario_neto(salario_bruto, valor_retencion_fuente);

    System.out.println(" Salario bruto: " + salario_bruto);
    System.out.println(" Valor retencion en la fuente: " + valor_retencion_fuente);
    System.out.println(" Salario neto: " + salario_neto);
    }
}
