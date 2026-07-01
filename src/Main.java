import Livro.Livro;
import Livro.Pessoa;

public class Main {
    void main() {
        Pessoa p1 = new Pessoa("Fernando", 21, "M");
        Pessoa p2 = new Pessoa("Maria", 12, "F");

        Livro l1 = new Livro("Harry Potter", "JK Rowling", 300, p1);
        Livro l2 = new Livro("O Estrangeiro", "Albert Camus", 350, p2);

        System.out.println(l2.getPagAtual());
        l2.avancarPag();
        System.out.println(l2.getPagAtual());
        l2.fechar();
        l2.abrir();
        l2.abrir();
        l2.fechar();
    }

}
