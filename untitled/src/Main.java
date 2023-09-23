public class Main {
    public static void main(String[] args) {
                Bebida cafeBase = new Cafe();
                Bebida cafeConLecheYChocolate = new Chocolate(new Leche(cafeBase));


                System.out.println("Descripción de la bebida personalizada: " + cafeConLecheYChocolate.getDescripcion());
                System.out.println("Costo de la bebida personalizada: Q" + cafeConLecheYChocolate.calcularCosto());
            }
        }


