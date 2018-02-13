package ejercicioTema_4;

import ejercicioTema_4.NodoPila;

class NodoPila {

	public NodoPila(double dato, NodoPila abajo) {

		this.dato = dato;

		this.abajo = abajo;

	}

	public NodoPila abajo;

	public double dato;

}
