import java.util.Scanner;
public class Comparador2 {
        public static void main (String[]args) {
        int idade;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Digite a sua idade ");
        idade = scanner.nextInt();
        scanner.close ();
        if (idade <=15 ){
            System.out.println ("Cidadão não precisa votar");    
        } else if (idade >=16){
            System.out.println ("Cidadão tem voto facutativo");   
        } else if (idade >=18 || idade <=70){
            System.out.println ("Cidadão obrigatorio votar");
        }
    }
}
