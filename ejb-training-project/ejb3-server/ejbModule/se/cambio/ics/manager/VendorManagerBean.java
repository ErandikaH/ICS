/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.EAO.VendorEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class VendorManagerBean implements VendorManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    VendorEAO vendorDAO;
	
    public VendorManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
   // @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Vendor getVendor(int vendorId)throws Exception{
        return vendorDAO.getVendor(vendorId);
    }

    @Override
    public void addVendor(Vendor vendor) throws Exception {
        vendorDAO.create(vendor);
    }

   @Override
    public void removeVendor(int vendorId,int version) throws Exception {
        Vendor vendor=new Vendor();
        vendor.setId(vendorId);
        vendor.setVersion(version);
        vendorDAO.delete(vendor);
    }

    @Override
    public void updateVendor(Vendor vendor) throws Exception{
        vendorDAO.update(vendor);
    }

    @Override
    public List<Vendor> getAllVendorsList()  throws Exception{
        return vendorDAO.getAllVendorsList();
    }

    @Override
    public Vendor getVendor(String lastName) throws Exception{
    	return vendorDAO.getVendor(lastName);
    }

	@Override
	public List<Vendor> getAllVendorsListByName(String primaryContactName)throws Exception{
		// TODO Auto-generated method stub
		return vendorDAO.getAllVendorsListByName(primaryContactName);
	}

    
}
