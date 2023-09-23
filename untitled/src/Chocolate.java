public class Chocolate extends Decorador{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double calcularCosto() {
        return bebida.calcularCosto() + 2;
    }
}
