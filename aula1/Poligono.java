package exercicio01;

public abstract class Poligono extends Figura {
	private double base;
	private double altura;
	
	public double getAltura(){
		return altura;
	}

	public double getBase(){
		return base;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public void setBase(double base){
		this.base = base
	}
}
