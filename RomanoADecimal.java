import java.util.HashMap;
import java.util.Scanner;

public class RomanoADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número romano: ");
        String numeroRomano = scanner.nextLine().toUpperCase(); // Convertir a mayúsculas
        
        int resultado = convertirRomanoADecimal(numeroRomano);
        
        if (resultado != -1) {
            System.out.println("El número decimal equivalente es: " + resultado);
        } else {
            System.out.println("Número romano no válido.");
        }
        
        scanner.close();
    }
    
    public static int convertirRomanoADecimal(String numeroRomano) {
        HashMap<Character, Integer> valores = new HashMap<>();
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);
        
        int decimal = 0;
        int prevValor = 0;
        
        for (int i = numeroRomano.length() - 1; i >= 0; i--) {
            char c = numeroRomano.charAt(i);
            int valor = valores.getOrDefault(c, -1);
            
            if (valor == -1) {
                return -1; // Número romano no válido
            }
            
            if (valor < prevValor) {
                decimal -= valor;
            } else {
                decimal += valor;
                prevValor = valor;
            }
        }
        
        return decimal;
    }
}
