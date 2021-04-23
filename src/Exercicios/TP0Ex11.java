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
public class TP0Ex11 {
    public static void main(String[] args){
    /*
        Douglas Juan CB3012859
        11. A partir do diâmetro de um círculo que será digitado, calcular e 
        exibir sua área.
        */
      Scanner input = new Scanner(System.in);
      double diametro, area;
      
        System.out.println("digite o diâmetro:");
        diametro = input.nextDouble();
        
      area = (Math.PI * Math.pow(diametro,2))/4;
      
        System.out.println("a área do círculo é:" + area);
      
    
    }
}
