package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.service.RateTypeService;

public class RateTypeControllerImpl extends GenericDelegate<RateType> implements
		RateTypeController {

	private RateTypeService service;

    public RateTypeControllerImpl(){

        String beanName = "RateTypeServiceImpl";
        String viewClassName = "se.cambio.ics.service.RateTypeService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (RateTypeService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }
    
	@Override
	public RateType getRateType(short rateTypeId) throws Exception {
		try {
            return service.getRateType(rateTypeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}

	@Override
    public void addRateType(RateType rateType) throws Exception{
        try {
            service.addRateType(rateType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteRateType(short rateTypeId) throws Exception {
        try {
            service.deleteRateType(rateTypeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyRateType(RateType rateType) throws Exception{
        try {
            service.modifyRateType(rateType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public List<RateType> getAllRateTypeList() throws Exception {
		try {
            return service.getAllRateTypeList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

}
