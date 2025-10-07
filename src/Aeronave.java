public class Aeronave implements IAeronave{

    private final String fabricante;
    private final int capacidade;
    private final Modelo modelo;

    public Aeronave(String fabricante, int capacidade, Modelo modelo) {
        this.fabricante = fabricante;
        this.capacidade = capacidade;
        this.modelo = modelo;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public Modelo getModelo() {
        return modelo;
    }
}
