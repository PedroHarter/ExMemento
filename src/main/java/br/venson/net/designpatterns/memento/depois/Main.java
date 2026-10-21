package br.venson.net.designpatterns.memento.depois;

public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        GerenciadorSave save = new GerenciadorSave();

        // O cliente so pede para salvar e desfazer, nao mexe em nenhum campo do Jogo
        jogo.jogar("Fase 1", 3, 100, 10.0, 20.0, 5);
        save.salvar(jogo);
        System.out.println("Checkpoint 1:     " + jogo);

        jogo.jogar("Fase 2", 2, 300, 50.0, 30.0, 8);
        save.salvar(jogo);
        System.out.println("Checkpoint 2:     " + jogo);

        jogo.jogar("Fase 3", 0, 450, 80.0, 15.0, 12);
        System.out.println("Depois de perder: " + jogo);

        System.out.println();
        save.desfazer(jogo);
        System.out.println("Desfazendo:       " + jogo);

        save.desfazer(jogo);
        System.out.println("Desfazendo:       " + jogo);

        // Historico vazio, o Jogo continua no ultimo estado restaurado
        save.desfazer(jogo);
        System.out.println("Desfazendo:       " + jogo);
    }
}
