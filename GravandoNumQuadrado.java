import java.util.Scanner;

public class quadrado{
  
  public static int quadrado(int num){
    int quadrado;
    quadrado = num*num;
    return quadrado;
  }
  public static void main(String[]args){
    int numero, numero_quadrado;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Entre com um numero inteiro");
    numero = entrada.nextInt();
    
    numero_quadrado = quadrado(numero);
    
    System.out.printf("%d elevado ao quadrado e %d",numero,numero_quadrado);
    
  }
}
