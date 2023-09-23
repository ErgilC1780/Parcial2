public class Canela extends Decorador{
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double calcularCosto() {
        return bebida.calcularCosto() + 0.5;
    }
}
