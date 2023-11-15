import java.util.Scanner;

public class RomanoADecimal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número romano en mayúsculas (por ejemplo, 'XIV'): ");
        String numeroRomano = scanner.nextLine().toUpperCase();
        
        int numeroDecimal = convertirARomano(numeroRomano);
        
        if (numeroDecimal != -1) {
            System.out.println("El número decimal equivalente es: " + numeroDecimal);
        } else {
            System.out.println("Número romano inválido.");
        }
        
        scanner.close();
    }
    
    public static int convertirARomano(String numeroRomano) {
        int resultado = 0;
        
        for (int i = 0; i < numeroRomano.length(); i++) {
            char letra = numeroRomano.charAt(i);
            
            switch (letra) {
                case 'I':
                    resultado += 1;
                    break;
                case 'V':
                    resultado += 5;
                    break;
                case 'X':
                    resultado += 10;
                    break;
                case 'L':
                    resultado += 50;
                    break;
                case 'C':
                    resultado += 100;
                    break;
                case 'D':
                    resultado += 500;
                    break;
                case 'M':
                    resultado += 1000;
                    break;
                default:
                    return -1; // Si se encuentra un carácter no válido, retornar -1 (error).
            }
        }
        
        // Manejar casos especiales como IV, IX, XL, XC, CD, CM
        if (numeroRomano.contains("IV") || numeroRomano.contains("IX")) {
            resultado -= 2; // Restar 2 por IV o IX
        }
        if (numeroRomano.contains("XL") || numeroRomano.contains("XC")) {
            resultado -= 20; // Restar 20 por XL o XC
        }
        if (numeroRomano.contains("CD") || numeroRomano.contains("CM")) {
            resultado -= 200; // Restar 200 por CD o CM
        }
        
        return resultado;
    }
}
