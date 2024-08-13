public class Brinquedo {
    private double velocidade, aceleracao;

    public Brinquedo() {
        this.velocidade = 0.0;
        this.aceleracao = 0.0;
    }

    public void mover(){
        System.out.println("O brinquedo está movendo-se");
    }

    public void velocidade(int vel){
        this.velocidade = vel;
        System.out.println("A velocidade está em: " + this.velocidade + "Km/h.");
    }

    public void velocidade(double vel){
        this.velocidade = vel;
        System.out.println("A velocidade está em: " + this.velocidade + "Km/h.");
    }

    public void velocidade(double vel, double acel){
        this.velocidade = vel;
        this.aceleracao = acel;
        System.out.println("A velocidade está em " + this.velocidade + "Km/h. \nA aceleração está em: " + this.aceleracao);
    }
}