package pe.edu.upeu.evaluaciones.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
@Entity
public class Preguntas {
	
	@Id
	@Column(name ="ID_PREGUNTAS")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    @Column(name = "nombrepregunta")
	private String nombrepregunta;

    @Column(name = "valormaximo")
	private double valormaximo;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_SECCIONES", nullable = false)
	private Secciones idsecciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrepregunta() {
		return nombrepregunta;
	}

	public void setNombrepregunta(String nombrepregunta) {
		this.nombrepregunta = nombrepregunta;
	}

	public double getValormaximo() {
		return valormaximo;
	}

	public void setValormaximo(double valormaximo) {
		this.valormaximo = valormaximo;
	}

	public Secciones getIdsecciones() {
		return idsecciones;
	}

	public void setIdsecciones(Secciones idsecciones) {
		this.idsecciones = idsecciones;
	}

	public Preguntas() {
		super();
	}

	public Preguntas(String nombrepregunta, double valormaximo, Secciones idsecciones) {
		super();
		this.nombrepregunta = nombrepregunta;
		this.valormaximo = valormaximo;
		this.idsecciones = idsecciones;
	}

	public Preguntas(Long id, String nombrepregunta, double valormaximo, Secciones idsecciones) {
		super();
		this.id = id;
		this.nombrepregunta = nombrepregunta;
		this.valormaximo = valormaximo;
		this.idsecciones = idsecciones;
	}
	
	
}
