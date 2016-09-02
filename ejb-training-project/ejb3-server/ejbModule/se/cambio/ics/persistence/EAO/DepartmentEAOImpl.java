package se.cambio.ics.persistence.EAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 * Session Bean implementation class DepartmentDAOImpl
 */
@Stateless
public class DepartmentEAOImpl extends AbstractGenericEAO<Department> implements DepartmentEAO {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Department getDepartment(short departmentId) throws Exception {
        Department en = null;
        Query query = entityManager.createQuery(
                        "select r from Department r where r.id =(:id)",
                        Department.class);
        query.setParameter("id",departmentId);
        en = (Department) query.getSingleResult();

        return en;
    }

    @Override
    public Department getDepartment(String name) throws Exception {
         Department en = null;
        Query query = entityManager.createQuery(
                        "select r from Department r where r.name =(:name)",
                        Department.class);
        query.setParameter("name",name);
        en = (Department) query.getSingleResult();

        return en;
    }


    @Override
    public List<Department> getAllDepartmentsList() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from Department r",
                Department.class);
    	
    	return (List<Department>) query.getResultList();
    }
}
