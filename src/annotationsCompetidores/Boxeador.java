package annotationsCompetidores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Boxeador")
public class Boxeador implements Competidores {

	private CreacionResultadosCompeticion resultados;

	@Value("${nombre_boxeador}")
	private String nombre;

	@Value("${apellidos_boxeador}")
	private String apellidos;

	@Value("${edad_boxeador}")
	private Integer edad;

	public Boxeador(CreacionResultadosCompeticion resultados) {
		this.resultados = resultados;
	}

	@Override
	public String getDeporte() {
		// TODO Auto-generated method stub
		return "Boxeo";
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String getEquipamiento() {
		// TODO Auto-generated method stub
		return "Guantes";
	}

	@Override
	public Boolean getProtecciones() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getresultados() {
		// TODO Auto-generated method stub
		return resultados.getResultadosCompeticion();
	}

}
