package se.cambio.ics.persistence.EAO;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

@Remote
public interface DepartmentEAO extends GenericEAO<Department>{
	
	public Department getDepartment(short departmentId) throws Exception;
    
    public Department getDepartment(String name) throws Exception;
	
    public List<Department> getAllDepartmentsList()throws Exception;

}
