package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.EAO.DepartmentEAO;

/**
 * Session Bean implementation class DepartmentServiceImpl
 */
@Stateless
public class DepartmentManagerBean implements DepartmentManager {

    /**
     * Default constructor. 
     */
	@EJB
    DepartmentEAO departmentDAO;
	
    public DepartmentManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Department> getAllDepartments() throws Exception {
        return departmentDAO.getAllDepartmentsList();
    }

    @Override
    public Department getDepartmentById(short departmentId) throws Exception {
        return (Department) departmentDAO.getDepartment(departmentId);
     
    }

    @Override
    public void addDepartment(Department department) throws Exception{
        departmentDAO.create(department);
    }
    
    @Override
    public void deleteDepartment(short departmentId) throws Exception {
        Department department = new Department();
        department.setId(departmentId);
        departmentDAO.delete(department);
    }
    
    @Override
    public void updateDepartment(Department department) throws Exception{
        departmentDAO.update(department);
    }
    
    @Override
    public Department getDepartment(String name) throws Exception{
    	return departmentDAO.getDepartment(name);
    }

}
