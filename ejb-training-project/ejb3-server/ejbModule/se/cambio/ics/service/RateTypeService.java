/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.RateType;

/**
 *
 * @author PC
 */
@Remote
public interface RateTypeService {
    
    public RateType getRateType(short rateTypeId) throws Exception;
    
    public List<RateType> getAllRateTypeList()throws Exception;

    public void addRateType(RateType rateType) throws Exception;

    public void deleteRateType(short rateTypeId) throws Exception;

    public void modifyRateType(RateType rateType) throws Exception;
    
}
