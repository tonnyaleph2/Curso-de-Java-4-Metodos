public class returnTest{
  
  public static int soma(){
    return 1+1;
    
  }
  
  public static void main(String[]args){
    System.out.print("Declarando a variavel 'res_soma' e recebendo o metodo soma(): ");
    int res_soma=soma();
    System.out.println(res_soma);
    
    System.out.println("Imprimindo diretamente o resultado do return: " + soma());
        
    System.out.println("Usando em uma soma: 2 + soma() = " + (2 + soma()));
        
    System.out.println("Usando em um produto: 3 * soma() = " + (3 * soma()));
        }
}
