import java.util.Scanner;
public class ExibirTabuada {
public static void main(String[] args) {

        int i,numero,total;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite valor da tabuada: ");
        numero = scanner.nextInt();
        for (i = 1; i <= 10; i++){
        total = numero * i;
        System.out.println(numero +  " x " + i + " = " + total);
       
}
}
}
    

