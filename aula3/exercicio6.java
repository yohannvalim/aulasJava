import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[10];
        int [] b = new int [a.length];
        int [] c = new int [a.length];

        for (int i=0; i<a.length; i++){
            System.out.println("Digite os valores do vetor A na posicao " + (i+1));
            a[i] = scan.nextInt();
        }

        for (int i=0; i<b.length; i++){
            System.out.println("Digite os valores do vetor B na posicao " + (i+1));
            b[i] = scan.nextInt();
        }

        System.out.println("Valor do vetor C: ");
        for (int i=0; i<a.length; i++){
            c[i] = (a[i]+b[i]);
            System.out.println(c[i] + " ");
        }


    }
}
