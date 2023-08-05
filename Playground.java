import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Playground {

    public static void main(String[] args) {
        List<Long> valores = new ArrayList<>();
        int adicionarValores = 0;

        while (adicionarValores == 0) {
            valores.add(Long.valueOf(JOptionPane.showInputDialog("Digite um Valor")));
            adicionarValores = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais numeros?", "Confirmar!",
                    YES_NO_OPTION, QUESTION_MESSAGE);
        }

        Long total = valores.stream()
                .mapToLong(Long::longValue)
                .sum();

        System.out.println(total);
    }
}
