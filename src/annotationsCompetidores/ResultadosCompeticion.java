package annotationsCompetidores;

import org.springframework.stereotype.Component;

@Component
public class ResultadosCompeticion implements CreacionResultadosCompeticion {

	@Override
	public String getResultadosCompeticion() {
		// TODO Auto-generated method stub
		return "Resultados competicion";
	}

}
