/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Department;
import se.cambio.ics.service.DepartmentService;

/**
 *
 * @author PC
 */
public class DepartmentControllerImpl extends GenericDelegate<Department> implements DepartmentController{

    private DepartmentService service;

    public DepartmentControllerImpl(){

        String beanName = "DepartmentServiceImpl";
        String viewClassName = "se.cambio.ics.service.DepartmentService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (DepartmentService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public List<Department> getAllDepartments() throws Exception {
        try {
            return service.getAllDepartments();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Department getDepartmentById(short departmentId) throws Exception{
        try {
            return service.getDepartmentById(departmentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addDepartment(Department department) throws Exception{
        try {
            service.addDepartment(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDepartment(short departmentId) throws Exception {
        try {
            service.deleteDepartment(departmentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDepartment(Department department) throws Exception{
        try {
            service.updateDepartment(department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public Department getDepartment(String name) throws Exception {
		try {
            return service.getDepartment(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

    
}
