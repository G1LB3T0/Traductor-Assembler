import java.util.Scanner;

public class Main1 {

    // Método para convertir un número binario a decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Método para convertir un número decimal a binario
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1. Binario a Decimal");
        System.out.println("2. Decimal a Binario");
        int option = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (option) {
            case 1:
                System.out.print("Introduce el número binario: ");
                String binaryInput = scanner.nextLine();
                int decimalOutput = binaryToDecimal(binaryInput);
                System.out.println("El número decimal es: " + decimalOutput);
                break;
            case 2:
                System.out.print("Introduce el número decimal: ");
                int decimalInput = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                String binaryOutput = decimalToBinary(decimalInput);
                System.out.println("El número binario es: " + binaryOutput);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
