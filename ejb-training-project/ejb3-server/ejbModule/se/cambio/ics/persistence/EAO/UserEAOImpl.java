/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.User;
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
public class UserEAOImpl extends AbstractGenericEAO<User>implements UserEAO{

    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public User getUser(int userId) throws Exception {
        User en = null;
        //try {
                Query query = entityManager.createQuery(
                                "select r from User r where r.userId =(:id)",
                                User.class);
                query.setParameter("id", userId);
                en = (User) query.getSingleResult();

//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			throw new Exception(e);
//		}
        return en;
    }

	@Override
	public User getUser(String loginName) throws Exception {
		User en = null;
        //try {
                Query query = entityManager.createQuery(
                                "select r from User r where r.loginName =(:name)",
                                User.class);
                query.setParameter("name", loginName);
                en = (User) query.getSingleResult();

//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			throw new Exception(e);
//		}
        return en;
	}

	@Override
	public List<User> GetAllUsersList() throws Exception {
		Query query = entityManager.createQuery(
                "select r from User r",
                User.class);
    	
    	return (List<User>) query.getResultList();
	}
    
    
    
}
