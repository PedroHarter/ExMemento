# Exercícios: Padrão Memento

Exercícios do tópico 16 (Memento) da disciplina de Design Patterns.

As respostas dos exercícios teóricos e a análise do exercício 2 estão em [RESPOSTAS.md](RESPOSTAS.md).

## Estrutura

```
src/main/java/br/venson/net/designpatterns/memento/
├── antes/                      projeto original, o save copia os campos do jogo para um String[]
│   ├── Main.java
│   ├── Jogo.java
│   └── GerenciadorSave.java
└── depois/                     refatoração usando o padrão Memento
    ├── Main.java
    ├── Jogo.java                   originator, com o memento Checkpoint como classe interna
    └── GerenciadorSave.java        caretaker, guarda os checkpoints sem olhar o conteúdo
```

## Como rodar

Projeto Maven com Java 17.

- **VS Code / Eclipse / IntelliJ:** abra a pasta do projeto e execute a classe `Main` de cada pacote.
- **Linha de comando:**
  ```bash
  mvn compile
  java -cp target/classes br.venson.net.designpatterns.memento.antes.Main
  java -cp target/classes br.venson.net.designpatterns.memento.depois.Main
  ```

Os diagramas de classes do `RESPOSTAS.md` foram feitos em Mermaid. No GitHub eles aparecem direto; no VS Code é preciso a extensão *Markdown Preview Mermaid Support* para ver no preview.
