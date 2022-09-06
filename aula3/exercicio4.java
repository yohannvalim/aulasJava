import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] a = new double[15];
        double [] b = new double [a.length];

        for (int i=0; i<a.length; i++){
            System.out.println("Digite os valores do vetor A na posicao " + (i+1));
            a[i] = scan.nextInt();
            b[i] = Math.sqrt(a[i]);
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
