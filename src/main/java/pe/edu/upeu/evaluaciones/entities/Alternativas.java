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
public class Alternativas {
	
	@Id
	@Column(name="ID_ALTERNATIVAS")
	private Long id;
	
    @Column(name = "descripcion")
	private String descripcion;
	
    @Column(name = "puntaje")
	private double puntaje;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_PREGUNTAS", nullable = false)
	private Preguntas idpreguntas;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPuntaje() {
		return puntaje;
	}



	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}



	public Preguntas getIdpreguntas() {
		return idpreguntas;
	}



	public void setIdpreguntas(Preguntas idpreguntas) {
		this.idpreguntas = idpreguntas;
	}



	public Alternativas() {
		super();
	}



	public Alternativas(String descripcion, double puntaje, Preguntas idpreguntas) {
		super();
		this.descripcion = descripcion;
		this.puntaje = puntaje;
		this.idpreguntas = idpreguntas;
	}



	public Alternativas(Long id, String descripcion, double puntaje, Preguntas idpreguntas) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.puntaje = puntaje;
		this.idpreguntas = idpreguntas;
	}
	
	
	
}
