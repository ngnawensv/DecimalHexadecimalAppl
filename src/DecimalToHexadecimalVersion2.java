import java.util.Scanner;

public class DecimalToHexadecimalVersion2 {


    public static StringBuilder convertDecimalToHexadecimal(Integer valDecimal) {
        StringBuilder valHexadecimal = new StringBuilder();
        Integer restDision;
        char hexadecimalCharacter[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (valDecimal > 0) {
            restDision = valDecimal % 16;
            valHexadecimal.append(hexadecimalCharacter[restDision]);
            valDecimal = valDecimal / 16;
        }
        return valHexadecimal;
    }

    public static void main(String[] args) {
        //Lecture du nombre decimal à convertir
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer votre nombre decimal ====> ");
        int valDecimal = input.nextInt();

        //Nombre hexadecimal
        StringBuilder valHexadecimal = convertDecimalToHexadecimal(valDecimal);
        System.out.println("valeur hexadecimal ====> " + valHexadecimal.reverse());
    }
}
