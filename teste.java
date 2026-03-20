import java.util.Scanner;
import java.util.random.*;

public class teste {
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void preencherVetor(int[] vet) {
        for (int i = vet.length - 1; i >= 0; i--) {
            vet[i] = (int) (Math.random() * 100);
        }

    }

    public static int maiorNumVetor(int[] vet) {
        int maior = 0;
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] vetor = new int[100];
        int maiorVetor;
        preencherVetor(vetor);
        maiorVetor = maiorNumVetor(vetor);
        System.out.println(maiorVetor);

    }
}
