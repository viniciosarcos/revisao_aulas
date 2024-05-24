import java.util.Scanner;
public class Comparador
{
  public static void main (String[]args){

    double num1,num2;
	
	  Scanner scanner = new Scanner (System.in);


	  System.out.println ("Digite o primeiro número ");
    num1 = scanner.nextDouble();
      
    System.out.println ("Digite o segundo número ");
    num2 = scanner.nextDouble();
    if (num1 > num2 ){
    System.out.println ("Número 1 é maior que Número 2");    
      }
      if (num1 < num2){
      System.out.println ("Número 1 é menor que Número 2 ");   
      }
      if(num1 == num2){
      System.out.println ("Número 1 é igual Número 2");
      }
      
      
	scanner.close ();
  }
}