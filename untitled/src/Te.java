public class Te extends Bebida{
    public Te() {
        descripcion = "Té";
        costo = 1.8;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
