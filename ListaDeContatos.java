// Renomeei para seguir a convenção de classes Java (CamelCase)
public class ListaDeContatos {

    // Simulação de armazenamento (Estado)
    private java.util.Map<String, String> contatos;

    public ListaDeContatos() {
        this.contatos = new java.util.HashMap<>();
        // Adiciona alguns contatos de exemplo
        contatos.put("Dev Mobile", "555-0001");
        contatos.put("Minha Casa", "555-0002");
    }

    // Métodos (Comportamento)
    public void adicionar(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("✅ Contato " + nome + " adicionado.");
    }

    public void alterar(String nome, String novoNumero) {
        if (contatos.containsKey(nome)) {
            contatos.put(nome, novoNumero);
            System.out.println("✏️ Contato " + nome + " alterado.");
        }
    }

    public void excluir(String nome) {
        contatos.remove(nome);
        System.out.println("❌ Contato " + nome + " excluído.");
    }

    public void bloquear(String nome) {
        // Lógica de bloqueio real seria mais complexa, aqui é uma simulação
        System.out.println("🚫 Contato " + nome + " bloqueado.");
    }
    
    public String getNumero(String nome) {
        return contatos.get(nome);
    }
}