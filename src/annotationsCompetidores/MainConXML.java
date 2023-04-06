package annotationsCompetidores;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConXML {

	public static void main(String[] args) {

		// Llamar al xml

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedir al bean los contenedores

		Competidores atleta = contexto.getBean("Atleta", Competidores.class);
		Competidores boxeador = contexto.getBean("Boxeador", Competidores.class);
		Competidores nadador = contexto.getBean("Nadador", Competidores.class);

		// Clase Atleta

		System.out.println("---------------Clase Atleta--------------------");
		System.out.println(atleta.getDeporte());
		System.out.println(atleta.getEquipamiento());
		System.out.println(atleta.getProtecciones());
		System.out.println(atleta.getresultados());

		// Clase Boxeador

		System.out.println("---------------Clase Boxeador--------------------");
		System.out.println(boxeador.getDeporte());
		System.out.println(boxeador.getEquipamiento());
		System.out.println(boxeador.getProtecciones());
		System.out.println(boxeador.getresultados());

		// Clase Nadador

		System.out.println("---------------Clase Nadador--------------------");
		System.out.println(nadador.getDeporte());
		System.out.println(nadador.getEquipamiento());
		System.out.println(nadador.getProtecciones());
		System.out.println(nadador.getresultados());

		// Cerrar el contexto

		contexto.close();
	}

}
