package auladois;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExercicioUm {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();
        Random random = new SecureRandom();
        int maxRandom = 1000;

        for (int i = 0; i < 10; i++) {
            floatList.add(Float.parseFloat(String.valueOf(random.nextInt(maxRandom))));
        }

        //VALOR MAIOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .max()
                .ifPresent(value -> ExercicioUm.printValue("MAIOR VALOR", value));

        //VALOR MENOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .min()
                .ifPresent(value -> ExercicioUm.printValue("MENOR VALOR", value));

        //MEDIA DO VALOR
        floatList.stream()
                .mapToDouble(Float::floatValue)
                .average()
                .ifPresent(value -> ExercicioUm.printValue("MEDIA DO VALOR", value));

        //VETOR COMPLETO
        JOptionPane.showMessageDialog(null, floatList.stream()
                .map(aFloat -> aFloat + "\n")
                .collect(Collectors.joining()));
    }

    private static void printValue(String message, double value) {
        JOptionPane.showMessageDialog(null, String.format("%s - %.2f", message, (float) value));
    }
}
