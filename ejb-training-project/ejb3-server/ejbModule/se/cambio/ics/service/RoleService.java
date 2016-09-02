/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Role;

/**
 *
 * @author PC
 */

@Remote
public interface RoleService {
    
    public Role getRole(short roleId) throws Exception;
    
    public Role getRoleByName(String roleName) throws Exception;
    
    public List<Role> getAllRoles()throws Exception;

    public void addRole(Role role) throws Exception;

    public void deleteRole(short roleId) throws Exception;

    public void modifyRole(Role role) throws Exception;
    
}
