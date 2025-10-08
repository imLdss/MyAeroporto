public class Modelo implements IModelo {
    private String modelo;
    private int capacidade;
    private int autonomia;
    private String fabricante;

    public Modelo(String modelo, int capacidade, int autonomia, String fabricante) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.autonomia = autonomia;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public String getFabricante() {
        return fabricante;
    }
}