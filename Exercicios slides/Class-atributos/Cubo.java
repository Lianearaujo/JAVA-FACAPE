class Cubo {
float aresta;

double area () {
	return (6*(Math.pow(this.aresta, 2)));
}
double volume (){
	return Math.pow(this.aresta,3);
}

public void mostarDados (){
System.out.println ("Area:" + this.area());
System.out.println ("Volume: "+ this.volume());
}

}