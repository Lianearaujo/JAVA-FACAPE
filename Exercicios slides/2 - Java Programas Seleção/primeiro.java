import java.io.*;
/* 
Exerc�cios
Determine se um cliente de uma loja excedeu o limite
de cr�dito. Leia :
� N�mero da conta
� O Nome do Cliente
� Saldo do in�cio do m�s
� Total de todos os itens cobrados no m�s
� Total de pagamentos efetuados pelo cliente no m�s
� Limite autorizado de cr�dito
� Mostrar o Novo Saldo. C�lculo :
� Saldo Inicial + cobran�as - pagamentos
� Caso este saldo exceda o limite de cr�dito informe :
� �Limite de cr�dito excedido em R$ X reais�
� Sen�o informe: �Ainda pode comprar R$ X reais */
class primeiro {
	public static void main (String[] args) throws Exception {
	int NumeroConta;
	String NomeCliente;
	float SaldoInicial, TotalItensCobrados, TotalPagamentos, LimiteCredito, SaldoNovo;
	System.out.println ("Informe o nome do cliente: ");
	NomeCliente = JUtil.readString();
	System.out.println ("Numero da Conta:");
	NumeroConta = JUtil.readInt ();
	System.out.println ("Saldo Inicial:");
	SaldoInicial = JUtil.readFloat();
	System.out.println ("total de itens cobrados:");
	TotalItensCobrados = JUtil.readFloat();
	System.out.println ("pagamentos feitos:");
	TotalPagamentos = JUtil.readFloat();
	System.out.println ("limite de credito:");
	LimiteCredito = JUtil.readFloat();
	SaldoNovo = SaldoInicial + TotalPagamentos-TotalItensCobrados;
	if (NumeroConta > 0) //verifica se o valor da conta do cliente � menor igual a zero, caso for ele vai dizer que a conta � invalida
	{
	
	System.out.println ("Sr(a) " + NomeCliente);
	if ((SaldoNovo+LimiteCredito)<LimiteCredito)
	{
	System.out.println ("Limite de cr�dito excedido em R$"+ (SaldoNovo-LimiteCredito) +" reais.");
	} else
	{
	System.out.println ("Ainda pode comprar R$"+ (LimiteCredito+SaldoNovo) +" reais");
	System.out.println ("SALDO INCIAL "+ SaldoInicial );
	System.out.println ("SALDO novo "+ SaldoNovo);
	System.out.println ("SALDO limite "+ LimiteCredito);
	System.out.println ("pagamentos feitos "+ TotalPagamentos );
	System.out.println ("Itens cobrados "+ TotalItensCobrados );
	}
	} else 
	{
	System.out.println ("Numero de conta invalida");
	}

	}
}