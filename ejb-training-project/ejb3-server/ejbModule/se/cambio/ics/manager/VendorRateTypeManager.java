/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.VendorRateType;

/**
 *
 * @author PC
 */
public interface VendorRateTypeManager {
    
    public VendorRateType getVendorRateType(int vendorRateTypeId)throws Exception;

    public void addVendorRateType(VendorRateType vendorRateType) throws Exception;

    public void removeVendorRateType(int vendorRateTypeId)throws Exception ;

    public void updateVendorRateType(VendorRateType vendorRateType)throws Exception ;
    
    public List<VendorRateType> getAllVendorRateType() throws Exception;
    
    public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception;
    
    public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId)throws Exception ;
    
    public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId)throws Exception ;

    
}
