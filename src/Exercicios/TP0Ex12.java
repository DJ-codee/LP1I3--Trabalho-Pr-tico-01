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
public class TP0Ex12 {
    public static void main(String [] args){
        /*
        Douglas Juan CB301289
        12. Calcular e exibir o volume de um cone a partir dos valores da altura
        e do raio da base que serão digitados.
        */
             
    Scanner input = new Scanner(System.in);
    double altura, raio, volume;
    
        System.out.println("digite a altura:");
        altura = input.nextDouble();
        
         System.out.println("digite o raio:");
        raio = input.nextDouble();
        
        volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        
        System.out.println("o volume é" + volume);
        
    }
    
}
