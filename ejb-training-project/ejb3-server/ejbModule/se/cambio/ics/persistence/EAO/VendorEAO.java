/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface VendorEAO extends GenericEAO<Vendor>{
    
    public Vendor getVendor(int vendorId) throws Exception;
    
    public Vendor getVendor(String companyName) throws Exception;
    
    public List<Vendor> getAllVendorsList()throws Exception;
    
    public List<Vendor> getAllVendorsListByName(String companyName)throws Exception;

}
