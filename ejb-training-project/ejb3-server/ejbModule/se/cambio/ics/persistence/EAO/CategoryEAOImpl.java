/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
@Stateless
public class CategoryEAOImpl extends AbstractGenericEAO<Category>implements CategoryEAO{

    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public List<Category> getCategoryByName(String categoryName) throws Exception {
        Query query = entityManager.createQuery("Select r from Category r where r.categoryName LIKE (:categoryName)");
        query.setParameter("categoryName", categoryName+"%");
        return (List<Category>) query.getResultList();
    }
   
    @Override
    public Category getCategoryById(int categoryId) throws Exception {
        Category en = null;
      
        Query query = entityManager.createQuery(
                        "select r from Category r where r.categoryId =(:id)",
                        Category.class);
        query.setParameter("id", categoryId);
        en = (Category) query.getSingleResult();


        return en;
    }

	@Override
	public List<Category> getAllCategoryList() throws Exception {
		Query query = entityManager.createQuery(
                "select r from Category r",
                Category.class);
    	
    	return (List<Category>) query.getResultList();
	}
    
}
