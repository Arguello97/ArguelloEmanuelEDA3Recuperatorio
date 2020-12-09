package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy=new HashSet<Vehiculo>();
	}
	
	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		return convoy.add(vehiculo);
		
	}

	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return convoy.size();
	} 

}
