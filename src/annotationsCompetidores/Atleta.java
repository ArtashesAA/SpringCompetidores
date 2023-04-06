package annotationsCompetidores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Atleta")
public class Atleta implements Competidores {
	
	@Autowired
	@Qualifier("resultadosCompeticion")
	private CreacionResultadosCompeticion resultados;

	@Value("${nombre_atleta}")
	private String nombre;

	@Value("${apellidos_atleta}")
	private String apellidos;

	@Value("${edad_atleta}")
	private Integer edad;

	public Atleta(CreacionResultadosCompeticion resultados) {
		this.resultados=resultados;
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

	/*@Autowired
	public void setResultados(CreacionResultadosCompeticion resultados) {
		this.resultados = resultados;
	}*/

	@Override
	public String getDeporte() {
		// TODO Auto-generated method stub
		return "Atletimo";
	}

	@Override
	public String getEquipamiento() {
		// TODO Auto-generated method stub
		return "Zapatillas para correr";
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
