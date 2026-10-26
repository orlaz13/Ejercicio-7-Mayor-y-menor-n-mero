import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int mayor = 0;
        int menor = 0;
        int contador = 1;
        while (contador <= 10) {
            System.out.print("Ingrese el numero " + contador + ": ");
            numero = sc.nextInt();
            if (contador == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            contador = contador + 1;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}