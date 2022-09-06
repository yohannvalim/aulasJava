import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[4];
        int [] b = new int [a.length];

        for (int i=0; i<a.length; i++){
            System.out.println("Digite os valores do vetor A na posicao " + (i+1));
            a[i] = scan.nextInt();
            b[i] = (a[i]+i);
        }

        System.out.println("Valor do vetor A: ");
        for (int i=0; i<a.length; i++){
            System.out.println (a[i] + " ");
        }

        System.out.println("Valor do vetor B: ");
        for (int i=0; i<b.length; i++){
            System.out.println(b[i] + " ");
        }
    }
}
