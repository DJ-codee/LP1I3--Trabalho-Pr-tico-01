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
public class TP0Ex06 {
    public static void main (String[] args){
        /*
        Douglas juan CB3012859
       6. Calcular e exibir a média aritmética de quatro valores quaisquer 
        que serão digitados.
        */
    Scanner input = new Scanner(System.in);
    double valor1, valor2, valor3, valor4, media;
        System.out.print("digita a primeiro valor:");
        valor1 = input.nextDouble();
        
        System.out.print("digita a segundo valor:");
        valor2 = input.nextDouble();
        
        System.out.print("digita a terceiro valor:");
        valor3 = input.nextDouble();
        
       System.out.print("digita a quarto valor:");
        valor4 = input.nextDouble();
        
        media = (valor1 + valor2 + valor3 + valor4)/4;
        
        System.out.print("sua media é:" + media);
    }   
        
}
