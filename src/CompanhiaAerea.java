import java.time.LocalDateTime;

public class CompanhiaAerea implements ICompanhiaAerea {

    private final String nome;
    private final double taxaDeLucro;

    public CompanhiaAerea(String nome, double taxaDeLucro) {
        this.nome = nome;
        this.taxaDeLucro = taxaDeLucro;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getTaxadeLucro() {
        return taxaDeLucro;
    }
}
