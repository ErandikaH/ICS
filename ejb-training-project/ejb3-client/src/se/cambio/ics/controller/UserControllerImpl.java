/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.User;
import se.cambio.ics.service.UserService;


/**
 *
 * @author PC
 */
public class UserControllerImpl extends GenericDelegate<User> implements UserController{

    private UserService service;

    public UserControllerImpl(){

        String beanName = "UserServiceImpl";
        String viewClassName = "se.cambio.ics.service.UserService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (UserService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public void addUser(User user) throws Exception{
        try {
            service.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) throws Exception{
        try {
            service.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeUserById(int userId) throws Exception {
        try {
            service.removeUserById(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUserById(int userId) throws Exception{
        try {
            return service.getUserById(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

	@Override
	public User getUserByName(String loginName) throws Exception {
		try {
            return service.getUserByName(loginName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public List<User> GetAllUsersList() throws Exception {
		try {
            return service.GetAllUsersList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

}
