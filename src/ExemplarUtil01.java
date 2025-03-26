import java.util.Scanner;

public class ExemplarUtil01 {
    static final int MAX = 6; //mostra a quantidade de exemplares na biblioteca.

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Exemplar[] acervo = new Exemplar[MAX]; //array baseado na quantidade de exemplares definidos.

        for (int i = 0; i < MAX; i++){
            //entrada de tombo do exemplar.
            System.out.printf("Tombo do exemplar %d: ", i + 1); //entrada de tombo do último exemplar.
            int tombo = scanner.nextInt();

            //entrada de título e autoria do exemplar.
            System.out.printf("Título do exemplar e autoria %d: ", i + 1);
            String titulo = scanner.nextLine();
            String autoria = scanner.nextLine();

            //código que mostra se o exemplar está apto ou não para o emprestimo.
            System.out.printf("Exemplar %d apto a ser emprestado (S/N)? ", i + 1);
            boolean aptoEmprestimo = scanner.nextLine().equalsIgnoreCase("S");

            //instanciação de enésimo objeto da classe Exemplar e armazenamento de referência em enésimo índice do array
            acervo[i] = new Exemplar(tombo, titulo, autoria, aptoEmprestimo, tombo);
        }
        int opcao;
        do { //menu com opções e situaçãoes
            System.out.println("\nMenu");
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Registrar empréstimo.");
            System.out.println("2 - Exibir número total de empréstimos.");
            System.out.println("3 - Exibir exemplar com maior número de empréstimos.");
            System.out.println("4 - Encerrar aplicação.");
            opcao = scanner.nextInt();
            scanner.nextInt();

            switch (opcao){
        case 1:
                //registra se um novo exemplar for empréstado.
            System.out.println("\nRegistro de empréstimo de exemplar...");
            System.out.println("Informe o código de tombo do exemplar desejado: ");
            int tomboBuscar = scanner.nextInt();
    
            for(Exemplar exemplar : acervo){
                if(exemplar != null && exemplar.isAptoEmprestimo()){
                    exemplar.registrarEmprestimo();
                    break;
                }
            }
        case 2:
            // exibe o exemplar com mais registros de empréstimo.
            if (acervo.length > 0 && acervo[0] != null) {
                System.out.println("\nTotal de empréstimos realizados: " + acervo[0].getTotalDeEmprestimos());
            } else {
                System.out.println("\nTotal de empréstimos realizados: 0");
            }
            break;
        case 3:
            int maxEmprestimos = 0;
            for(Exemplar exemplar : acervo){
            if(exemplar.getEmprestimos() > maxEmprestimos){
                maxEmprestimos = exemplar.getEmprestimos();
            }
            System.out.println("\nExemplares com mais registros de empréstimo: ");
            for(Exemplar ex : acervo){
                if(ex.getEmprestimos() == maxEmprestimos && maxEmprestimos > 0){
                    System.out.println("- " + ex.getTitulo() + "(Tombo " + ex.getTombo() + "), com " + maxEmprestimos + " empréstimos.");
                }
            }
        }
    }
    } while (opcao != 4);
            
        scanner.close(); //fecha o fluxo de operação de
    }
}
