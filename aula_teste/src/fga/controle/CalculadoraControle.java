package fga.controle;

public class CalculadoraControle {
	
	public double calculaSoma(double numero1, double numero2) throws Exception{
		
		if(numero1 < 0 || numero2 < 0){
			throw new Exception("Número inválido");
		}
		return numero2 + numero1;
	}

}
