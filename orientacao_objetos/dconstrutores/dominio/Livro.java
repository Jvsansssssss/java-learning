package dconstrutores.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int  paginas;
    private String isbn;

    public Livro(String titulo, String autor, int paginas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    public Livro(String titulo, String autor, int paginas){
        this(titulo, autor, paginas, "Indisponível");
    }

    public Livro(String titulo){
        this(titulo, "Desconhecido", 0);
    }
    public void imprime(){
        System.out.println("O nome do livro é: " + titulo);
        System.out.println("O nome do autor do livro é: " + autor);
        System.out.println("A quantidade de paginas do livro é: " + paginas);
        System.out.println("O isbn do livro é: " + isbn);

    }
}
