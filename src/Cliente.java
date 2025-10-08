public class Cliente implements ICliente {
    private String nome;
    private String docIdentificacao;
    private String email;

    public Cliente(String nome, String docIdentificacao, String email) {
        this.nome = nome;
        this.docIdentificacao = docIdentificacao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDocIdentificacao() {
        return docIdentificacao;
    }

    public String getEmail() {
        return email;
    }
}