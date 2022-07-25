import java.util.Scanner;

public class DecimalToHexadecimalVersion1 {
    public static void main(String[] args) {

        //Lecture du nombre decimal à convertir
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer votre nombre decimal ====> ");
        int valDecimal =input.nextInt();

        //Nombre hexadecimal
        String valHexadecimal = Integer.toHexString(valDecimal);
        System.out.println("valeur hexadecimal ====> " + valHexadecimal);
    }
}
