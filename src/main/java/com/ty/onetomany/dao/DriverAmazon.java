package com.ty.onetomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DriverAmazon {
	
	EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("rahul");
	EntityManager entityManager = entityManagerFactory.createEntityManager();


}
