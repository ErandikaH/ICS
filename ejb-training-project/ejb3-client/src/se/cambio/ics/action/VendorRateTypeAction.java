package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.controller.InvoiceControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class VendorRateTypeAction extends ActionSupport {

	/**
	 * 
	 */
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

	public VendorRateTypeAction() throws Exception{
		
	}

	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		
		
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
				list=vendorRate.getVendorRateTypeByVendorId(vendorId);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				//list=vendorRate.getVendorRateTypeByVendorId(1);
				vendorList=vendorController.getAllVendorsListByName(vendorName);
				//System.out.println("vendorList1:"+vendorList);
//				for(Vendor v:vendorList){
//					System.out.println(v.getPrimaryContactName());
//				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;
			}
			
//		}else if(categoryName!=null){
//			CategoryControllerImpl category=new CategoryControllerImpl();
//			ItemControllerImpl item=new ItemControllerImpl();
//			InvoiceControllerImpl invoice=new InvoiceControllerImpl();
//			
//			List<Item> itemList=new ArrayList<Item>();
//			List<Long> invoiceIdList=new ArrayList<Long>();
//			List<Long> invoiceIdList2=new ArrayList<Long>();
//			
//			List<Integer> vendorIdList=new ArrayList<Integer>();
//			List<Vendor> vendorList=new ArrayList<Vendor>();
//			
//			try {
//				long categoryId=category.getCategoryByName(categoryName).getCategoryId();
//				itemList=item.getItemListByCategoryId(categoryId);
//				
//				for(Item i:itemList){
//					long invoiceId=i.getInvoice().getId();
//					invoiceIdList.add(invoiceId);
//				}
//				
//				HashSet<Long> listToSet = new HashSet<Long>(invoiceIdList);
//			      
//		        //Creating Arraylist without duplicate values
//		        invoiceIdList2 = new ArrayList<Long>(listToSet);
//
//		
//				for (int i = 0; i < invoiceIdList2.size(); i++) {
//					
//					vendorIdList.add(invoice.getInvoice(invoiceIdList2.get(i)).getVendor().getId());
//					
//				}
//				
//				for (int i = 0; i < vendorIdList.size(); i++) {
//					vendorList.add(vendorController.getVendor(vendorIdList.get(i)));
//				}
//				
//				for (Vendor v : vendorList) {
//					System.out.println(v.getPrimaryContactName());
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		}else{
			try {
				//list=vendorRate.getVendorRateTypeByVendorId(1);
				vendorList=vendorController.getAllVendorsList();
				System.out.println("vendorList2:"+vendorList);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;
			}
			try {
				//list=vendorRate.getVendorRateTypeByVendorId(1);
				list=vendorRate.getAllVendorRateType();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;
			}
		}
			
//		if(vendorName2!=null){
//			VendorControllerImpl vendor=new VendorControllerImpl();
//			
//			int vendorId = 0;
//			try {
//				vendorId = vendor.getVendor(vendorName2).getId();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				//e.printStackTrace();
//				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
//				System.out.println("No such vendor rates");
//			}
//			
//			try {
//				list=vendorRate.getVendorRateTypeByVendorId(vendorId);
//				
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
//				//e.printStackTrace();
//			}
//			
//			
//		}else{
//			//int vendorId=Integer.parseInt(req.getParameter("vendorId"));
//			
//			//System.out.println(vendorName2);
//			try {
//				//list=vendorRate.getVendorRateTypeByVendorId(1);
//				list=vendorRate.getAllVendorRateType();
//				
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
//				//return ERROR;
//			}
//		
//		}
			
	
			try {
				rateTypeList=rateTypeController.getAllRateTypeList();
				rateLevelList=rateLevelController.viewAllRateLevels();
				vendorList=vendorController.getAllVendorsList();
				
				for(RateType rateType: rateTypeList){
					rateTypeNameList.add(rateType.getTypeName());
				}
				
				for(RateLevel rateLevel:rateLevelList){
					rateLevelNameList.add(rateLevel.getRateLevelName());
				}
				
				for(Vendor vendor:vendorList){
					vendorNameList.add(vendor.getPrimaryContactName());
				}
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				java.util.logging.Logger.getLogger(VendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				return ERROR;
			}
			return SUCCESS;
		
	}

}
