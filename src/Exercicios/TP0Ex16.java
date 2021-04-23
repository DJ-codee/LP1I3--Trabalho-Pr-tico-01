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
public class TP0Ex16 {
    public static void main(String[] args){
  /* 
        Douglas Juan CB3012859
        Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
    */
    Scanner input = new Scanner(System.in);
    double grau, seno, cosseno, tangente;
          
          System.out.println("digite o valor do ângulo em graus:");
          grau= input.nextDouble();
    
           seno = Math.sin(grau);
            cosseno = Math.cos(grau);
            tangente = Math.tan(grau);
             
             System.out.println("o valor e seno é:" + seno);
             System.out.println("o valor de cosseno é:" + cosseno);
             System.out.println("e o valor de tangente é:" + tangente );
            
  
    }
    
}
