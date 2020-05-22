/*
 * 
 */
package Lista1;

/*@author Alan_51540
3. Faça um algoritmo com descrição narrativa e em pseudocódigo para
calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
equação: Volume = PI * raio2  altura. Implemente no software
(VISUALG).
 */
import java.util.Scanner;

public class Questao_03 {
  public static void main (String[] args){  
      
     Scanner ler = new Scanner (System.in);  
    
     double volume, pl, raio, altura;
          
     System.out.println("Digite pl");
     pl = ler.nextDouble();
     System.out.println("Digite o raio");
     raio = ler.nextDouble();
     System.out.println("Digite altura");
     altura = ler.nextDouble();
     
     volume = pl*raio*2*altura;
     System.out.println("Volume lata de oleo:"+ volume);
     
  }
}
