import java.io.*;

class lerCubo {

	public static void main (String[] args) throws Exception {
	Cubo cubo1 = new Cubo ();

	do {
		System.out.println ("Informe aresta:");
		cubo1.aresta = JUtil.readFloat();
		cubo.mostrarDados();
		System.out.println ("Deseja fazer nova opera��o ? 1-Sim, 0- N�o");
		cubo1.aresta = JUtil.readFloat();
	} while (cubo1.aresta != 0);
	
	}
	
	
}