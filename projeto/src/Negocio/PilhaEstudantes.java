package Negocio;

import java.util.Stack;

import Modelagem.Estudante;

public class PilhaEstudantes {
    private Stack<Estudante> pilha;
    
    public PilhaEstudantes() {
        pilha = new Stack<>();
    }
    
    public void adicionarEstudante(Estudante estudante) {
        pilha.push(estudante);
    }
    
    public Estudante removerEstudante() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        } else {
            return null;
        }
    }
    
    // Outros métodos relevantes para manipular a pilha de estudantes
}