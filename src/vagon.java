public class vagon {
    Tren tren;
    String tipo;
    int capacidad;

    public vagon(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public vagon (Tren tren, String tipo, int capacidad) {
        this.tren = tren;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "vagon{" +
                "tren=" + tren +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
