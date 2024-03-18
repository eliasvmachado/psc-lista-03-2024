import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o código da operação:");
        System.out.println("1-  PERÍMETRO");
        System.out.println("2-  ÀREA");
        System.out.println("3-  VOLUME");
        int operacao = scanner.nextInt();
        System.out.print("Informe o raio do círculo ou esfera: ");
        double raio = scanner.nextDouble();
        final double PI = 3.141592;
        
        switch (operacao) {
            case 1:
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2:
                double area = PI * raio * raio;
                System.out.println("Área do círculo: " + area);
                break;
            case 3:
                double volume = (4.0/3) * PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Código da operação é inválido.");
                break;
        }
        scanner.close();
    }
}
