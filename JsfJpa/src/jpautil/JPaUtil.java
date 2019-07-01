package jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPaUtil {

		
		private static EntityManagerFactory factory;
		
	
		static {
			if(factory==null) {
				
				factory =Persistence.createEntityManagerFactory("JsfJpa22");
				
				}
		
		}

	
		public static EntityManager getEntityManager() {
			System.out.println("sıkıntı return de");
			return factory.createEntityManager();
		}
	

}
