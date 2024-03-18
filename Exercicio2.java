import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor da compra: R$ ");
        int valorCompra = scanner.nextInt();
        System.out.print("Valor pago: R$ ");
        int valorPago = scanner.nextInt();
        
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar a compra.");
            scanner.close();
            return;
        }
        
        int troco = valorPago - valorCompra;
        System.out.println("Troco: R$ " + troco);
        
        int[] notas = {50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidadeNotas = troco / nota;
            if (quantidadeNotas > 0) {
                System.out.println("Notas de R$ " + nota + ": " + quantidadeNotas);
                troco -= quantidadeNotas * nota;
            }
        }
        scanner.close();
    }
}
