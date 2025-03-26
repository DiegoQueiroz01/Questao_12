import java.util.Scanner;

public class ExemplarUtil01 {
    static final int MAX = 6; //mostra a quantidade de exemplares na biblioteca.

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Exemplar[] acervo = new Exemplar[MAX]; //array baseado na quantidade de exemplares definidos.

        for (int i = 0; i < MAX; i++){
            //entrada de tombo do último exemplar.
            System.out.printf("Tombo do exemplar %d: ", i + 1); //entrada de tombo do último exemplar.
            int tombo = scanner.nextInt();
            scanner.nextInt();

            //entrada de título do último exemplar.
            System.out.printf("Título do exemplar %d: ", i + 1);
            String titulo = scanner.nextLine();

            //entrada de nome dos autores do último exemplar.
            System.out.printf("Autoria de exemplar %d: ", i + 1);
            String autoria = scanner.nextLine();

            //código que mostra se o exemplar está apto ou não para o emprestimo.
            System.out.printf("Exemplar %d apto a ser emprestado (S/N)? ", i + 1);
            boolean aptoEmprestimo = scanner.nextLine().equalsIgnoreCase("S");

            //instanciação de enésimo objeto da classe Exemplar e armazenamento de referência em enésimo índice do array
            acervo[i] = new Exemplar(tombo, titulo, autoria, aptoEmprestimo, tombo);
        }
        scanner.close(); //fecha o fluxo de operação de
    }
}
