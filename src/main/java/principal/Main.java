package principal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char resp;
        do{
            System.out.print("Digite a temperatura em Celcius: ");
            double c = sc.nextDouble();
            double f = 9.0 *c/5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.println("Deseja repetir (s/n)");
            resp = sc.next().charAt(0);
        }while(resp !='n');




    }
}