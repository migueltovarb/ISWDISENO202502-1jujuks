package paqueteVeterinaria;

import java.util.List;

public class Mascota {
	private String nombre;
	private String especie;
	private String edad;
	private List<Dueño> dueño;
	
public Mascota(String nombre, String especie, String edad, List<Dueño> dueño) {
	super();
	this.nombre = nombre;
	this.especie = especie;
	this.edad = edad;
	this.dueño = dueño;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String  getEspecie() {
	return especie;
}

public void setEspecie(String  especie) {
	this.especie = especie;
}

public String getEdad() {
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}

public List<Dueño> getDueño() {
	return dueño;
}

public void setDueño(List<Dueño> dueño) {
	this.dueño = dueño;
}

@Override
public String toString() {
	return "Mascota [dueño=" + dueño + "]";
}

}

