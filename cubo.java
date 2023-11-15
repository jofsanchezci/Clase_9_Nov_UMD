import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        double resul=numero1*numero1;
        double resul2=resul*numero1;

        System.out.print("El cuadraro del numero es: " + numero1  + resul + "\n");
        System.out.print("El cubo de un numero es : "+ resul2 + "\n");
    }
}