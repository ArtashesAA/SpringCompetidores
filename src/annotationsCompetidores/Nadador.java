package annotationsCompetidores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Nadador")
public class Nadador implements Competidores {

	private CreacionResultadosCompeticion resultados;
	
	@Value("${nombre_nadador}")
	private String nombre;

	@Value("${apellidos_nadador}")
	private String apellidos;

	@Value("${edad_nadador}")
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	@Autowired
	public Nadador(CreacionResultadosCompeticion resultados) {
		this.resultados = resultados;
	}

	@Override
	public String getDeporte() {
		// TODO Auto-generated method stub
		return "Natación";
	}

	@Override
	public String getEquipamiento() {
		// TODO Auto-generated method stub
		return "Gafas de agua";
	}

	@Override
	public Boolean getProtecciones() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getresultados() {
		// TODO Auto-generated method stub
		return resultados.getResultadosCompeticion();
	}

}
