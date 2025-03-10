import java.util.Scanner;

public class CalculatorService {

    public void runCalculator() {
        ReadWrite readwrite = new ReadWrite();

        double[] nums = readwrite.readConsole();

        System.out.println("Menú:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        double result;
        String operation;
        BasicOperationsService operations = new BasicOperationsService();

        do {
            switch (opcion) {
                case 1:
                    operation = "sumar";
                    result = operations.Suma(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 2:
                    operation = "restar";
                    result = operations.Resta(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 3:
                    operation = "multiplicar";
                    result = operations.Multiplicacion(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 4:
                    operation = "dividir";
                    result = operations.Division(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                default:
                    System.out.println("Opción no válida. Saliendo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

}
