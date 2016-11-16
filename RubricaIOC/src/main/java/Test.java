import it.alfasoft.fabrizio.rubrica.Rubrica;
import it.alfasoft.fabrizio.rubrica.Voce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		 Rubrica r = (Rubrica) context.getBean("rubrica");
		 Voce v1= (Voce) context.getBean("voceA");
		 
		 System.out.println(v1.getCognome());
		 
		 for(int i=0; i<r.getVoci().size(); i++){
			 System.out.println(r.getVoci().get(i).getCognome());
		 }
		 
		 System.out.println(r.getVoceByName("CCC").getTelefono());
		 
		 

	}

}
