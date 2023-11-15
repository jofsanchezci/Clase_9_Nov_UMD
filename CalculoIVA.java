import java.util.Scanner;

public class CalculoIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = sc.nextDouble();
        sc.close();

        // Calcula el IVA al 19%
        double iva = valorCompra * 0.19;
        double totalConIVA = valorCompra + iva;

        System.out.println("Compra sin IVA: $" + valorCompra);
        System.out.println("IVA en pesos: $" + iva);
        System.out.println("Monto con el IVA: $" + totalConIVA);
    }
}
