/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/**@author Alan_51540 
 * 5. Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que
efetue a leitura de um número inteiro e apresente o resultado do
quadrado deste número.
 */

import java.util.Scanner;
public class Questao_05 {
    public static void main (String[] args){
 Scanner ler=new Scanner(System.in);
        int quadrado;
        
        System.out.println("Informe um Numero");
        quadrado =ler.nextInt();
        System.out.println("O Quadra é "+Math.pow(quadrado,2));    
}}
