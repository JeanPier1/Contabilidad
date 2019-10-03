package pe.edu.upeu.evaluaciones.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Respuestas {

	@Id
	@Column(name="ID_RESPUESTAS")
	private Long id;
	
	@Column(name="puntaje")	
	private String puntaje;

	@Column(name="iddocenteevaludo")
	private int iddocenteevaludo;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ALTERNATIVAS", nullable = false)
	private Alternativas idalternativas;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(String puntaje) {
		this.puntaje = puntaje;
	}


	public int getIddocenteevaludo() {
		return iddocenteevaludo;
	}


	public void setIddocenteevaludo(int iddocenteevaludo) {
		this.iddocenteevaludo = iddocenteevaludo;
	}


	public Alternativas getIdalternativas() {
		return idalternativas;
	}


	public void setIdalternativas(Alternativas idalternativas) {
		this.idalternativas = idalternativas;
	}


	public Respuestas() {
		super();
	}


	public Respuestas(String puntaje, int iddocenteevaludo, Alternativas idalternativas) {
		super();
		this.puntaje = puntaje;
		this.iddocenteevaludo = iddocenteevaludo;
		this.idalternativas = idalternativas;
	}


	public Respuestas(Long id, String puntaje, int iddocenteevaludo, Alternativas idalternativas) {
		super();
		this.id = id;
		this.puntaje = puntaje;
		this.iddocenteevaludo = iddocenteevaludo;
		this.idalternativas = idalternativas;
	}
	
	
	
}
