/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.RoleManager;
import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class RoleFacadeImpl
 */

@Stateless
public class RoleServiceImpl implements RoleService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    RoleManager roleManager;
    
    @Override
    public Role getRole(short roleId) throws Exception {
        try {
            return roleManager.getRole(roleId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Role> getAllRoles() throws Exception {
        try {
            return roleManager.getAllRoles();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addRole(Role role) throws Exception {
        try {
            roleManager.addRole(role);
        } catch (Exception e) {
             DefaultExceptionHandler.reportException(e, "Role can not be added. ");

        }
    }

    @Override
    public void deleteRole(short roleId) throws Exception {
        try {
            roleManager.removeRole(roleId);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Role can not be deleted.");
        }
    }

    @Override
    public void modifyRole(Role role) throws Exception {
        try {
            roleManager.updateRole(role);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Role can not be updated.");
        }
    }

	@Override
	public Role getRoleByName(String roleName) throws Exception {
		try {
            return roleManager.getRoleByName(roleName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}
