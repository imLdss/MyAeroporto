public class Aeroporto implements IAeroporto{

    private double taxaReabastecimento;
    private String codigo;
    private final String localizacao;
    private final String nome;

    public Aeroporto(String codigo,String nome,String localizacao,double taxaReabastecimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
        this.taxaReabastecimento = taxaReabastecimento;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public double getTaxaReabastecimento() {
        return taxaReabastecimento;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
