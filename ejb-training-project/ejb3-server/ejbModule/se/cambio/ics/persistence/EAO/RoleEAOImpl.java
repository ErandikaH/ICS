/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class RoleEAOImpl extends AbstractGenericEAO<Role>implements RoleEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Role getRole(short roleId) throws Exception {
        Role en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Role r where r.roleId =(:id)",
                        Role.class);
        query.setParameter("id", roleId);
        en = (Role) query.getSingleResult();

        return en;
    }

    @Override
    public List<Role> getAllRoles() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from Role r",
                Role.class);
    	
    	return (List<Role>) query.getResultList();
    }

	@Override
	public Role getRoleByName(String roleName) throws Exception {
		Role en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Role r where r.roleName =(:name)",
                        Role.class);
        query.setParameter("name", roleName);
        en = (Role) query.getSingleResult();

        return en;
	}

    
}
