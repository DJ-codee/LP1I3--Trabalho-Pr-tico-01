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
public class TP0Ex10 {
    public static void main(String[] args){
        
        /*
        Douglas juan CB301289
10. Entrar via teclado com o valor de uma temperatura em graus Celsius,
calcular e exibir sua temperatura equivalente em Fahrenheit.
       */

    Scanner input = new Scanner(System.in);
    double fahrenheit, celsius;
    
        System.out.println("digite a temperatura em Celsius:");
        celsius = input.nextDouble();
        
         fahrenheit = (celsius * 9/5)+ 32;
         
         System.out.println("a temperatura em  Fahrenheit será:" +  fahrenheit);
        
    
    }
}
