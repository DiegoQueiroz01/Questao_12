public class Exemplar {
        private int tombo;
        private String titulo;
        private String autores;
        private boolean aptoEmprestimo;
        private int emprestimo;

        public Exemplar(int tombo, String titulo, String autores, boolean aptoEmprestimo, int emprestimo){ //construtor da classe
            this.tombo = tombo;
            this.autores = autores;
            this.titulo = titulo;
            this.aptoEmprestimo = aptoEmprestimo;
            this.emprestimo = emprestimo;
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
        return emprestimo;
    }
    // habilita se o exemplar pode ser emprestado.
    public void habilitarEmprestimo(){
        this.aptoEmprestimo = true;
    }
    // desabilita se o exemplar pode ser empretado.
    public void desabilitarEmprestimo(){
        this.aptoEmprestimo = false;
    }
    // atualização da quantidade de empréstimo de um exemplar, em uma unidade.
    public void adicionarEmprestimo(){
        if(this.aptoEmprestimo){ 
            this.emprestimo += 1;
            // se o exemplar está apto a ser emprestado, acrescente um a quantidade de empréstimos.
        }
    }
}
