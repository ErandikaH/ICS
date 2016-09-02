/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Status;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface StatusEAO extends GenericEAO<Status>{
    
    public Status getStatus(short statusId) throws Exception;
    
    public Status getStatus(String statusName) throws Exception;
    
    public List<Status> getAllStatusList()throws Exception;

}
