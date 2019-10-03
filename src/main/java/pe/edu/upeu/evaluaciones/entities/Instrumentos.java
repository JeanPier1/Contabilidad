package pe.edu.upeu.evaluaciones.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instrumentos {
	
	@Id
	@Column(name="ID_INSTRUMENTOS")
	private Long id;
	
    @Column(name = "Nombre")
	private String nombre_plantilla;
	
    @Column(name = "Leyenda")
	private String Descripcion;
    
    @Column(name = "CANTIDADSEC")
    private int cantidad;
	

	@Column(name="Estado", columnDefinition = "char")
	private String estado;
	
    @Column(name = "porcentaje")
	private double porcentaje;

    @Column(name = "idevaluador")
	private int idevaluador;
	
    @Column(name = "iddonceteevaludo")
	private int iddonceteevaludo;
	
    @Column(name = "idconvocatoria")
	private int idconvocatoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_plantilla() {
		return nombre_plantilla;
	}

	public void setNombre_plantilla(String nombre_plantilla) {
		this.nombre_plantilla = nombre_plantilla;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getIdevaluador() {
		return idevaluador;
	}

	public void setIdevaluador(int idevaluador) {
		this.idevaluador = idevaluador;
	}

	public int getIddonceteevaludo() {
		return iddonceteevaludo;
	}

	public void setIddonceteevaludo(int iddonceteevaludo) {
		this.iddonceteevaludo = iddonceteevaludo;
	}

	public int getIdconvocatoria() {
		return idconvocatoria;
	}

	public void setIdconvocatoria(int idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}

	
	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Instrumentos() {
		super();
	}

	public Instrumentos(String nombre_plantilla, String descripcion, int cantidad, String estado, double porcentaje,
			int idevaluador, int iddonceteevaludo, int idconvocatoria) {
		super();
		this.nombre_plantilla = nombre_plantilla;
		Descripcion = descripcion;
		this.cantidad = cantidad;
		this.estado = estado;
		this.porcentaje = porcentaje;
		this.idevaluador = idevaluador;
		this.iddonceteevaludo = iddonceteevaludo;
		this.idconvocatoria = idconvocatoria;
	}

	public Instrumentos(Long id, String nombre_plantilla, String descripcion, int cantidad, String estado,
			double porcentaje, int idevaluador, int iddonceteevaludo, int idconvocatoria) {
		super();
		this.id = id;
		this.nombre_plantilla = nombre_plantilla;
		Descripcion = descripcion;
		this.cantidad = cantidad;
		this.estado = estado;
		this.porcentaje = porcentaje;
		this.idevaluador = idevaluador;
		this.iddonceteevaludo = iddonceteevaludo;
		this.idconvocatoria = idconvocatoria;
	}

	

	

	
}
