import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome, ramo;
    private int anoFundacao;
    private List<Vendedor> vendedores;

    public Loja(String nome, String ramo, int anoFundacao){
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedores = new ArrayList<>();
    }

    public Vendedor admitirVendedor(String nome, int idade){
        Vendedor vendedor = new Vendedor(nome, idade);
        vendedores.add(vendedor);
        System.out.println(nome + " foi admitido na loja " + this.nome + ".");
        return vendedor;
    }

    public void demitirVendedor(Vendedor vendedor){
        if(vendedores.contains(vendedor)){
            vendedores.remove(vendedor);
            System.out.println("O vendedor " + vendedor.getNome() + " foi deminitido da loja " + nome);
        } else {
            System.out.println("O vendedor informado não foi encontrado na loja.");
        }
    }

}
