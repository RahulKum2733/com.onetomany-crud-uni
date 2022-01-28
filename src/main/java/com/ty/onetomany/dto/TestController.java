package com.ty.onetomany.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("rahul");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		
		
       
		
		
		
		entityTransaction.commit();
		
		

	}
	

}
// INSERTION 


//Item item = new Item();
//item.setId(2);
//item.setCost(15);
//item.setName("Coffe");
//item.setQuantity(5);
//
//Item item1 = new Item();
//item1.setId(3);
//item1.setCost(20);
//item1.setName("Pencil");
//item1.setQuantity(3);
//List<Item> items = new ArrayList<Item>();
//items.add(item);
//items.add(item1);
//AmazonOrder amazonOrder = new AmazonOrder();
//amazonOrder.setId(2);
//amazonOrder.setLocation("KA");
//amazonOrder.setItems(items);
//entityManager.persist(amazonOrder);
		//entityManager.persist(item1);
		//entityManager.persist(item);
		

// DELETION

//AmazonOrder amazonOrder = entityManager.find(AmazonOrder.class, 2);
//if(amazonOrder!=null) {
//	entityManager.remove(amazonOrder);
//}

