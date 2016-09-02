package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class SearchVendorAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private List<Vendor> aaData=new ArrayList<Vendor>();
	
	private String vendorName;
	private String rateType;
	private String rateLevel;

	public List<Vendor> getaaData() {
		return aaData;
	}

	public void setaaData(List<Vendor> aaData) {
		this.aaData = aaData;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getRateLevel() {
		return rateLevel;
	}

	public void setRateLevel(String rateLevel) {
		this.rateLevel = rateLevel;
	}


	private VendorControllerImpl vendorController=new VendorControllerImpl();
	private VendorRateTypeControllerImpl vendorRateType=new VendorRateTypeControllerImpl();

	private List<VendorRateType> vrtList=new ArrayList<VendorRateType>();
	private List<Integer> vendorIdList=new ArrayList<Integer>();
	
	
	@Override
	public String execute() {
		
	//	if(rateType!=null && rateLevel!=null && vendorName!=null){
		if(!rateType.equals("0") && !rateLevel.equals("0") && !vendorName.equals("0")){
			aaData=searchByRateTypeRateLevelVendorName(rateType, rateLevel, vendorName);
		}else if(!rateType.equals("0") && !rateLevel.equals("0")){
			//System.out.println("test2");
			aaData=searchByRateTypeRateLevel(rateType, rateLevel);
		}else if(!rateLevel.equals("0") && !vendorName.equals("0")){
			//System.out.println("test3");
			aaData=searchByRateLevelVendorName(rateLevel, vendorName);
		}else if(!rateType.equals("0") && !vendorName.equals("0")){
			//System.out.println(rateType);
			aaData=searchByRateTypeVendorName(rateType, vendorName);
		}else if(!vendorName.equals("0")){
			try {
				aaData=searchByVendorName(vendorName);
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
//			for (Vendor vendor : aaData) {
//				System.out.println(vendor.getCompanyName());
//			}
		}else if(!rateType.equals("0")){
			//System.out.println("test6");
			aaData=searchByRateType(rateType);
		}else if(!rateLevel.equals("0")){
			//System.out.println("test7");
			aaData=searchByRateLevel(rateLevel);
		}else{
			//System.out.println("test8");
			try {
				aaData=vendorController.getAllVendorsList();
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
		}
		
		//return null;
		return SUCCESS;
		
	}
	
	private List<Vendor> searchByRateTypeRateLevelVendorName(String rateType,String rateLevel,String vendorName){
		vrtList.clear();
		aaData.clear();
		List<VendorRateType> vrtList2=new ArrayList<VendorRateType>();
		List<Integer> vrtIdList=new ArrayList<Integer>();
		List<Integer> vrtIdList2=new ArrayList<Integer>();
		
		List<Integer> vendorIdList2=new ArrayList<Integer>();
		
		try {
			short rateTypeId=Short.parseShort(rateType);
			vrtList=vendorRateType.getVendorRateTypeByRateTypeId(rateTypeId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vrtIdList.add(vendorRateType2.getId());
				
			}
			vrtList.clear();
			
			short rateLevelId=Short.parseShort(rateLevel);
			vrtList=vendorRateType.getVendorRateTypeByRateLevelId(rateLevelId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vrtIdList2.add(vendorRateType2.getId());
			}
			
			if(vrtIdList.size()<=vrtIdList2.size()){
				
				for(int i=0;i<vrtIdList.size();i++){
					for(int j=0;j<vrtIdList2.size();j++){
						if(vrtIdList.get(i)==vrtIdList2.get(j)){
							vrtList2.add(vendorRateType.getVendorRateType(vrtIdList2.get(j)));
							break;
						}		
					}	
				}
			}else{
				for(int i=0;i<vrtIdList2.size();i++){
					for(int j=0;j<vrtIdList.size();j++){
						if(vrtIdList2.get(i)==vrtIdList.get(j)){
							vrtList2.add(vendorRateType.getVendorRateType(vrtIdList.get(j)));
							break;
						}	
					}
				}
			}

			for (VendorRateType vendorRateType2 : vrtList2) {	
				vendorIdList2.add(vendorRateType2.getVendor().getId());
					
			}
			
			vrtList.clear();
			//to remove duplicate values
			HashSet<Integer> hashSet = new HashSet<Integer>(vendorIdList2);
			vendorIdList2=new ArrayList<Integer>(hashSet);
			
			List<String> comName1=new ArrayList<String>();
			List<String> comName2=new ArrayList<String>();
		
			for(int i=0;i<vendorIdList2.size();i++){
				comName1.add(vendorController.getVendor(vendorIdList2.get(i)).getCompanyName());
			}
			aaData=vendorController.getAllVendorsListByName(vendorName);
			for (Vendor vendor : aaData) {
				comName2.add(vendor.getCompanyName());
			
			}
			aaData.clear();
			
			if(comName1.size()<= comName2.size()){
				for(int i=0;i<comName1.size();i++){
					for(int j=0;j<comName2.size();j++){
						if(comName1.get(i).equals(comName2.get(j))){
							aaData.add(vendorController.getVendor(comName2.get(j)));
							break;
						}	
					}
				}
				
			}else{
				for(int i=0;i<comName2.size();i++){
					for(int j=0;j<comName1.size();j++){
						if(comName2.get(i).equals(comName1.get(j))){
							aaData.add(vendorController.getVendor(comName1.get(j)));
							break;
						}
					}
				}
			}

//			for(Vendor v:aaData){
//				System.out.println("list8: "+v.getPrimaryContactName());
//			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		return aaData;
	}
	
	private List<Vendor> searchByRateTypeRateLevel(String rateType,String rateLevel){
		vrtList.clear();
		aaData.clear();
		List<VendorRateType> vrtList2=new ArrayList<VendorRateType>();
		List<Integer> vrtIdList=new ArrayList<Integer>();
		List<Integer> vrtIdList2=new ArrayList<Integer>();
		
		try {
			short rateTypeId=Short.parseShort(rateType);
			vrtList=vendorRateType.getVendorRateTypeByRateTypeId(rateTypeId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vrtIdList.add(vendorRateType2.getId());
				
			}
			vrtList.clear();
			
			short rateLevelId=Short.parseShort(rateLevel);
			vrtList=vendorRateType.getVendorRateTypeByRateLevelId(rateLevelId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vrtIdList2.add(vendorRateType2.getId());
			}
			
			if(vrtIdList.size()<=vrtIdList2.size()){
				
				for(int i=0;i<vrtIdList.size();i++){
					for(int j=0;j<vrtIdList2.size();j++){
						if(vrtIdList.get(i)==vrtIdList2.get(j)){
							vrtList2.add(vendorRateType.getVendorRateType(vrtIdList2.get(j)));
							break;
						}		
					}	
				}
			}else{
				for(int i=0;i<vrtIdList2.size();i++){
					for(int j=0;j<vrtIdList.size();j++){
						if(vrtIdList2.get(i)==vrtIdList.get(j)){
							vrtList2.add(vendorRateType.getVendorRateType(vrtIdList.get(j)));
							break;
						}	
					}
				}
			}

			for (VendorRateType vendorRateType2 : vrtList2) {	
				aaData.add(vendorController.getVendor(vendorRateType2.getVendor().getId()));	
			}
//			for(Vendor v:aaData){
//				System.out.println("list5: "+v.getId());
//			}
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}	

		return aaData;
	}
	
	private List<Vendor> searchByRateTypeVendorName(String rateType,String vendorName){
		vrtList.clear();
		aaData.clear();
		vendorIdList.clear();
		
		List<Integer> vendorIdList2=new ArrayList<Integer>();
		
		try {
			short rateTypeId=Short.parseShort(rateType);
			vrtList=vendorRateType.getVendorRateTypeByRateTypeId(rateTypeId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				
				vendorIdList2.add(vendorRateType2.getVendor().getId());
				
			}
			vrtList.clear();
			//to remove duplicate values
			HashSet<Integer> hashSet = new HashSet<Integer>(vendorIdList2);
			vendorIdList2=new ArrayList<Integer>(hashSet);
			
			List<String> comName1=new ArrayList<String>();
			List<String> comName2=new ArrayList<String>();
		
			for(int i=0;i<vendorIdList2.size();i++){
				comName1.add(vendorController.getVendor(vendorIdList2.get(i)).getCompanyName());
			}
			aaData=vendorController.getAllVendorsListByName(vendorName);
			for (Vendor vendor : aaData) {
				comName2.add(vendor.getCompanyName());
			
			}
			aaData.clear();
			
			if(comName1.size()<= comName2.size()){
				for(int i=0;i<comName1.size();i++){
					for(int j=0;j<comName2.size();j++){
						if(comName1.get(i).equals(comName2.get(j))){
							aaData.add(vendorController.getVendor(comName2.get(j)));
							break;
						}	
					}
				}
				
			}else{
				for(int i=0;i<comName2.size();i++){
					for(int j=0;j<comName1.size();j++){
						if(comName2.get(i).equals(comName1.get(j))){
							aaData.add(vendorController.getVendor(comName1.get(j)));
							break;
						}
					}
				}
			}

//			for(Vendor v:aaData){
//				System.out.println("list6: "+v.getPrimaryContactName());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		return aaData;
	}
	
	private List<Vendor> searchByRateLevelVendorName(String rateLevel,String vendorName){
		vrtList.clear();
		aaData.clear();
		vendorIdList.clear();
		
		List<Integer> vendorIdList2=new ArrayList<Integer>();
		
		try {
			short rateLevelId=Short.parseShort(rateLevel);
			vrtList=vendorRateType.getVendorRateTypeByRateLevelId(rateLevelId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vendorIdList2.add(vendorRateType2.getVendor().getId());
			}
			
			vrtList.clear();
			//to remove duplicate values
			HashSet<Integer> hashSet = new HashSet<Integer>(vendorIdList2);
			vendorIdList2=new ArrayList<Integer>(hashSet);
			
			List<String> comName1=new ArrayList<String>();
			List<String> comName2=new ArrayList<String>();
		
			for(int i=0;i<vendorIdList2.size();i++){
				comName1.add(vendorController.getVendor(vendorIdList2.get(i)).getCompanyName());
			}
			aaData=vendorController.getAllVendorsListByName(vendorName);
			for (Vendor vendor : aaData) {
				comName2.add(vendor.getCompanyName());
			
			}
			aaData.clear();
			
			if(comName1.size()<= comName2.size()){
				for(int i=0;i<comName1.size();i++){
					for(int j=0;j<comName2.size();j++){
						if(comName1.get(i).equals(comName2.get(j))){
							aaData.add(vendorController.getVendor(comName2.get(j)));
							break;
						}	
					}
				}
				
			}else{
				for(int i=0;i<comName2.size();i++){
					for(int j=0;j<comName1.size();j++){
						if(comName2.get(i).equals(comName1.get(j))){
							aaData.add(vendorController.getVendor(comName1.get(j)));
							break;
						}
					}
				}
			}

//			for(Vendor v:aaData){
//				System.out.println("list7: "+v.getPrimaryContactName());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		return aaData;
	}
	
	private List<Vendor> searchByVendorName(String vendorName) throws Exception{
		aaData.clear();
		aaData=vendorController.getAllVendorsListByName(vendorName);
		return aaData;
	}
	
	private List<Vendor> searchByRateType(String rateType){
		vrtList.clear();
		aaData.clear();
		
		try {
			short rateTypeId=Short.parseShort(rateType);
			vrtList=vendorRateType.getVendorRateTypeByRateTypeId(rateTypeId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vendorIdList.add(vendorController.getVendor(vendorRateType2.getVendor().getId()).getId());
				
			}
			//to remove duplicate values
			HashSet<Integer> hashSet = new HashSet<Integer>(vendorIdList);
			vendorIdList=new ArrayList<Integer>(hashSet);
			
			for(int i=0;i<vendorIdList.size();i++){
				aaData.add(vendorController.getVendor(vendorIdList.get(i)));
			}
//			for(Vendor v:aaData){
//				System.out.println("list2: "+v.getId());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		return aaData;
	}
	
	private List<Vendor> searchByRateLevel(String rateLevel){
		vrtList.clear();
		aaData.clear();
		vendorIdList.clear();
		
		try {
			short rateLevelId=Short.parseShort(rateLevel);
			vrtList=vendorRateType.getVendorRateTypeByRateLevelId(rateLevelId);
			
			for (VendorRateType vendorRateType2 : vrtList) {
				vendorIdList.add(vendorController.getVendor(vendorRateType2.getVendor().getId()).getId());
					
			}
			//to remove duplicate values
			HashSet<Integer> hashSet = new HashSet<Integer>(vendorIdList);
			vendorIdList=new ArrayList<Integer>(hashSet);
			
			for(int i=0;i<vendorIdList.size();i++){
				aaData.add(vendorController.getVendor(vendorIdList.get(i)));
			}
//			for(Vendor v:aaData){
//				System.out.println("list3: "+v.getId());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(SearchVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		return aaData;
	}
	
//	public static void main(String args[]){
//		SearchVendorAction s=new SearchVendorAction();
//		s.execute1();
//	}
	
	
}
