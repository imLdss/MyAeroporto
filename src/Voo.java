import java.time.LocalDateTime;
import java.util.List;

public abstract class Voo {

    private String nVoo;
    private LocalDateTime horaPartida;
    private Aeroporto destino;
    private String portaEmbarque;
    private double custoBase;
    private CompanhiaAerea companhia;
    private Aeronave aeronave;
    private List<Cliente> clientes;

    public Voo(String nVoo, LocalDateTime horaPartida, Aeroporto destino,
               String portaEmbarque, double custoBase,
               CompanhiaAerea companhia, Aeronave aeronave,
               List<Cliente> clientes) {
        this.nVoo = nVoo;
        this.horaPartida = horaPartida;
        this.destino = destino;
        this.portaEmbarque = portaEmbarque;
        this.custoBase = custoBase;
        this.companhia = companhia;
        this.aeronave = aeronave;
        this.clientes = clientes;
    }

    public abstract double calcularCusto();

    public int getNumeroClientes() {
        return clientes == null ? 0 : clientes.size();
    }

    public String getnVoo() {
        return nVoo;
    }

    public LocalDateTime getHoraPartida() {
        return horaPartida;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public String getPortaEmbarque() {
        return portaEmbarque;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public CompanhiaAerea getCompanhia() {
        return companhia;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
