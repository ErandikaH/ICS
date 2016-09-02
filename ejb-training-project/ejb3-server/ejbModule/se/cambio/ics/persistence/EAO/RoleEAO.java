/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface RoleEAO extends GenericEAO<Role>{
    
    public Role getRole(short roleId) throws Exception;
    
    public Role getRoleByName(String roleName) throws Exception;
    
    public List<Role> getAllRoles()throws Exception;
    
}
