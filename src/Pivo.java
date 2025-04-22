public class Pivo extends Jogador {
    public Pivo(String nome, int numeroCamisa){
        super(nome, numeroCamisa);
    }
    @Override
    public void executarPapel(){
        System.out.println(nome + "atua proximo a cesta, pega rebotes e marca pontos no garrafão");
    }
}
