import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número (entre 1 y 9): ");
        int numero = sc.nextInt();
        sc.close();

        if (numero >= 1 && numero <= 9) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número ingresado está fuera del rango permitido (1 a 9).");
        }
    }
}
