package com.toyshop.data.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseDao<T> {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Insert oobject
	 * 
	 * @param o
	 */
	public void insert(Object o) {
		 getEntityManager().persist(o);
	}

	public void update(Object o) {
		this.getEntityManager().persist(o);
	}

	public void delete(Object o) {
		getEntityManager().remove(o);
	}

	@SuppressWarnings("unchecked")
	public T get(Integer id) {
		ParameterizedType parameterizedType = (ParameterizedType)this.getClass().getGenericSuperclass(); 

		Class<T> entityClass= (Class<T>)(parameterizedType.getActualTypeArguments()[0]);
		return getEntityManager().find(entityClass, id);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
