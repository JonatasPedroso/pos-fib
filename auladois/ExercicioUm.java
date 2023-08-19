package auladois;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioUm {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            floatList.add(Float.parseFloat(JOptionPane.showInputDialog("Informe um número Float: ")));
        }

        //VALOR MAIOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .max()
                .ifPresent(ExercicioUm::printValue);

        //VALOR MENOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .min()
                .ifPresent(ExercicioUm::printValue);

        //MEDIA DO VALOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .average()
                .ifPresent(ExercicioUm::printValue);

        //VETOR COMPLETO
        JOptionPane.showMessageDialog(null, floatList.stream()
                .map(aFloat -> aFloat + "\n")
                .collect(Collectors.joining()));
    }

    private static void printValue(double value) {
        JOptionPane.showMessageDialog(null, value);
    }
}
