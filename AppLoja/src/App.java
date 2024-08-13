public class App {
    public static void main(String[] args) {
        Loja loja = new Loja("Variedades e CIA", "Variedades", 2010);

        Vendedor v1 = loja.admitirVendedor("Matheus", 34);
        Vendedor v2 = loja.admitirVendedor("Carla", 27);

        v1.vender();
        v2.vender();

        loja.demitirVendedor(v2);
    }
}