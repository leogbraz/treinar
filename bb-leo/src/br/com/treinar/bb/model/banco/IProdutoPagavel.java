package br.com.treinar.bb.model.banco;

public interface IProdutoPagavel {//Por padr�o esta classe � publica, estatica e final

	double getValorPagar();

	void setValorPaga(double valorPaga);
	
	void efetuarPagamento();
	
}
