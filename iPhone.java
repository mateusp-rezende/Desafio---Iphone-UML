public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
  private int ano;
    private int bateria;

    private ListaDeContatos agenda;
    private Musicas musicaAtual;

    public iPhone(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.bateria = 100;
        this.agenda = new ListaDeContatos(); 
        System.out.println("iPhone " + modelo + " (" + ano + ") Ligado.");
    }
    
    @Override
    public void selecionarMusica(String nomeMusica) {
        this.musicaAtual = new Musicas(nomeMusica, "Artista Desconhecido", 200);
        System.out.print("🎶 [MÚSICA] Selecionada: ");
        this.musicaAtual.info();
    }
    
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            // CORREÇÃO: Usa o método getter para acessar o nome
            System.out.println("🎵 [MÚSICA] Tocando: " + musicaAtual.getNome());
        } else {
            System.out.println("🎵 [MÚSICA] Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ [MÚSICA] Pausada.");
    }
    
    @Override
    public void ligar(String nomeContato) {
        String numero = agenda.getNumero(nomeContato);
        if (numero != null) {
            System.out.println("📞 [TELEFONE] Ligando para " + nomeContato + " (" + numero + ")...");
        } else {
            System.out.println("❌ [TELEFONE] Contato " + nomeContato + " não encontrado.");
        }
    }

    @Override
    public void atender() {
        System.out.println("✅ [TELEFONE] Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("🎙️ [TELEFONE] Enviando para o Correio de Voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 [NAV] Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("➕ [NAV] Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 [NAV] Página atualizada.");
    }
    
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("15 Pro", 2023);

        System.out.println("\n--- TESTE DE FUNCIONALIDADES ---");

        
        meuIphone.agenda.adicionar("Dev Mobile", "555-0001");
        meuIphone.ligar("Dev Mobile");
        meuIphone.atender();
        
        
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        
        // Teste Navegador
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
    }
}