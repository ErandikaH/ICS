/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface RateTypeEAO extends GenericEAO<RateType>{
    
    public RateType getRateType(short rateTypeId) throws Exception;
    
    public List<RateType> getAllRateTypeList()throws Exception;
    
}
