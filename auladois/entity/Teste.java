package auladois.entity;

public interface Teste {

    default String name(String teste) {
        if (teste.equals("TESTE")) {
            return teste;
        }

        return "";
    }
}
