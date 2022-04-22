import java.io.*;

class montante {

	public static void main(String []args) throws Exception{
	float capital, taxa,a;
	int tempo;
	
	System.out.println ("Cacular montante \n Informe o Capital:");
	capital = JUtil.readFloat();
	System.out.println ("Informe a taxa anual em %:");
	taxa = JUtil.readFloat();
	System.out.println ("informe o tempo(anos):");
	tempo = JUtil.readInt();
	for (int i = 1; i<=tempo; i++){
		a = (float)(capital *(Math.pow((1+taxa/100f), i)));
		System.out.println ("\nMontante no ano:"+ i + "="+a);
		}
	JUtil.pause();
	}
}