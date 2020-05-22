/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/*@author Alan_51540
 Lista 01 questão 01

1. Faça um algoritmo do tipo fluxograma que tendo dois números de
entrada mostre a soma, a diferença, o produto e a média aritmética
desses valores. Após, faça o algoritmo em Pseudocódigo e implemente
no (VISUALG). A tela de diálogo deve aparecer como se segue:
Entre com o primeiro número:
Entre com o segundo número:
Soma: valor
Diferença: valor
Produto: valor
Media: valor
 */

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);        
      
        
       
        System.out.println("Entre com primeiro numero");
             int n1 = ler.nextInt();
        System.out.println("Entre com segundo numero");
            int n2 = ler.nextInt();
            int diferenca = n1-n2;
            int soma = n1+n2;
            int produto = n1*n2;
            double media = soma/2;
        System.out.println("Resultado soma:" +soma);
        System.out.println("Resultado diferença:" + diferenca);
        System.out.println("Resultado produto:" + produto);
        System.out.println("Resultado media:" + media); 
               
    }
    
}
