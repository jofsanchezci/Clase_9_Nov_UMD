import java.util.Scanner;

public class Operaciones {
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
            System.out.print("La suma es positivo\n");
        }
        System.out.print("La suma es: " + suma + "\n");
        double mul=numero1*numero2;
        System.out.print("La multiplicación  es: " + mul +"\n");
        double res=numero1-numero2;
        System.out.print("La resta  es: " + res +"\n");


        if(numero2==0){
            System.out.print("Erro Division por Cero\n");
        }
        else{
            double div= numero1/numero2;
            System.out.print("La division es: " + div + "\n");
        }




    }
}
