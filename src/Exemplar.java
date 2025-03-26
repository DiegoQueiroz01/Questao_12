public class Exemplar {
        private int tombo;
        private String titulo;
        private String autores;
        private boolean aptoEmprestimo;
        private int emprestimos;
        private static int totalDeEmprestimos = 0;

        public Exemplar(int tombo, String titulo, String autores, boolean aptoEmprestimo, int emprestimo){ //construtor da classe
            this.tombo = tombo;
            this.autores = autores;
            this.titulo = titulo;
            this.aptoEmprestimo = aptoEmprestimo;
            this.emprestimos = 0;
        }

    public int getTombo() {
        return tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public boolean isAptoEmprestimo() {
        return aptoEmprestimo;
    }

    public int getEmprestimo() {
        return emprestimos;
    }
    // habilita se o exemplar pode ser emprestado.
    public void habilitarEmprestimo(){
        this.aptoEmprestimo = true;
        System.out.println("Exemplar " + titulo + " (Tombo " + tombo + "), está apto para o empréstimo.");
    }
    // desabilita se o exemplar pode ser empretado.
    public void desabilitarEmprestimo(){
        this.aptoEmprestimo = false;
        System.out.println("Exemplar " + titulo + " (Tombo " + tombo + "), não está apto para o empréstimo.");
    }
    // mostra se um exemplar foi emprestado com sucesso ou possui falha no momento do empréstimo.
    public void registrarEmprestimo(){
        if(aptoEmprestimo){
            aptoEmprestimo = false;
            emprestimos++;
            System.out.println("Exemplar " + titulo + " (Tombo " + tombo + "), foi emprestado com sucesso.");
        }
        else{
            System.out.println("Exemplar " + titulo + " (Tombo " + tombo + "), não está apto para empréstimo no momento.");
        }
    }
    public int getEmprestimos(){
        return emprestimos;
    }
    public static int getTotalDeEmprestimos(){
        return totalDeEmprestimos;
    }
    // atualização da quantidade de empréstimo de um exemplar, em uma unidade.
    public void adicionarEmprestimo(){
        if(this.aptoEmprestimo){ 
            this.emprestimos += 1;
            // se o exemplar está apto a ser emprestado, acrescente um a quantidade de empréstimos.
        }
    }
    
}
