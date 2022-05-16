public class MovimentoEstoque {
    public static void main (String[] args) throws Exception{
		ProdutoCustoAtual ca = new ProdutoCustoAtual(1 , "Feijao", 60, ((float)1.50));
		ProdutoCustoMedio cm = new ProdutoCustoMedio(2 , "Toamte", 120, ((float)2.5));
		ca.MostrarDados();
		cm.MostrarDados();

		ca.repor(100, (float)1.60);
		cm.repor(100, (float)2.60);

		ca.MostrarDados();
		cm.MostrarDados();

		ca.baixar(30);
		cm.baixar(50);

		ca.MostrarDados();
		cm.MostrarDados();

		cm.baixar(300);

		ca.MostrarDados();
		cm.MostrarDados();

    }
}
