package Livro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public void detalhes(){
        System.out.println("-----  DETALHES DO LIVRO -----");
        System.out.printf("Título: %s\nAutor: %s\nTotal de Páginas: %d\nPágina Atual: %d\nFoi Aberto: %b\nLeitor: %s\n", this.titulo, this.autor, this.totPaginas, this.pagAtual, this.aberto, this.leitor.getNome());
    }

    @Override
    public void abrir() {
        if (!this.aberto){
            this.aberto = true;
            System.out.println("Livro.Livro aberto");
        } else {
            System.out.println("Livro.Livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto){
            this.aberto = true;
            System.out.println("Livro.Livro fechado");
        } else {
            System.out.println("Livro.Livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        System.out.println("Folheando livro");
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }
}
