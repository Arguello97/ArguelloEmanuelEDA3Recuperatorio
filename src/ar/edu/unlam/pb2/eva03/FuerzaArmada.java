package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy=new HashSet<Vehiculo>();
		this.batallas=new HashMap<String, Batalla>();
	}
	
	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		return convoy.add(vehiculo);
		
	}

	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(nombre, new Batalla(tipo,latitud,longitud));
	}

	public Batalla getBatalla(String nombre) {
		// TODO Auto-generated method stub
		return batallas.get(nombre);
	}

	public Boolean enviarALaBatalla(String string, int i) {
		// TODO Auto-generated method stub
		return false;
	} 

}
