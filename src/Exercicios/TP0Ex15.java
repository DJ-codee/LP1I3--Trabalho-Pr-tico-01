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
public class TP0Ex15 {
    public static void main (String[] args){
        
        /*
        Douglas Juan CB3012859
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
    */
         
    Scanner input= new Scanner(System.in);
    double dolar, real;
    
        System.out.println("digite o valor em dólar:");
        dolar = input.nextDouble();
        
        real= dolar * 5.50
        System.out.println("valor em Reais:" +  real);
        
}
        
        

}
