/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Vendor;

/**
 *
 * @author PC
 */
public interface VendorManager {
    
    public Vendor getVendor(int vendorId) throws Exception;
    
    public Vendor getVendor(String lastName) throws Exception;
    
    public List<Vendor> getAllVendorsList()throws Exception;
    
    public List<Vendor> getAllVendorsListByName(String primaryContactName)throws Exception;

    public void addVendor(Vendor vendor) throws Exception;

    public void removeVendor(int vendorId,int version) throws Exception;

    public void updateVendor(Vendor vendor) throws Exception;
    
}
