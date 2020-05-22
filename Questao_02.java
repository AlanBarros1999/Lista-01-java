/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/* @author Alan_51540
 * Lista 01 questao 02

2. Faça um algoritmo e implemente no (VISUALG) que leia uma
temperatura em graus Centígrados e apresente a temperatura
convertida em graus Fahrenheit. A equação de conversão é: F = (9 * C +
160) / 5. Em que F é a temperatura em Fahrenheit e C é a temperatura
em Centígrados. Faça também o algoritmo em fluxograma.
 */
import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {        
    Scanner ler = new Scanner (System.in); 
        
    double centigrados;
    double fahrenheit;
    
    System.out.println("Digite a temperatura centigrados");
    centigrados = ler.nextDouble();
    
    fahrenheit = centigrados*9/5+32;
    System.out.println("Temperatuara fahrenheit:"+ fahrenheit);
    
    
        
        
    
    }  
}
