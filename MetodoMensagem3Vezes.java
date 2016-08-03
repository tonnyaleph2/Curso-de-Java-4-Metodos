public class returnString{
  public static String mensagem(){
    return "\n Uma mensagem qualquer";
  }
  
  public static void main(String[]args){
    System.out.println("Exibindo uma mensagem" + mensagem());
    
    System.out.println("Exibindo a mensagem 3 vezes");
    
    for( int count=1 ; count<=3 ; count++){
      
      System.out.println(mensagem());
      
    }
  }
}
