package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico{

	private Double profundidad;
	public Destructor(Integer codigo, String descripcion) {
		super(codigo, descripcion);
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

}
