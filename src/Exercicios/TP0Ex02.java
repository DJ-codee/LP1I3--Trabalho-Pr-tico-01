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
public class TP0Ex02 {
    public static void main (String[] args){
    /*
        Douglas Juan CB3012859
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta 
        que será digitado.
*/
        
        Scanner input = new Scanner(System.in);
    double area, altura, base;
        System.out.print("digite a base do quadrado:");
        base = input.nextDouble();
        System.out.print("digite a altura do quadrado:");
        altura = input.nextDouble();
        area = base * altura ;
        System.out.print("a área do quadrado é:" + area);
    }
}
