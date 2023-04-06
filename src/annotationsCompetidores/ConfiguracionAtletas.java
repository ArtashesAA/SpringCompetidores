package annotationsCompetidores;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotationsCompetidores")
@PropertySource("classpath:datosCompetidores.propiedades")
public class ConfiguracionAtletas {

	// Definir bean para ResultadosAtletas

	@Bean
	public CreacionResultadosCompeticion resultadosCompeticion() {
		return new ResultadosCompeticion();

	}

	// Definir bean para Atletas e inyectar dependencias

	@Bean
	public Competidores Atleta() {
		return new Atleta(resultadosCompeticion());

	}

}
