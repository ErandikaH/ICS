/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Vendor;

/**
 *
 * @author PC
 */
@Remote
public interface VendorService {
    
    public Vendor getVendor(int vendorId) throws Exception;
    
    public Vendor getVendor(String companyName) throws Exception;
    
    public List<Vendor> getAllVendorsList()throws Exception;
    
    public List<Vendor> getAllVendorsListByName(String companyName)throws Exception;

    public void addVendor(Vendor vendor)throws Exception ;

    public void deleteVendor(int vendorId,int version) throws Exception;

    public void modifyVendor(Vendor vendor)throws Exception;

    
}
