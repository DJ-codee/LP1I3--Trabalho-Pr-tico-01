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
public class TP0Ex04 {
    public static void main (String[] args){
       /*
        Douglas Juan CB3012859
        4. A partir dos valores da base e altura de um triângulo, calcular
        e exibir sua área.
        */
        
        Scanner input = new Scanner(System.in);
    double area, altura, base;
        System.out.print("digite a base do triângulo:");
        base = input.nextDouble();
        System.out.print("digite a altura do triângulo:");
        altura = input.nextDouble();
        area = (base * altura) /2;
        System.out.print("a área do triângulo é:" + area);
        
    }
    
}
