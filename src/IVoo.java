import java.time.LocalDateTime;
import java.util.List;

public interface IVoo {


    public abstract double calcularCusto();

    public int getNumeroClientes();

    public String getnVoo();

    public LocalDateTime getHoraPartida();

    public Aeroporto getDestino();

    public String getPortaEmbarque();

    public double getCustoBase();

    public CompanhiaAerea getCompanhia();

    public Aeronave getAeronave();

    public List<Cliente> getClientes();
}
