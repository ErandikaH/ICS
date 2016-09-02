/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.RateType;

/**
 *
 * @author PC
 */
public interface RateTypeManager {
    
    public RateType getRateType(short rateTypeId) throws Exception;
    
    public List<RateType> getAllRateTypeList()throws Exception;

    public void addRateType(RateType rateType) throws Exception;

    public void removeRateType(short rateTypeId) throws Exception;

    public void updateRateType(RateType rateType) throws Exception;
    
}
