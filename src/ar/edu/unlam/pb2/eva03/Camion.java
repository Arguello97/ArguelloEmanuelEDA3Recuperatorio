package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad;
	public Camion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		
		return velocidad;
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
		
	}
}
