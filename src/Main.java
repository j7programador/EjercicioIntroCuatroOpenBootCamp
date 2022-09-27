
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroIf = scanner.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        }while(false);

        for (int numeroFor = 0; numeroFor < 4; numeroFor++) {
            System.out.println(numeroFor);

        }
        scanner.nextLine();
        String estacion = scanner.nextLine();


        switch (estacion) {
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Otoño" :
                System.out.println("Estamos en otoño");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            default:
                System.out.println("Deber ingresar una estacion");
        }


    }
}
