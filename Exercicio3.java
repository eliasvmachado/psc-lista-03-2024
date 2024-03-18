import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor de c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Coeficientes informados incorretamente.");
            } else {
                System.out.println("Essa é uma equação de primeiro grau.");
                double raiz = -c / b;
                System.out.println("Raiz: " + raiz);
            }
            
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("Raiz: " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raízes: " + raiz1 + " e " + raiz2);
            }
        }
        scanner.close();
    }
}
