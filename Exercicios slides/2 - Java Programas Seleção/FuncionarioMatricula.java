class FuncionarioMatricula{
    String nome;
    int matricula;
    float valor, hora;

    public float salariobruto (){
        return (this.valor*this.hora);
    }

    public float percentualimpostorenda(){
        int x=0;
        if (salariobruto () > 1500){
            x = 15;
        } else if (salariobruto () <= 1500 && salariobruto ()>500){
            x =8;
        } else if (salariobruto () <=500) {
            x = 0;
        }
        return x;
    }
    public float descontoimpostoderenda(){
        return (salariobruto()*percentualimpostorenda())/100;
    }

    public float descontoimpostoderenda(float x){
        return (x*salariobruto())/100;
    }

    public float salarioliquido(){
        return (salariobruto()-descontoimpostoderenda());
    }

    public void mostrarDados (){
        System.out.println ("Nome:" + this.nome);
        System.out.println ("Matricula:"+ this.matricula);
        System.out.println ("horas:"+ this.hora);
        System.out.println ("valor:"+ this.valor);
        System.out.println ("Salario bruto:"+ salariobruto());
        System.out.println ("Percentual Desconto:"+ percentualimpostorenda());
        System.out.println ("Desconto imposto de renda:"+ descontoimpostoderenda());
        System.out.println ("Salario Liquido:"+ salarioliquido());
    }

}