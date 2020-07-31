package com.arquitecturajava.escuela;

public class Nota {
	
	private Double valor;
	
	private String asignatura;
	
	
	public Nota() {}

	public Nota(double valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	/**
	 * dos notas comparten misma asignatura
	 * @param otra
	 * @return
	 */
	public boolean esMismaAsignatura(Nota otra) {
		return this.getAsignatura().equals(otra.getAsignatura());
	}
	
	public boolean esMayor(Nota otra) {
		if(this.esMismaAsignatura(otra)) {
			return this.valor > otra.getValor();
		}
		throw new RuntimeException("Las notas no son comparable porque no tienen la misma asignatura");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	

}
