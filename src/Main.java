import Task1.Calculator;
import Task1.Operatii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String operatie = scanner.next();

        Calculator calculator = new Calculator(5 , 10);
        calculator.setTermenUnu(2);
        calculator.setTermenDoi(5);

        if (operatie.equals(Operatii.ADUNARE.toString())) {
            System.out.println(calculator.adunare());
        } else if (Operatii.SCADERE.toString().equals(operatie)){
            System.out.println(calculator.scadere());
        } else {
            System.out.println("Valoarea introdusa invalida");
        }

//        System.out.println(calculator.adunare());
//        System.out.println(calculator.scadere());
    }
}