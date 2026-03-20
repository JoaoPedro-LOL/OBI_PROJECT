import java.util.Scanner;

public class teste {
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void preencheVetor(int[] vet) {
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
        int[] vetor = new int[1000000];
        int maiorVetor;

        preencheVetor(vetor);

        long inicio = System.nanoTime();
            maiorVetor = maiorNumVetor(vetor);
        long fim = System.nanoTime();
        //2424 N==10
        //1470 N==10
        //1681 N==10
        //1732 N==10
        //2811 N==10

        //2413 N==10
        //10591 N==100
        //23473 N==1000
        //190084 N==10000
        //1538874 N==100000
        //10262422 N==1000000


        //177236 N==10000
        //185384 N==10000
        //194493 N==10000
        //179724 N==10000
        //186838 N==10000

        //10591 N==100

        //10118164 N==10000000
        //8387132 N==10000000
        //8599090 N==10000000
        //14242049 N==10000000
        //12641142 N==10000000

        System.out.println("Tempo (ms): " + (fim - inicio));
    }
}
