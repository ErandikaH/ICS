package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

public class VendorRateTypePM {
	
	
	static List<VendorRateType> list=new ArrayList<VendorRateType>();
	static List<Vendor> vendorList=new ArrayList<Vendor>();
	
	
	public List<VendorRateType> getList() {
		return list;
	}

	public void setList(List<VendorRateType> list) {
		this.list = list;
	}

	
	public static List<Vendor> getVendorList() {
		return vendorList;
	}

	public static void setVendorList(List<Vendor> vendorList) {
		VendorRateTypePM.vendorList = vendorList;
	}

	public VendorRateTypePM() throws Exception{
		
	}

	public static List<VendorRateType> getRateTypeList(String vendorPrimaryContactName) {
		
		//HttpServletRequest req = ServletActionContext.getRequest();
		
		VendorControllerImpl vendor=new VendorControllerImpl();
		
		int vendorId = 0;
		try {
			vendorId = vendor.getVendor(vendorPrimaryContactName).getId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No such vendors");
		}
		
		//int vendorId=Integer.parseInt(req.getParameter("vendorId"));
		VendorRateTypeControllerImpl vendorRate=new VendorRateTypeControllerImpl();
		//System.out.println(vendorId);
		try {
			list=vendorRate.getVendorRateTypeByVendorId(vendorId);
			//list=vendorRate.getAllVendorRateType();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		return list;
		
	}
	
public static List<Vendor> getVendorList(String vendorPrimaryContactName) {
		
		//HttpServletRequest req = ServletActionContext.getRequest();
		
		VendorControllerImpl vendor=new VendorControllerImpl();

		//System.out.println(vendorId);
		try {
			vendorList=vendor.getAllVendorsListByName(vendorPrimaryContactName);
			//list=vendorRate.getAllVendorRateType();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		return vendorList;
		
	}

public static void main(String args[]) {
	List<Vendor> list1=new ArrayList<Vendor>();
	System.out.println(VendorRateTypePM.getVendorList("firstName1"));
	try{
	list1=VendorRateTypePM.getVendorList("firstName1");
	for(Vendor v:list1){
		System.out.println(v.getPrimaryContactName());
		System.out.println(v.getSecondaryContactName());
		System.out.println("========================");
	}
	}catch(NullPointerException e){
		e.printStackTrace();
	}
//	
}
}
