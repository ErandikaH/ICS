/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.VendorRateType;

/**
 *
 * @author PC
 */

@Remote
public interface VendorRateTypeService {
    
    public VendorRateType getVendorRateType(int vendorRateTypeId)throws Exception;

    public void addVendorRateType(VendorRateType vendorRateType) throws Exception;

    public void deleteVendorRateType(int vendorRateTypeId)throws Exception;

    public void modifyVendorRateType(VendorRateType vendorRateType) throws Exception;
    
    public List<VendorRateType> getAllVendorRateType()throws Exception ;
    
    public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception ;
    
    public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId) throws Exception;

    public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId)throws Exception ;
    
}
