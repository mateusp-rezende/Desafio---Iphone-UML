public class Musicas {
    
    private String arquivoMusica;
    private String nome; 
    private String autor;
    private int duracaoEmSegundos;

  
    public Musicas(String nome, String autor, int duracao) {
        this.nome = nome;
        this.autor = autor;
        this.duracaoEmSegundos = duracao;
        this.arquivoMusica = "path/to/" + nome + ".mp3";
    }

    
    public String getNome() {
        return nome;
    }
    
    public void info() {
        System.out.println("Música: " + nome + " | Autor: " + autor);
    }
}