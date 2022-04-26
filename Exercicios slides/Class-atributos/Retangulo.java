class Retangulo {
float base, altura;

float area () {
	return this.base*this.altura;
}

float perimetro(){
	return (2*(this.base+this.altura));
}

public void mostrarDados(){
	System.out.println ("Area:"+ this.area());
	System.out.println ("Petimetro:"+ this.perimetro());
}



}