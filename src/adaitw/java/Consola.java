package adaitw.java;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Consola {
    private static final Scanner scanner;

    private Consola() {
    }
    public static String verificarVendedor(String prompt){
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^V[0-9\\s]+"); result = scanner.next()) {
            System.out.print("ACCESO DENEGADO: intente nuevamente  ");
        }

        return result;
    }

    public static String validarId(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^V[0-9\\s]+"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente:  ");
        }

        return result;
    }

    public static String validarOp(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^OP[0-9\\s]+"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente:  ");
        }

        return result;
    }

    public static String validarNombreVendedor(String prompt) {
        String result;
        for(result = scanner.nextLine(); !result.matches("^[a-zA-Z\\s]+"); result = scanner.nextLine()) {
            System.out.print(prompt);
        }

        return result;
    }


    public static int validateInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);

            while(!scanner.hasNextInt()) {
                System.out.print(prompt);
                scanner.next();
            }

            input = scanner.nextInt();
        } while(input < min || input > max);

        return input;
    }

    public static String validarNewCall(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.equals("true") && !result.equals("false"); result = scanner.next()) {
            System.out.print(prompt);
        }

        return result;
    }

    public static String validarPrecioReferencia(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.equals("true") && !result.equals("false"); result = scanner.next()) {
            System.out.print(prompt);
        }

        return result;
    }

    public static String validarEmail(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente: ");
        }

        return result;
    }

    public static String validarTel(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^\\d{10}$"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente: ");
        }

        return result;
    }

    public static String validarComentario(String prompt) {
        String result;
        for(result = scanner.nextLine(); !result.matches("^[a-zA-Z0-9+_.@$\\s]+"); result = scanner.nextLine()) {
            System.out.print(prompt);
        }

        return result;
    }

    public static String validarFecha(String prompt) {
        String result = null;
        boolean isValid = false;

        while(!isValid) {
            try {
                System.out.print(prompt);
                result = scanner.next();
                LocalDate valDate = LocalDate.parse(result);
                if (valDate.isBefore(LocalDate.now())) {
                    isValid = true;
                } else {
                    System.out.println("Fecha posterior a HOY! Ingrese Fecha nuevamente : ");
                }
            } catch (DateTimeParseException var5) {
                System.out.println("Formato erróneo!(yyyy-mm-dd)");
                isValid = false;
            }
        }

        return result;
    }


    static {
        scanner = new Scanner(System.in);
    }


}


/*public static int validateInt(String prompt) {
        System.out.print(prompt);

        while(!scanner.hasNextInt()) {
            System.out.print(prompt);
            scanner.next();
        }

        int input = scanner.nextInt();
        return input;
    }*/