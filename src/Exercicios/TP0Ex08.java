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
public class TP0Ex08 {
    public static void main (String[] args){
        
        /*
           Douglas Juan CB3012859
        8. Sabendo que uma milha marítima equivale a um mil, oitocentos 
        e cinquenta e dois metros e que um quilômetro possui mil metros, 
        fazer um programa para converter milhas marítimas em quilômetros.
       */
    Scanner input = new Scanner(System.in);
    double milha, quilometro;
        System.out.print("adicione a distãncia em milhas:");
        milha = input.nextDouble();
        
        quilometro = milha * 1.609;
        System.out.print("a distância em quilômetros será:" + quilometro);
    }
    
}
