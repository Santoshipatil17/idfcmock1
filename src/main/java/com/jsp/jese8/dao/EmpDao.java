package com.jsp.jese8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.jese8.dto.EmpDto;
import com.mysql.cj.Query;

public class EmpDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("v");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(EmpDto dto){
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	public EmpDto findby(String email){
		EmpDto dto=entityManager.find(EmpDto.class,email);
		return dto;
	}
	public void deleteData(EmpDto dto){
		entityTransaction.begin();
		entityManager.remove(dto);
		entityTransaction.commit();
		
	}
	public EmpDto updatefile(String email){
		EmpDto dto=entityManager.find(EmpDto.class,email);
		return dto;
	}
	public void update(EmpDto dto){
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();
	}
	public EmpDto fetch(String email){
		EmpDto dto=entityManager.find(EmpDto.class, email);
		return dto;
	}
	
}
