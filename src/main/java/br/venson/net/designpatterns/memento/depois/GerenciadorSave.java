package br.venson.net.designpatterns.memento.depois;

import java.util.ArrayDeque;
import java.util.Deque;

public class GerenciadorSave {

    // O historico agora tem tipo: uma pilha de Checkpoint e nao de String[]
    private final Deque<Jogo.Checkpoint> historico = new ArrayDeque<>();

    // So guarda o retrato que o Jogo criou, sem saber o que tem dentro
    public void salvar(Jogo jogo) {
        historico.push(jogo.salvar());
    }

    public void desfazer(Jogo jogo) {
        if (historico.isEmpty()) {
            System.out.println("Nenhum checkpoint salvo.");
            return;
        }
        jogo.restaurar(historico.pop());
    }
}
