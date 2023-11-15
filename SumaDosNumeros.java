import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        sc.close();

        double suma = numero1 + numero2;
        if (suma <0){
            System.out.print("La suma es negativa\n");
        }
        else{
            System.out.print("La suma es Negativa\n");
        }

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
