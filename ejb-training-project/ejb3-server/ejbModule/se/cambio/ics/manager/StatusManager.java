/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Status;

/**
 *
 * @author PC
 */
public interface StatusManager {
    
    public Status getStatus(short statusId) throws Exception;
    
    public Status getStatus(String statusName) throws Exception;
    
    public List<Status> getAllStatusList()throws Exception;

    public void addStatus(Status status) throws Exception;

    public void removeStatus(short statusId) throws Exception;

    public void updateStatus(Status status) throws Exception;
    
}
