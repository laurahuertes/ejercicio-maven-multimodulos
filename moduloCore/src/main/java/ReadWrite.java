import java.util.Scanner;

public class ReadWrite {
    private String operation;

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double[] readConsole() {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[2];
        System.out.print("Introduce el primer número: ");
        nums[0] = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        nums[1] = scanner.nextDouble();

        return nums;
    }

    public void printConsole(double result, String operation) {
        if (operation.equalsIgnoreCase("sumar")) {
            System.out.println("El resultado de la suma es:" + result);
        }
        if (operation.equalsIgnoreCase("restar")) {
            System.out.println("El resultado de la resta es:" + result);
        }
        if (operation.equalsIgnoreCase("multiplicar")) {
            System.out.println("El resultado de la multiplicación es:" + result);
        }
        if (operation.equalsIgnoreCase("dividir")) {
            System.out.println("El resultado de la división es:" + result);
        }
    }


}
