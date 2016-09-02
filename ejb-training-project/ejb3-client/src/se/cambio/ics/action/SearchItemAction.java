package se.cambio.ics.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.ItemController;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.model.GetClassIds;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ItemController itemdel;
	protected static long itemId;
	
	ArrayList<Item> list=new ArrayList<Item>();
	
	ArrayList<GetClassIds> listId=new ArrayList<GetClassIds>();
	
	public ArrayList<Item> getList() {
		return list;
	}

	public void setList(ArrayList<Item> list) {
		this.list = list;
	}

	
	public ArrayList<GetClassIds> getListId() {
		return listId;
	}

	public void setListId(ArrayList<GetClassIds> listId) {
		this.listId = listId;
	}

	public SearchItemAction() throws Exception{
		
		itemdel=new ItemControllerImpl();
		
	}

	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		
		itemId=Long.parseLong(req.getParameter("selectedItemId"));
		
		String sDate=null;
		String eDate = null;
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date dateStart = null;
		Date dateEnd = null;
//		try {
//			dateStart= format.parse(sDate);
//		} catch (ParseException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//			return ERROR;
//			
//		}
//		item.setWarrantyStartDate(dateStart);
//		
		GetClassIds ids=new GetClassIds();
			Item itemL = null;
			try {
				itemL = itemdel.getItemEntity(itemId);
				//System.out.println(itemL.getWarrantyStartDate());
				//itemL.getWarrantyEndDate();
//				dateStart=itemL.getWarrantyStartDate();
//				sDate=format.format(dateStart);
//				
//				try {
//					dateStart= format.parse(sDate);
//				} catch (ParseException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//					return ERROR;
//					
//				}
//				itemL.setWarrantyStartDate(dateStart);
//				
//				dateEnd=itemL.getWarrantyEndDate();
//				eDate=format.format(dateEnd);
//				
//				try {
//					dateEnd= format.parse(eDate);
//					System.out.println(dateEnd);
//				} catch (ParseException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//					return ERROR;
//					
//				}
//				itemL.setWarrantyEndDate(dateEnd);
////				
//				System.out.println("end date: "+itemL.getWarrantyEndDate());
				list.add(itemL);
				
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println("***********== "+list.size());
//					System.out.println("myList: "+list.get(i).getWarrantyEndDate());
//				}
				ids.setCatId(itemL.getCategory().getCategoryId());
				ids.setDepId(itemL.getDepartment().getId());
				ids.setInvoiceId(itemL.getInvoice().getId());
				ids.setManuId(itemL.getManufacturerdetails().getId());
				ids.setStatusId(itemL.getStatus().getId());
				listId.add(ids);
	//			System.out.println(itemL.getAssetNumber()+"--->"+itemL.getSerialNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//}
		return SUCCESS;
		
	}


}
