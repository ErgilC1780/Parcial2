public class Leche extends Decorador{
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double calcularCosto() {
        return bebida.calcularCosto() + 1;
    }
}
