package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpautil.JPaUtil;

public class DaoGeneric<E> {
	
	public void kaydet(E entity) {
		//EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("JsfJpa22");
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JsfJpa22");
		EntityManager entityManager=factory.createEntityManager();
		System.out.println(entityManager+"em tamamdir");
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(entity);
		
		entityTransaction.commit();
		entityManager.close();
	}

}
