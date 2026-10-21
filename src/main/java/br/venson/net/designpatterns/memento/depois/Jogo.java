package br.venson.net.designpatterns.memento.depois;

public class Jogo {

    private String fase;
    private int vidas;
    private int pontuacao;
    private double x;
    private double y;
    // Atributo novo: so precisou mudar o Jogo e o Checkpoint, o GerenciadorSave ficou igual
    private int inimigos;

    public void jogar(String fase, int vidas, int pontuacao, double x, double y, int inimigos) {
        this.fase = fase;
        this.vidas = vidas;
        this.pontuacao = pontuacao;
        this.x = x;
        this.y = y;
        this.inimigos = inimigos;
    }

    // O proprio Jogo tira o retrato do seu estado
    public Checkpoint salvar() {
        return new Checkpoint(fase, vidas, pontuacao, x, y, inimigos);
    }

    // O proprio Jogo sabe ler o retrato e voltar para ele
    public void restaurar(Checkpoint checkpoint) {
        this.fase = checkpoint.fase;
        this.vidas = checkpoint.vidas;
        this.pontuacao = checkpoint.pontuacao;
        this.x = checkpoint.x;
        this.y = checkpoint.y;
        this.inimigos = checkpoint.inimigos;
    }

    @Override
    public String toString() {
        return "Jogo{fase=" + fase + ", vidas=" + vidas + ", pontuacao=" + pontuacao
                + ", x=" + x + ", y=" + y + ", inimigos=" + inimigos + "}";
    }

    // Memento: retrato imutavel do estado do Jogo.
    // Fica dentro do Jogo para que so ele consiga ler os campos (interface ampla).
    // Para quem esta de fora o Checkpoint nao tem nenhum metodo publico (interface estreita).
    public static final class Checkpoint {

        private final String fase;
        private final int vidas;
        private final int pontuacao;
        private final double x;
        private final double y;
        private final int inimigos;

        private Checkpoint(String fase, int vidas, int pontuacao, double x, double y, int inimigos) {
            this.fase = fase;
            this.vidas = vidas;
            this.pontuacao = pontuacao;
            this.x = x;
            this.y = y;
            this.inimigos = inimigos;
        }
    }
}
