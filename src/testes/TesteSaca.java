package testes;


import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		Cliente Paulo = new Cliente();
		conta.setTitular(Paulo);
		conta.deposita(200.0);
		System.out.println(conta.getSaldo());

	}

}
