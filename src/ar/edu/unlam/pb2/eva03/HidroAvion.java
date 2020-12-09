package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador,Acuatico{

	private Double profundidad;
	private Double altura;

	public HidroAvion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.altura=0.0;
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
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura=altura;
		
	}

}
