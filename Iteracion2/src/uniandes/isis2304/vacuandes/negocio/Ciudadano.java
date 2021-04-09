package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

/**
 * Clase Ciudadano de VacuAndes
 *
 * @author Alejandro Gonzalez 
 */
public class Ciudadano  {
	/*
	 * ********************** Atributos
	 ***********************/

	/**
	 * El identificador unico del ciudadano
	 */
	private int cedula;

	/**
	 * El id del ciudadano
	 */
	private int ID;

	/**
	 * El nombre del ciudadano
	 */
	private String nombre;

	/**
	 * La prioridad del ciudadano
	 */
	private String Prioridad;

	/**
	 * La aptitud de la vacunacion
	 */
	private String   AptitudParaLaVacunacion;

	/**
	 * La fecha de nacimiento del ciudadano
	 */
	private int edad;

	/**
	 * El avance del ciudadano en vacuandes
	 */
	private int avance;
	
	
	/**
	 * Constructor
	 */
	public Ciudadano() {
		this.ID = 0;
		this.cedula = 0;
		this.nombre = "";
		this.edad = 0;
		this.Prioridad = null; 
		this.AptitudParaLaVacunacion = "";
	}

	/**
	 * Constructor con valores
	 *
	 * @param id
	 * @param cedula
	 * @param nombre
	 * @param email
	 * @param telefono
	 * @param fechaNacimiento
	 * @param comorbilidad
	 * @param dosisAdministradas
	 * @param dosisRestantes
	 * @param idEtapaVacunacion
	 * @param NombrePriorizacion
	 */
	public Ciudadano(String id, int cedula, String nombre, String email, int telefono, Date fechaNacimiento,
			String comorbilidad, int dosisAdministradas, int dosisRestantes, long idEtapaVacunacion, 
			String NombrePriorizacion, String oficinaNombre, String oficinaDireccion, String puntoVacunacionNombre, String puntoVacunacionDireccion) {
		this.ID = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.comorbilidad = comorbilidad;
		this.dosisAdministradas = dosisAdministradas;
		this.dosisRestantes = dosisRestantes;
		this.idEtapaVacunacion = idEtapaVacunacion;
		this.NombrePriorizacion = NombrePriorizacion;
		this.oficinaDireccion = oficinaDireccion;
		this.oficinaNombre = oficinaNombre;
		this.puntoVacunacionDireccion = puntoVacunacionDireccion;
		this.puntoVacunacionNombre = puntoVacunacionNombre;
	}
	
	
	

	

}