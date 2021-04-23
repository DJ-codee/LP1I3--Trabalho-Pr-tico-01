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
public class TP0Ex18 {
    public static void main(String[] args){
    /*
        Douglas Juan CB301289
        18. Entrar via teclado com o valor de cinco produtos. Após as entradas,
        digitar um valor referente ao pagamento da somatória destes valores.
        Calcular e exibir o troco que deverá ser devolvido.
        */
    Scanner input= new Scanner(System.in);
    double p1, p2, p3, p4, p5, valor, troc, troco, entrada;
    
        System.out.println("digite o valor do primeio produto):");
        p1= input.nextDouble();
        
        System.out.println("digite o valor do segundo produto:");
        p2= input.nextDouble();
        
        System.out.println("digite o valor do terceiro produto:");
        p3= input.nextDouble();
        
         System.out.println("digite o valor do quarto produto:");
         p4= input.nextDouble();
       
        
        System.out.println("digite o valor do quinto produto:");
        p5= input.nextDouble();
        
        System.out.println("digite o valor da entrada:");
        entrada= input.nextDouble();
        valor = (p1+p2+p3+p4+p5);
       
        troc =  entrada - valor ;
        
        troco= entrada % valor;
        
        System.out.println("o valor total é" + valor);
        System.out.println("o troco será de:" + troco);
        
        
    } 
    
}
