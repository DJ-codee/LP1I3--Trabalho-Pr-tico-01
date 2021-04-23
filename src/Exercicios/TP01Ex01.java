/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author dougl
 */
public class TP01Ex01 {
    public static void main (String [] args) {
    /* Douglas Juan CB3012859
        1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
        */
        Scanner input = new Scanner(System.in);
    double base, altura, area;
    
        System.out.print("digite o valor da base:");
        base = input.nextDouble();
        System.out.print("digite o valor da altura:");
        altura = input.nextDouble();
        
        area = base * altura;
        System.out.print("a área do retângulo é:" + area);
        
        
        
    
    }
}
