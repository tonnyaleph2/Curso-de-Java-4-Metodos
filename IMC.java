import java.util.Scanner;

public class IMC{
  public static float IMC(float peso,float altura){
    float imc;
    imc=peso/(altura*altura);
    return imc;
  }
  
  public static void main(String[]args){
    float peso,altura,imc;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Entre com seu peso, em kilos: ");
    peso = entrada.nextFloat();
    
    System.out.print("Entre com sua altura, em metros: ");
    altura = entrada.nextFloat();
    
    imc=IMC(peso,altura);
    
    System.out.printf(" Seu IMC vale %.2f", imc);
    
  }
}

    
