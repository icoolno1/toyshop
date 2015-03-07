package com.toyshop.data.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Repository;

import com.toyshop.data.PageInfo;
import com.toyshop.data.entity.Product;

@Repository
public class ProductDao extends BaseDao<Product> {

	@SuppressWarnings("unchecked")
	public List<Product> list(PageInfo pageInfo) {
		pageInfo.setPageCount(pageCount("select count(id) from Product",
				pageInfo.getPageSize()));
		Query q = this.getEntityManager().createQuery(
				"from Product  order by id desc");
		q.setMaxResults(pageInfo.getPageSize());
		q.setFirstResult((pageInfo.getCurrentPage() - 1)
				* pageInfo.getPageSize());
		return q.getResultList();
	}

	/**
	 * 返回记录数
	 * 
	 * @return
	 */
	private Integer pageCount(String query, int size) {
		Query q = this.getEntityManager().createQuery(query);
		Long rc = (Long) q.getSingleResult();

		int c = (int) Math.ceil((double) rc / (double) size);
		return c;
	}

	public List<Product> search(String keyword) {
		FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(this.getEntityManager());
		try {
			fullTextEntityManager.createIndexer().startAndWait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// create native Lucene query unsing the query DSL
		// alternatively you can write the Lucene query using the Lucene query
		// parser
		// or the Lucene programmatic API. The Hibernate Search DSL is
		// recommended though
		QueryBuilder qb = fullTextEntityManager.getSearchFactory()
				.buildQueryBuilder().forEntity(Product.class).get();
		org.apache.lucene.search.Query query = qb.keyword().onFields("title")
				.matching(keyword).createQuery();

		// wrap Lucene query in a org.hibernate.Query
		FullTextQuery hibQuery = fullTextEntityManager.createFullTextQuery(
				query, Product.class);

		// execute search
		return hibQuery.getResultList();
	}
}
