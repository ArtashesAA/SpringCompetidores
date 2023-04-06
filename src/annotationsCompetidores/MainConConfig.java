package annotationsCompetidores;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConConfig {

	public static void main(String[] args) {

		// Leer el class de coniguración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(annotationsCompetidores.ConfiguracionBoxeadores.class);
		
		// Pedir al bean los contenedores

		Atleta atleta1 = contexto.getBean("Atleta", Atleta.class);
		Boxeador boxeador1 = contexto.getBean("Boxeador", Boxeador.class);
		Nadador nadador1 = contexto.getBean("Nadador", Nadador.class);

		// Clase Atleta

		System.out.println("---------------Clase Atleta--------------------");
		System.out.println(atleta1.getDeporte());
		System.out.println(atleta1.getEquipamiento());
		System.out.println(atleta1.getProtecciones());
		System.out.println(atleta1.getresultados());
		System.out.println(atleta1.getNombre());
		System.out.println(atleta1.getApellidos());
		System.out.println(atleta1.getEdad());

		// Clase Boxeador

		System.out.println("---------------Clase Boxeador--------------------");
		System.out.println(boxeador1.getDeporte());
		System.out.println(boxeador1.getEquipamiento());
		System.out.println(boxeador1.getProtecciones());
		System.out.println(boxeador1.getresultados());
		System.out.println(boxeador1.getNombre());
		System.out.println(boxeador1.getApellidos());
		System.out.println(boxeador1.getEdad());

		// Clase Nadador

		System.out.println("---------------Clase Nadador--------------------");
		System.out.println(nadador1.getDeporte());
		System.out.println(nadador1.getEquipamiento());
		System.out.println(nadador1.getProtecciones());
		System.out.println(nadador1.getresultados());
		System.out.println(nadador1.getNombre());
		System.out.println(nadador1.getApellidos());
		System.out.println(nadador1.getEdad());

		// Cerrar el contexto

		contexto.close();
	}

}
