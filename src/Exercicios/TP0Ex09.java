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
public class TP0Ex09 {
    public static void main (String[] args){
    /*
      Douglas Juan CB3012859
    9. Calcular e exibir a tensão de um determinado circuito eletrônico 
    a partir dos valores da resistência e corrente elétrica que serão digitados. 
     Utilize a lei de Ohm.
    */
    
    Scanner input = new Scanner(System.in);
    double v, r, i;
    
        System.out.println("digite o valor da resistência:");
        r = input.nextDouble();
        
        System.out.println("digite o valor da corrente elétrica:");
        i = input.nextDouble();
        
        v = r * i;
        
            System.out.println("a tensão é:" + v);
        
    }
    
}
