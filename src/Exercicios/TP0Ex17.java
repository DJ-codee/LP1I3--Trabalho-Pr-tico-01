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
public class TP0Ex17 { 
    public static void main(String[] args){
   /* 
        Douglas Juan CB3012859
        17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular 
e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
    */
     Scanner input= new Scanner(System.in);
    double x, y, potencia;
    
        System.out.println("digite o valor de X:");
        x = input.nextDouble();
        
        System.out.println("digite o valor de Y:");
        y = input.nextDouble();
        
        potencia = Math.pow( x, y);
        System.out.println("a porência vai ser:" +  potencia);
    }
}
