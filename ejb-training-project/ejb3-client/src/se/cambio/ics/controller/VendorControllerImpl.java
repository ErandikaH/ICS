/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

//import javax.annotation.Resource;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.service.VendorService;

/**
 *
 * @author PC
 */
public class VendorControllerImpl extends GenericDelegate<Vendor> implements VendorController{

    //@Resource
	private VendorService service;

    public VendorControllerImpl(){

        String beanName = "VendorServiceImpl";
        String viewClassName = "se.cambio.ics.service.VendorService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (VendorService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
        	java.util.logging.Logger.getLogger(VendorControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public Vendor getVendor(int vendorId) throws Exception{
       
         return service.getVendor(vendorId);
      
    }

    @Override
    public List<Vendor> getAllVendorsList() throws Exception{
     
            return service.getAllVendorsList();
        
    }

    @Override
    public void addVendor(Vendor vendor)throws Exception{
       
            service.addVendor(vendor);
       
    }

    @Override
    public void deleteVendor(int vendorId,int version) throws Exception{
        
            service.deleteVendor(vendorId,version);
        
    }

    @Override
    public void modifyVendor(Vendor vendor) throws Exception{
        
            service.modifyVendor(vendor);
       
    }

	@Override
	public Vendor getVendor(String companyName) throws Exception {
		
            return service.getVendor(companyName);
       
	}

	@Override
	public List<Vendor> getAllVendorsListByName(String companyName)throws Exception{
		
            return service.getAllVendorsListByName(companyName);
       
	}
    
}
