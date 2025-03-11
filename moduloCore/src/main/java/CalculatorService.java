import java.util.Scanner;

public class CalculatorService {

    public void runCalculator() {
        ReadWrite readwrite = new ReadWrite();

        double[] nums = new double[2];
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double result;
        String operation;
        BasicOperationsService operations = new BasicOperationsService();

        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    nums = readwrite.readConsole();
                    operation = "sumar";
                    result = operations.Suma(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 2:
                    nums = readwrite.readConsole();
                    operation = "restar";
                    result = operations.Resta(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 3:
                    nums = readwrite.readConsole();
                    operation = "multiplicar";
                    result = operations.Multiplicacion(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 4:
                    nums = readwrite.readConsole();
                    operation = "dividir";
                    result = operations.Division(nums[0], nums[1]);
                    readwrite.printConsole(result, operation);
                    break;
                case 5:
                    System.out.println("Opción no válida. Saliendo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

}
