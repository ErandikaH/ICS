/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.EAO.RateTypeEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class RateTypeManagerBean implements RateTypeManager{
    
    /**
     * Default constructor. 
     */
	
    @EJB
    RateTypeEAO rateTypeDAO;
	
    public RateTypeManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RateType getRateType(short rateTypeId) throws Exception {
       
        return rateTypeDAO.getRateType(rateTypeId);
    }

    @Override
    public void addRateType(RateType rateType) throws Exception {
        rateTypeDAO.create(rateType);
    }

    @Override
    public void removeRateType(short rateTypeId) throws Exception {
        RateType rateType = new RateType();
        rateType.setId(rateTypeId);
        rateTypeDAO.delete(rateType);
       
    }
    
    @Override
    public void updateRateType(RateType rateType) throws Exception {
        rateTypeDAO.update(rateType);
    }
    
    @Override
    public List<RateType> getAllRateTypeList() throws Exception {
        return rateTypeDAO.getAllRateTypeList();
    }

}
