package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.DepartmentManager;
import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class DepartmentFacadeImpl
 */
@Stateless
public class DepartmentServiceImpl implements DepartmentService {

    /**
     * Default constructor. 
     */
	@EJB
    DepartmentManager departmentService;

    @Override
    public List<Department> getAllDepartments() throws Exception {
        try {
            return departmentService.getAllDepartments();
                     
        } catch (Exception e) {
            e.printStackTrace();
            //throw new Exception("Department Can not be added");
        }
        
        return null;
    }

    @Override
    public Department getDepartmentById(short departmentId) throws Exception {
        try {
            return departmentService.getDepartmentById(departmentId);
                     
        } catch (Exception e) {
            e.printStackTrace();
            //throw new Exception("Department Can not be added");
        }
        
        return null;
    }

    @Override
    public void addDepartment(Department department) throws Exception {
        try {
            departmentService.addDepartment(department);
               
        } catch (Exception e) {
            e.printStackTrace();
            //throw new Exception("Department Can not be added");
        }
    }

    @Override
    public void deleteDepartment(short departmentId) throws Exception {
        try {
            departmentService.deleteDepartment(departmentId);

        } catch (Exception e) {

            //throw new Exception("Department can not be deleted");
            DefaultExceptionHandler.reportException(e, "Department can not be deleted ");
        }
    }

    @Override
    public void updateDepartment(Department department) throws Exception {
        try {
            departmentService.updateDepartment(department);
               
        } catch (Exception e) {
            //throw new Exception("Department can not be modified");
            DefaultExceptionHandler.reportException(e, "Department can not be modified ");
        }
    }

	@Override
	public Department getDepartment(String name) throws Exception {
		try {
            return departmentService.getDepartment(name);
                     
        } catch (Exception e) {
            e.printStackTrace();
            //throw new Exception("Department Can not be added");
        }
        
        return null;
	}


}
