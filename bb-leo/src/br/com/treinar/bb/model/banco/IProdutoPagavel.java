package br.com.treinar.bb.model.banco;

public interface IProdutoPagavel {//Por padrão esta classe é publica, estatica e final

	double getValorPagar();

	void setValorPaga(double valorPaga);
	
	void efetuarPagamento();
	
}
