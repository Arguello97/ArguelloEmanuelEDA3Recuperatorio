package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura;
	
	public Avion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.altura=0.0;
		
	}

	@Override
	public Double getAltura() {
		
		return altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura=altura;
	}

	

	
	
}
