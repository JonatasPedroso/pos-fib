package auladois.entity;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Float saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, String cpf, String rg, Float saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(getNome(), pessoa.getNome()) &&
                Objects.equals(getSobrenome(), pessoa.getSobrenome()) &&
                Objects.equals(getCpf(), pessoa.getCpf()) &&
                Objects.equals(getRg(), pessoa.getRg()) &&
                Objects.equals(getSaldo(), pessoa.getSaldo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome(), getCpf(), getRg(), getSaldo());
    }
}
