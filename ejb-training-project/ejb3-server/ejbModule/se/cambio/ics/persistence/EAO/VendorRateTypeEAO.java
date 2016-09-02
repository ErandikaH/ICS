/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface VendorRateTypeEAO extends GenericEAO<VendorRateType>{
    
    public VendorRateType getVendorRateType(int vendorRateTypeId) throws Exception;
    
    public List<VendorRateType> getAllVendorRateType() throws Exception;
    
    public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception ;
    
    public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId) throws Exception;
    
    public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId) throws Exception;

}
