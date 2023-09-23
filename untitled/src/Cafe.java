public class Cafe extends Bebida{
    public Cafe() {
        descripcion = "Café";
        costo = 2.5;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
