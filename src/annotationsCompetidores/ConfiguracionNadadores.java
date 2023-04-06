package annotationsCompetidores;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotationsCompetidores")
@PropertySource("classpath:datosCompetidores.propiedades")
public class ConfiguracionNadadores {

	// Definir bean para ResultadosNadadores

	@Bean
	public CreacionResultadosCompeticion resultadosCompeticion() {
		return new ResultadosCompeticion();

	}

	// Definir bean para Nadadores e inyectar dependencias

	@Bean
	public Competidores Nadador() {
		return new Nadador(resultadosCompeticion());

	}

}
