/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Role;
import se.cambio.ics.service.RoleService;

/**
 *
 * @author PC
 */
public class RoleControllerImpl extends GenericDelegate<Role> implements RoleController{

    private RoleService service;

    public RoleControllerImpl(){

        String beanName = "RoleServiceImpl";
        String viewClassName = "se.cambio.ics.service.RoleService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (RoleService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public Role getRole(short roleId) throws Exception{

            return service.getRole(roleId);
      
    }

    @Override
    public List<Role> getAllRoles() throws Exception {
      
            return service.getAllRoles();
        
    }

    @Override
    public void addRole(Role role) throws Exception{
 
            service.addRole(role);
      
    }

    @Override
    public void deleteRole(short roleId) throws Exception {
  
            service.deleteRole(roleId);
      
    }

    @Override
    public void modifyRole(Role role) throws Exception{
            service.modifyRole(role);
     
    }

	@Override
	public Role getRoleByName(String roleName) throws Exception {
            return service.getRoleByName(roleName);
       
	}
	
    
}
