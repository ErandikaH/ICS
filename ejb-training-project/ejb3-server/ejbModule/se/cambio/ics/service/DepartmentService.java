package se.cambio.ics.service;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.Department;

@Remote
public interface DepartmentService {
	
	public List<Department> getAllDepartments()throws Exception;
    
    public Department getDepartmentById(short departmentId) throws Exception;
    
    public Department getDepartment(String name) throws Exception;

    public void addDepartment(Department department) throws Exception;

    public void deleteDepartment(short departmentId) throws Exception;

    public void updateDepartment(Department department) throws Exception;

}
