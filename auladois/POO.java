package auladois;

import auladois.entity.Aluno;
import auladois.entity.Pessoa;

public class POO {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jonatas");
        pessoa.setSobrenome("Pedroso");
        pessoa.setCpf("1234565789");
        pessoa.setRg("1234654");
        pessoa.setSaldo(256F);
        System.out.println(pessoa);

        Pessoa pessoa2 = new Pessoa("Jonatas", "Pedroso", "1234565789", "1234654", 256F);
        System.out.println(pessoa2);

        boolean eIgual = pessoa.equals(pessoa2);
        System.out.println(eIgual);
    }
}
