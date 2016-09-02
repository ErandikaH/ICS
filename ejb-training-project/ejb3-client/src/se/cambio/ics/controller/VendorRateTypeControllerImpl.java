/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.action.VendorRateTypeAction;
import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.service.VendorRateTypeService;

/**
 *
 * @author PC
 */
public class VendorRateTypeControllerImpl extends GenericDelegate<VendorRateType> implements VendorRateTypeController{

    private VendorRateTypeService service;

    public VendorRateTypeControllerImpl(){

        String beanName = "VendorRateTypeServiceImpl";
        String viewClassName = "se.cambio.ics.service.VendorRateTypeService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (VendorRateTypeService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
        	java.util.logging.Logger.getLogger(VendorRateTypeControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public VendorRateType getVendorRateType(int vendorRateTypeId) throws Exception{
        
            return service.getVendorRateType(vendorRateTypeId);
        
    }

    @Override
    public void addVendorRateType(VendorRateType vendorRateType) throws Exception{
        
            service.addVendorRateType(vendorRateType);
        
    }

    @Override
    public void deleteVendorRateType(int vendorRateTypeId)  throws Exception{
        
            service.deleteVendorRateType(vendorRateTypeId);
        
    }

    @Override
    public void modifyVendorRateType(VendorRateType vendorRateType)throws Exception {
       
            service.modifyVendorRateType(vendorRateType);
        
    }

	@Override
	public List<VendorRateType> getAllVendorRateType()throws Exception {
		
            return service.getAllVendorRateType();
        
     
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId) throws Exception{
		
            return service.getVendorRateTypeByVendorId(vendorId);
       
        
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId)throws Exception{
		
            return service.getVendorRateTypeByRateTypeId(rateTypeId);
        
       
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId) throws Exception{
		
            return service.getVendorRateTypeByRateLevelId(rateLevelId);
        
	}
    
}
