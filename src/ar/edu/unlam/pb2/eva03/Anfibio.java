package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico{

	private Double profundidad;
	private Double velocidad;

	public Anfibio(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.velocidad=0.0;
		this.profundidad=0.0;
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
		
	}

}
