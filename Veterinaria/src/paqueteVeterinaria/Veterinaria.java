package paqueteVeterinaria;

import java.util.List;

public class Veterinaria {
	private List<Dueño> dueño;
	private List<Mascota> mascota;
	private List<ControlVeterinario> controlVeterinario;
	
	
public Veterinaria(List<Dueño> dueño, List<Mascota> mascota, List<ControlVeterinario> controlVeterinario) {
	super();
	this.dueño = dueño;
	this.mascota = mascota;
	this.controlVeterinario = controlVeterinario;
	}

public List<Dueño> getDueño() {
	return dueño;
}

public void setDueño(List<Dueño> dueño) {
	this.dueño = dueño;
}

public List<Mascota> getMascota() {
	return mascota;
}

public void setMascota(List<Mascota> mascota) {
	this.mascota = mascota;
}

public List<ControlVeterinario> getControlVeterinario() {
	return controlVeterinario;
}

public void setControlVeterinario(List<ControlVeterinario> controlVeterinario) {
	this.controlVeterinario = controlVeterinario;
}

@Override
public String toString() {
	return "Veterinaria [dueño=" + dueño + ", mascota=" + mascota + ", controlVeterinario=" + controlVeterinario + "]";
}

}