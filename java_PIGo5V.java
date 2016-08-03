public class metodoTeste{
  public static void mensagem(){
    System.out.println("Estou testando exibicao por metodo");
  }
  
  public static void main(String[]args){
    System.out.println("Exibindo a mensagem uma vez: ");
    mensagem();
    
    System.out.println("Exibindo a mensagem tres vezes");
    for(int count = 1 ; count<=3 ; count++){
    mensagem();
    }
  }
}

    