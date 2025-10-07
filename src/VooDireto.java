import java.time.LocalDateTime;
import java.util.List;

public class VooDireto extends Voo {

    public VooDireto(String nVoo, LocalDateTime horaPartida, Aeroporto destino,
                     String portaEmbarque, double custoBase,
                     CompanhiaAerea companhia, Aeronave aeronave,
                     List<Cliente> clientes) {
        super(nVoo, horaPartida, destino, portaEmbarque, custoBase, companhia, aeronave, clientes);
    }

    @Override
    public double calcularCusto() {
        double custoPorCliente = getCustoBase() + (getCustoBase() * getCompanhia().getTaxaLucro());
        return custoPorCliente * getNumeroClientes();
    }
}
