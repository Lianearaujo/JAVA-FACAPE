import java.io.*; 
class quinto { 
/* 4) Leia o raio (r) de um c�rculo e mostre o di�metro, a
circunfer�ncia e a �rea do c�rculo. Utilize para p o
valor da constante Math.PI (mais precisa que
3,14159).
� Di�metro = 2r
� Circunfer�ncia = 2 pr
� �rea = p r �
*/
	public static void main(String[] args) throws Exception {
	float r;
	System.out.println ("Informe o raio:");
	r = JUtil.readFloat();
	System.out.println("Di�metro: "+ (2*r) + "\n Circunfer�ncia: "+ (2*Math.PI*r) +"\n �rea: "+ (Math.PI*(Math.pow(r,2))));  // MATH.PI usa o valor de pi e MATH.POW � usado para expoente Exp: 2^3 = Math.pow(2,3) acaba passando como paramentro
	JUtil.pause();

	}

}