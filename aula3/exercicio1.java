import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[5];
        int [] b = new int [a.length];

        for (int i=0; i<a.length; i++){
            System.out.println("Digite o valor do vetor A na posicao " + (i+1));
            a[i] = scan.nextInt();
            b[i]=a[i];
        }
        System.out.println("Valor de A:");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("Valor de B:");
        for (int i=0; i<b.length; i++){
            System.out.println(b[i] + " ");
        }

    }
}
