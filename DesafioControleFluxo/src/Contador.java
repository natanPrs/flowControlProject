import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int firstParameter = scanner.nextInt();
        System.out.println("Enter the second parameter");
        int secondParameter = scanner.nextInt();

        try {
            count(firstParameter, secondParameter);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void count(int firstParameter, int secondParameter ) throws ParametrosInvalidosException {
        if (firstParameter >= secondParameter){
            throw new ParametrosInvalidosException("Second parameter must be greater than the first.");
        }

        int subtract = secondParameter - firstParameter;
        for(int i = firstParameter; i <= secondParameter; i++){
            System.out.println("number: " + i);
        }
    }
}