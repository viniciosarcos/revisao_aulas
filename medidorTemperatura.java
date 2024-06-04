import java.util.Scanner;
public class medidorTemperatura {
}
public static void main (String[]args){

int temp;

Scanner scanner = new Scanner (System.in);

System.out.println ("Digite a temperatura ");
    temp = scanner.nextInt();

    if (temp <0 ){
        System.out.println ("Cuidado! Podera nevar na sua região");    
    }
    if (temp >=0 && temp <=20 ){
    System.out.println ("Tempo frio! Possibilidade de ventos fortes");    
    }
    if (temp >=0 && temp <=20 ){
     System.out.println ("Tempo agradavel durante todo o dia");    
    }

    if (temp >=0 && temp >20 ){
    System.out.println ("Calor excessivo! Risco de insolação.");    
    }
               
    scanner.close ();

}





