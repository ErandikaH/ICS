/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.Department;

/**
 *
 * @author PC
 */
public interface DepartmentController {
    
    public List<Department> getAllDepartments()throws Exception;
    
    public Department getDepartmentById(short departmentId) throws Exception;
    
    public Department getDepartment(String name) throws Exception;

    public void addDepartment(Department department) throws Exception;

    public void deleteDepartment(short departmentId) throws Exception;

    public void updateDepartment(Department department) throws Exception;
    
}
