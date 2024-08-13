public class AppBrinquedo {
        public static void main(String[] args) {
                Brinquedo caminhao = new Caminhao();
                Brinquedo helicoptero = new Helicoptero();
                Brinquedo navio = new Navio();

                ControleRemoto controleRemoto = new ControleRemoto(caminhao);

                controleRemoto.mover();
                caminhao.velocidade(30);
                caminhao.velocidade(45.3);
                caminhao.velocidade(70.2, 12.3);

                controleRemoto.setBrinquedo(helicoptero);
                controleRemoto.mover();
                helicoptero.velocidade(48);
                helicoptero.velocidade(65.5);
                helicoptero.velocidade(98.2, 23);

                controleRemoto.setBrinquedo(navio);
                controleRemoto.mover();
                navio.velocidade(25);
                navio.velocidade(42.7);
                navio.velocidade(67.1, 18.5);
        }
}


