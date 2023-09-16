package aulatres.tests;

import aulatres.utils.ValidaCPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ValidaCPFTests {

    private ValidaCPF validaCPF;
    public static final String CPF_VALIDO = "73157083082";
    public static final String CPF_VALIDO_COM_PONTOS = "731.570.830-82";
    public static final String CPF_10_DIGITO = "95769334800";
    public static final String CPF_11_DIGITO = "59540905800";
    public static final String CPF_INVALIDO = "73257084582";
    public static final String CPF_INVALIDO_COM_PONTOS = "732.570.845-82";

    @BeforeEach
    void setUp() {
        validaCPF = new ValidaCPF();
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF válido!")
    public void validandoCpfValido() {
        assertTrue(validaCPF.isCPF(CPF_VALIDO));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF válido com 10 digito igual zero!")
    public void validandoCpfValidoZero10Digito() {
        assertTrue(validaCPF.isCPF(CPF_10_DIGITO));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF válido com 11 digito igual zero!")
    public void validandoCpfValidoZero11Digito() {
        assertTrue(validaCPF.isCPF(CPF_11_DIGITO));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF inválido!")
    public void validandoCpfInvalido() {
        assertFalse(validaCPF.isCPF(CPF_INVALIDO));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF inválido - tamanho excedido!")
    public void validandoCpfInvalidoExcedeuTamanho() {
        assertFalse(validaCPF.isCPF(CPF_INVALIDO_COM_PONTOS));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF inválido - todos os tipos informados no if!")
    public void validandoCpfInvalidoTodosInformadosNoIF() {
        assertFalse(validaCPF.isCPF("00000000000"));
        assertFalse(validaCPF.isCPF("11111111111"));
        assertFalse(validaCPF.isCPF("22222222222"));
        assertFalse(validaCPF.isCPF("33333333333"));
        assertFalse(validaCPF.isCPF("44444444444"));
        assertFalse(validaCPF.isCPF("55555555555"));
        assertFalse(validaCPF.isCPF("66666666666"));
        assertFalse(validaCPF.isCPF("77777777777"));
        assertFalse(validaCPF.isCPF("88888888888"));
        assertFalse(validaCPF.isCPF("99999999999"));
    }

    @Test
    @DisplayName("Testando a validação de CPF, informando um CPF inválido - tamanho excedido!")
    public void validandoImpressaoCpf() {
        assertEquals(CPF_VALIDO_COM_PONTOS, validaCPF.imprimeCPF(CPF_VALIDO));
    }
}
