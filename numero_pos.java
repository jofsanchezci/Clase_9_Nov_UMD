import java.util.Scanner;
public class numero_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        double numero = sc.nextDouble();
        sc.close();

        if (numero < 0){
        	System.out.println("El numero es Negativo");

        }
        else if(numero==0){
        	System.out.println("El numero es Cero");
        }


        else{
        	System.out.println("El numero es Positivo");
        }

        
    }
}