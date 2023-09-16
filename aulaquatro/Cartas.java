package aulaquatro;

import java.util.HashMap;
import java.util.Map;

public class Cartas {

    private final Map<String, Integer> cartasMap = new HashMap<>();

    public Cartas() {
        cartasMap.put("Aa", 1);
        cartasMap.put("2", 2);
        cartasMap.put("3", 3);
        cartasMap.put("4", 4);
        cartasMap.put("5", 5);
        cartasMap.put("6", 6);
        cartasMap.put("7", 7);
        cartasMap.put("8", 8);
        cartasMap.put("9", 9);
        cartasMap.put("10", 10);
        cartasMap.put("Jj", 11);
        cartasMap.put("Qq", 12);
        cartasMap.put("Kk", 13);
    }

    public int converteCartaParaInt(String carta) {
        return cartasMap.entrySet().stream()
                .filter(entry -> entry.getKey().contains(carta))
                .map(Map.Entry::getValue)
                .findFirst().orElse(-1);
    }

}
