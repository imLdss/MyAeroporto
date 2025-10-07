import java.time.LocalDateTime;
import java.util.List;

public class VooIndireto extends Voo {

    private List<Aeroporto> aeroportosTransito;
    private boolean embarqueEmTransito;

    public VooIndireto(String nVoo, LocalDateTime horaPartida, Aeroporto destino,
                       String portaEmbarque, double custoBase,
                       CompanhiaAerea companhia, Aeronave aeronave,
                       List<Cliente> clientes, List<Aeroporto> aeroportosTransito,
                       boolean embarqueEmTransito) {
        super(nVoo, horaPartida, destino, portaEmbarque, custoBase, companhia, aeronave, clientes);
        this.aeroportosTransito = aeroportosTransito;
        this.embarqueEmTransito = embarqueEmTransito;
    }

    @Override
    public double calcularCusto() {
        double custoPorCliente = getCustoBase() + (getCustoBase() * getCompanhia().getTaxaLucro());

        if (aeroportosTransito != null) {
            for (Aeroporto a : aeroportosTransito) {
                custoPorCliente += a.getTaxaReabastecimento();
            }
        }

        return custoPorCliente * getNumeroClientes();
    }

    public List<Aeroporto> getAeroportosTransito() {
        return aeroportosTransito;
    }

    public boolean isEmbarqueEmTransito() {
        return embarqueEmTransito;
    }
}
