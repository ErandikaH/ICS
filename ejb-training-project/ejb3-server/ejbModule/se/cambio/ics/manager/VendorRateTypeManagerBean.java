/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

//import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.persistence.EAO.VendorRateTypeEAO;



/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class VendorRateTypeManagerBean implements VendorRateTypeManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    VendorRateTypeEAO vendorRateTypeDAO;
	
    @Override
    public VendorRateType getVendorRateType(int vendorRateTypeId) throws Exception{
        return vendorRateTypeDAO.getVendorRateType(vendorRateTypeId);
    }

    @Override
    public void addVendorRateType(VendorRateType vendorRateType) throws Exception{
        vendorRateTypeDAO.create(vendorRateType);
    }
    
    @Override
    public void removeVendorRateType(int vendorRateTypeId) throws Exception{
        VendorRateType vrt=new VendorRateType();
        vrt.setId(vendorRateTypeId);
        vendorRateTypeDAO.delete(vrt);
    }
    
    @Override
    public void updateVendorRateType(VendorRateType vendorRateType) throws Exception {
        vendorRateTypeDAO.update(vendorRateType);
    }
    
    @Override
    public List<VendorRateType> getAllVendorRateType()throws Exception{
    	return vendorRateTypeDAO.getAllVendorRateType();
    }
    
    @Override
    public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception{
    	return vendorRateTypeDAO.getVendorRateTypeByVendorId(vendorId);
    }
    
    @Override
    public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId) throws Exception{
    	return vendorRateTypeDAO.getVendorRateTypeByRateTypeId(rateTypeId);
    }

	@Override
	public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId)throws Exception {
		return vendorRateTypeDAO.getVendorRateTypeByRateLevelId(rateLevelId);
	}

    
    
}
