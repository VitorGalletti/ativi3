package Visao;

import javax.swing.JOptionPane;

import Modelagem.Estudante;
import Negocio.PilhaEstudantes;

public class Main {
    public static void main(String[] args) {
        PilhaEstudantes pilhaEstudantes = new PilhaEstudantes();
        
        // Exemplo de interação com o usuário
        String nome = JOptionPane.showInputDialog("Digite o nome do estudante:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do estudante:"));
        
        Estudante estudante = new Estudante(nome, idade);
        pilhaEstudantes.adicionarEstudante(estudante);
        
        JOptionPane.showMessageDialog(null, "Estudante adicionado com sucesso à pilha!");
        
        // Exemplo de remoção de estudante da pilha
        Estudante estudanteRemovido = pilhaEstudantes.removerEstudante();
        if (estudanteRemovido != null) {
            JOptionPane.showMessageDialog(null, "Estudante removido: " + estudanteRemovido.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "A pilha está vazia!");
        }
    }
}
