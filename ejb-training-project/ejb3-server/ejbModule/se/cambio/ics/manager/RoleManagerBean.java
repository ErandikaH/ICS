/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.EAO.RoleEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class RoleManagerBean implements RoleManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    RoleEAO roleEAO;
	
    public RoleManagerBean() {
        // TODO Auto-generated constructor stub
    }

     @Override
    public Role getRole(short roleId) throws Exception {
        return roleEAO.getRole(roleId);
    }

     @Override
     public Role getRoleByName(String roleName) throws Exception {
         return roleEAO.getRoleByName(roleName);
     }
     
    @Override
    public void addRole(Role role) throws Exception {
        roleEAO.create(role);
    }

    @Override
    public void removeRole(short roleId) throws Exception {
        Role role=new Role();
        role.setRoleId(roleId);
        roleEAO.delete(role);
    }

    @Override
    public void updateRole(Role role) throws Exception {
        roleEAO.update(role);
    }

    @Override
    public List<Role> getAllRoles() throws Exception {
        return roleEAO.getAllRoles();
    }
    
    
}
