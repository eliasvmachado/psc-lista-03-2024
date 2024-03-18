import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);
        
        int sorteado = random.nextInt(maior - menor + 1) + menor;
        System.out.println("O número sorteado foi: " + sorteado);
        
        if (sorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        scanner.close();
    }
}
