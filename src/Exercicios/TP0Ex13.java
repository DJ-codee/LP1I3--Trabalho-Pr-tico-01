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
public class TP0Ex13 {
    public static void main(String[] args){
    /*
        Douglas Juan CB301289
        13. Calcular e exibir a velocidade final (em km/h) de um automóvel, 
a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do 
tempo de percurso (em s) que serão digitados.
   */
    Scanner input= new Scanner(System.in);
    double v, v0, a, t;
    
        System.out.println("digite a velocidade inicial (em m/s):");
        v0 = input.nextDouble();
        
        System.out.println("digite a aceleração (em m/s2):");
        a = input.nextDouble();
        
        System.out.println("digite o tempo(em s) :");
        t = input.nextDouble();
        // 3,6 para transfotmar s/m em km/h
        v = (v0 + a*t)* 3,6;
        System.out.println("a velocidade final é:" +  v);
        
        
    
    }
    
}
