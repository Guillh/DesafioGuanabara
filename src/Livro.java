public class Livro implements Publicacao {
    //Atributos

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos

    public void detalhes() {
        System.out.println("Titulo.: " + getTitulo());
        System.out.println("Autor..: " + getAutor());
        System.out.println("Paginas: " + getTotPaginas());

        if (getAberto()) {
            System.out.println("Aberto!");
            System.out.println("Pagina atual: " + getPagAtual());
        } else {
            System.out.println("Fechado!");
        }

        System.out.println("Leitor: " + this.leitor.getNome());


    }

    //Setters, Getters and Constructor


    public Livro(String ti, String au, int to, Pessoa le) {
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotPaginas(to);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(le);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }

    @Override
    public void abrir() {
        if (getAberto()) {
            System.out.println("O livro ja está aberto!");
        } else {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (getAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("O livro ja está fechado!");
        }
    }

    @Override
    public void folhear() {
        this.setPagAtual(this.getPagAtual() + 10);
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
