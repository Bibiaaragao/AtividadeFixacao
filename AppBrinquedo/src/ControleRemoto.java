public class ControleRemoto {
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }

    public void mover(){
        if (brinquedo != null){
            brinquedo.mover();
        } else {
            System.out.println("Brinquedo indisponível.");
        }
    }

    public void setBrinquedo(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }

}
