/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;
import java.util.List;

import se.cambio.ics.persistence.RateType;

/**
 *
 * @author PC
 */
public interface RateTypeController {
    
    public RateType getRateType(short rateTypeId) throws Exception;
    
    public List<RateType> getAllRateTypeList()throws Exception;
    
    public void addRateType(RateType rateType) throws Exception;

    public void deleteRateType(short rateTypeId) throws Exception;

    public void modifyRateType(RateType rateType) throws Exception;
    
}
