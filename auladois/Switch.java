package auladois;

import javax.swing.*;

public class Switch {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));

        switch (num) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Um");
            default -> System.out.println("Nenhuma das opções.");
        }
    }
}
