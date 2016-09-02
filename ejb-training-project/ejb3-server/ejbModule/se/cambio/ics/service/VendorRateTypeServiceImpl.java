/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.VendorRateTypeManager;
import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class VendorRateTypeFacadeImpl
 */

@Stateless
public class VendorRateTypeServiceImpl implements VendorRateTypeService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    VendorRateTypeManager vendorRateTypeService;

    @Override
    public VendorRateType getVendorRateType(int vendorRateTypeId) throws Exception {
       
            return vendorRateTypeService.getVendorRateType(vendorRateTypeId);
        
    }

    @Override
    public void addVendorRateType(VendorRateType vendorRateType) throws Exception{
      
            vendorRateTypeService.addVendorRateType(vendorRateType);
       
    }

    @Override
    public void deleteVendorRateType(int vendorRateTypeId)  throws Exception{
      
            vendorRateTypeService.removeVendorRateType(vendorRateTypeId);
       
    }

    @Override
    public void modifyVendorRateType(VendorRateType vendorRateType)throws Exception{
       
            vendorRateTypeService.updateVendorRateType(vendorRateType);
       
    }

	@Override
	public List<VendorRateType> getAllVendorRateType() throws Exception{
	
            return vendorRateTypeService.getAllVendorRateType();
       
        
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception{
		
            return vendorRateTypeService.getVendorRateTypeByVendorId(vendorId);
       
        
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId) throws Exception{
		
            return vendorRateTypeService.getVendorRateTypeByRateTypeId(rateTypeId);
        
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId) throws Exception{
		
            return vendorRateTypeService.getVendorRateTypeByRateLevelId(rateLevelId);
       
	}
    
}
