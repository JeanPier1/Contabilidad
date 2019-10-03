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
public class Secciones {
	
	@Id
	@Column(name="ID_SECCIONES")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre_seccion")
	private String nombre_seccion;
	
	@Column(name="porcentaje")
	private double porcentaje;
	
	@Column(name="valorMaximo")
	private double valorMaximo;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_INSTRUMENTOS", nullable = false)
	private Instrumentos idinstrumento;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_SECCIONES1")
	private Secciones ID_SECCIONES1;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_seccion() {
		return nombre_seccion;
	}


	public void setNombre_seccion(String nombre_seccion) {
		this.nombre_seccion = nombre_seccion;
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	public double getValorMaximo() {
		return valorMaximo;
	}


	public void setValorMaximo(double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}


	public Instrumentos getIdinstrumento() {
		return idinstrumento;
	}


	public void setIdinstrumento(Instrumentos idinstrumento) {
		this.idinstrumento = idinstrumento;
	}


	public Secciones getID_SECCIONES1() {
		return ID_SECCIONES1;
	}


	public void setID_SECCIONES1(Secciones iD_SECCIONES1) {
		ID_SECCIONES1 = iD_SECCIONES1;
	}


	public Secciones() {
		super();
	}


	public Secciones(String nombre_seccion, double porcentaje, double valorMaximo, Instrumentos idinstrumento,
			Secciones iD_SECCIONES1) {
		super();
		this.nombre_seccion = nombre_seccion;
		this.porcentaje = porcentaje;
		this.valorMaximo = valorMaximo;
		this.idinstrumento = idinstrumento;
		ID_SECCIONES1 = iD_SECCIONES1;
	}


	public Secciones(Long id, String nombre_seccion, double porcentaje, double valorMaximo, Instrumentos idinstrumento,
			Secciones iD_SECCIONES1) {
		super();
		this.id = id;
		this.nombre_seccion = nombre_seccion;
		this.porcentaje = porcentaje;
		this.valorMaximo = valorMaximo;
		this.idinstrumento = idinstrumento;
		ID_SECCIONES1 = iD_SECCIONES1;
	}
	
	
}