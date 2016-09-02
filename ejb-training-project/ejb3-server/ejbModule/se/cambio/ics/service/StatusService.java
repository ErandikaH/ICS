/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Status;

/**
 *
 * @author PC
 */
@Remote
public interface StatusService {
    
    public Status getStatus(short statusId) throws Exception;
    
    public Status getStatus(String statusName) throws Exception;
    
    public List<Status> getAllStatusList()throws Exception;

    public void addStatus(Status status) throws Exception;

    public void deleteStatus(short statusId) throws Exception;

    public void modifyStatus(Status status) throws Exception;
    
}
