package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class SearchItemsListAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Item> aaData=new ArrayList<Item>();
	
	private String assetNo;
	private String serialNo;
	private String statusName;

	
	public List<Item> getAaData() {
		return aaData;
	}
	public void setAaData(List<Item> aaData) {
		this.aaData = aaData;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	ItemControllerImpl itemController=new ItemControllerImpl();
	
	@Override
	public String execute() {
		
		if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
			aaData=searchByAssetNumber(assetNo);
		}else if(!assetNo.equals("0")){
			try {
				aaData=searchByAssetNumber(assetNo);
			
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchItemsListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
//		}else if(!assetNo.equals("0") && !serialNo.equals("0") && !statusName.equals("0")){
//			
		}else{
			try {
	
				aaData=itemController.getAllItemsList();
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchItemsListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
		}
/*		}else if(serialNo!=null){
			aaData=searchByserialNo(serialNo);}*/
//		}else if(statusName!=null){
//			aaData=searchByStatus(statusName);
		
		
//		int no=Integer.parseInt(year);
//		Date date=new Date();
//		Calendar cal = Calendar.getInstance();
//	    cal.setTime(date);
//	    int currentYear = cal.get(Calendar.YEAR);
//	    int y=currentYear-no;
//		//System.out.println(y);
//		ItemControllerImpl itemDelegate=new ItemControllerImpl();
//
//		
//		try {
//			aaData=itemDelegate.GetOlderAssetsGivenYear(y);
//
//		} catch (Exception e1) {
//			java.util.logging.Logger.getLogger(SearchItemsByGivenYearsAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
//		}
		//return null;
		return SUCCESS;
	}
	
	
//	private List<Item> searchByGivenYears(String year){
//		aaData.clear();
//		int no=Integer.parseInt(year);
//		Date date=new Date();
//		Calendar cal = Calendar.getInstance();
//	    cal.setTime(date);
//	    int currentYear = cal.get(Calendar.YEAR);
//	    int y=currentYear-no;
//		//System.out.println(y);
//	
//		try {
//			aaData=itemController.getOlderAssetsGivenYear(y);
//			
//		} catch (Exception e1) {
//			java.util.logging.Logger.getLogger(SearchItemsListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
//		}
//		return aaData;
//	}
	
	private List<Item> searchByAssetNumber(String assetNo){
		aaData.clear();	
		
		try {
			aaData=itemController.getItemByAssetNumber(assetNo);
			
		} catch (Exception e1) {
			java.util.logging.Logger.getLogger(SearchItemsListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
		}
		return aaData;
	}

	private List<Item> searchByserialNo(String serialNo){
		aaData.clear();
		int serialNumber=Integer.parseInt(serialNo);
		System.out.println(serialNumber);
		try {
			aaData=itemController.getItemBySerialNo(serialNumber);
			System.out.println(aaData);
//			for(Item i:aaData){
//				System.out.println(i.getAssetNumber());
//			}
		} catch (Exception e1) {
			//java.util.logging.Logger.getLogger(SearchItemsByGivenYearsAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
		}
		return aaData;
	}
	
	private List<Item> searchByStatus(String status){
		aaData.clear();
		try {
			//aaData=itemController.GetOlderAssetsGivenYear(y);
	
		} catch (Exception e1) {
			java.util.logging.Logger.getLogger(SearchItemsListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
		}
		return aaData;
	}
	
//	public static void main(String args[]){
//		SearchItemsByGivenYearsAction s=new SearchItemsByGivenYearsAction();
//		s.searchByserialNo("1111");
//	}

}
