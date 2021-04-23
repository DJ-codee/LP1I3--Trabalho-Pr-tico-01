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
public class TP0Ex03 {
    public static void main (String [] args) {
        /*
        Douglas Juan 3012859
        3. Calcular e exibir a área de um quadrado a partir do valor de sua 
        diagonal que será digitado.
        */
    Scanner input = new Scanner(System.in);
    double diagonal, area;
    
        System.out.print("digite o valor da diagonal:");
        diagonal = input.nextDouble();
        
        area = (diagonal * diagonal)/2 ;
        System.out.print("a área do retângulo é:" + area);
        
}
}
