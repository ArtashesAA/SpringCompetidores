package annotationsCompetidores;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotationsCompetidores")
@PropertySource("classpath:datosCompetidores.propiedades")
public class ConfiguracionBoxeadores {

	// Definir bean para ResultadosBoxeadores

	@Bean
	public CreacionResultadosCompeticion resultadosCompeticion() {
		return new ResultadosCompeticion();

	}

	// Definir bean para Boxeadores e inyectar dependencias

	@Bean
	public Competidores Boxeador() {
		return new Boxeador(resultadosCompeticion());

	}

}
