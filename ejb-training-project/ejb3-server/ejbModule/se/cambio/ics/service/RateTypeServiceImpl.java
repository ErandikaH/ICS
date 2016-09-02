/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.RateTypeManager;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class RateTypeFacadeImpl
 */

@Stateless
public class RateTypeServiceImpl implements RateTypeService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    RateTypeManager rateTypeService;

    @Override
    public RateType getRateType(short rateTypeId) throws Exception {
   
            return rateTypeService.getRateType(rateTypeId);
       
    }

    @Override
    public void addRateType(RateType rateType) throws Exception {
       
            rateTypeService.addRateType(rateType);
       
    }

    @Override
    public void deleteRateType(short rateTypeId) throws Exception {
       
            rateTypeService.removeRateType(rateTypeId);
       
    }

    @Override
    public void modifyRateType(RateType rateType) throws Exception {
       
            rateTypeService.updateRateType(rateType);
        
    }

	@Override
	public List<RateType> getAllRateTypeList() throws Exception {
		
            return rateTypeService.getAllRateTypeList();
       
	}

}
