package se.cambio.ics.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.opensymphony.xwork2.ActionSupport;

public class SearchVendorByNameAction extends ActionSupport {
	
private static final long serialVersionUID = 1L;
	
	List<VendorRateType> list=new ArrayList<VendorRateType>();
	List<VendorRateType> searchList=new ArrayList<VendorRateType>();

	List<RateLevel> rateLevelList=new ArrayList<RateLevel>();
	List<RateType> rateTypeList=new ArrayList<RateType>();
	List<Vendor> vendorList=new ArrayList<Vendor>();
	
	List<String> rateLevelNameList=new ArrayList<String>();
	List<String> rateTypeNameList=new ArrayList<String>();
	List<String> vendorNameList=new ArrayList<String>();

	private String selectedVendorName;
	private String selectedRateTypeName;
	private String selectedRateLevelName;
	
	
	public List<RateLevel> getRateLevelList() {
		return rateLevelList;
	}

	public void setRateLevelList(List<RateLevel> rateLevelList) {
		this.rateLevelList = rateLevelList;
	}

	public List<VendorRateType> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<VendorRateType> searchList) {
		this.searchList = searchList;
	}

	public List<RateType> getRateTypeList() {
		return rateTypeList;
	}

	public void setRateTypeList(List<RateType> rateTypeList) {
		this.rateTypeList = rateTypeList;
	}

	
	public List<String> getRateLevelNameList() {
		return rateLevelNameList;
	}

	public void setRateLevelNameList(List<String> rateLevelNameList) {
		this.rateLevelNameList = rateLevelNameList;
	}

	public List<String> getRateTypeNameList() {
		return rateTypeNameList;
	}

	public void setRateTypeNameList(List<String> rateTypeNameList) {
		this.rateTypeNameList = rateTypeNameList;
	}

	
	
	public List<Vendor> getVendorList() {
		return vendorList;
	}

	public void setVendorList(List<Vendor> vendorList) {
		this.vendorList = vendorList;
	}

	public List<String> getVendorNameList() {
		return vendorNameList;
	}

	public void setVendorNameList(List<String> vendorNameList) {
		this.vendorNameList = vendorNameList;
	}

	
	
	public List<VendorRateType> getList() {
		return list;
	}

	public void setList(List<VendorRateType> list) {
		this.list = list;
	}

	public String getSelectedVendorName() {
		return selectedVendorName;
	}

	public void setSelectedVendorName(String selectedVendorName) {
		this.selectedVendorName = selectedVendorName;
	}

	public String getSelectedRateTypeName() {
		return selectedRateTypeName;
	}

	public void setSelectedRateTypeName(String selectedRateTypeName) {
		this.selectedRateTypeName = selectedRateTypeName;
	}

	public String getSelectedRateLevelName() {
		return selectedRateLevelName;
	}

	public void setSelectedRateLevelName(String selectedRateLevelName) {
		this.selectedRateLevelName = selectedRateLevelName;
	}

	public SearchVendorByNameAction() throws Exception{
		
	}

	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		try {
			PrintWriter out = response.getWriter();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        response.setContentType("text/html");
        response.setHeader("Cache-control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "-1");
  
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setHeader("Access-Control-Max-Age", "86400");
		
		VendorRateTypeControllerImpl vendorRate=new VendorRateTypeControllerImpl();
		RateLevelControllerImpl rateLevelController=new RateLevelControllerImpl();
		RateTypeControllerImpl rateTypeController=new RateTypeControllerImpl();
		VendorControllerImpl vendorController=new VendorControllerImpl();
		
		String vendorName=null;
		String categoryName=null;
		try{
			vendorName=req.getParameter("vendorName");
		
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("null");
		}
		
		try{
			categoryName=req.getParameter("categoryName");
		
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("null");
		}
		
		
		String vendorName2=null;
		try{
			vendorName2=req.getParameter("vendorName2");
		
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("null");
		}
		
		if(vendorName!=null){
			VendorControllerImpl vendor=new VendorControllerImpl();
			
			int vendorId = 0;
			try {
				vendorId = vendor.getVendor(vendorName).getId();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("No such vendors");
			}
			try {
			vendorList=vendor.getAllVendorsListByName(vendorName);
			System.out.println("vendorList1:"+vendorList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//System.out.println("No such vendors");
			}
			
			
		}else{
			try {
				//list=vendorRate.getVendorRateTypeByVendorId(1);
				vendorList=vendorController.getAllVendorsList();
				System.out.println("vendorList2:"+vendorList);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				java.util.logging.Logger.getLogger(SearchVendorByNameAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;
			}
			try {
				//list=vendorRate.getVendorRateTypeByVendorId(1);
				list=vendorRate.getAllVendorRateType();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				java.util.logging.Logger.getLogger(SearchVendorByNameAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;
			}
		}
			
		Gson gson = new Gson();
		JsonElement element = gson.toJsonTree(vendorList, new TypeToken<List<Vendor>>() {}.getType());

		JsonArray jsonArray = element.getAsJsonArray();
		response.setContentType("application/json");
		try {
			response.getWriter().print(jsonArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return SUCCESS;
		
	}

}
