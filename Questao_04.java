/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/* Alan_51540
 * Lista 01 questão 04
 * 
 * 4. Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que leia
dois valores para as variáveis A e B, efetue a troca dos valores de formaque a variável A passe a possuir o valor da variável B e que a variável B
passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
import java.util.Scanner;

public class Questao_04 {
public static void main(String[] args){
    
    Scanner ler = new Scanner (System.in); 
    
    int a,b,troca;
    
    System.out.println("Entre com valor A");
    a = ler.nextInt();
    System.out.println("Entre com valor B");
    b = ler.nextInt();
    
    troca = a;
    a = b;
    b = troca;
   
    System.out.println("O valor trocado de B oara A é:" + a);
    System.out.println("O valor trocado de A para B é:" + b);
    
            
            
    
}

}
