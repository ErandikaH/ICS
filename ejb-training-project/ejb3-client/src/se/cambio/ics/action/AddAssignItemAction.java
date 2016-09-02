package se.cambio.ics.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.controller.AssignedItemStatusControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.LocationControllerImpl;
import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class AddAssignItemAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	AssignItem assignItem=new AssignItem();
	
	ItemControllerImpl item=null;
	UserControllerImpl user=null;
	LocationControllerImpl location=null;
	AssignedItemStatusControllerImpl aisc=null;
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		
//		long id=Long.parseLong(req.getParameter("itemId"));
//		item.setId(id);
		
		assignItem.setRemarks(req.getParameter("remarksA"));

		
		String sDate = req.getParameter("startDate");
		String eDate = req.getParameter("endDate");
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date dateStart = null;
		Date dateEnd = null;
		try {
			dateStart= format.parse(sDate);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			return ERROR;
			
		}
		assignItem.setStartDate(dateStart);
		try {
			dateEnd= format.parse(eDate);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			return ERROR;
		}
		assignItem.setEndDate(dateEnd);
		
		item=new ItemControllerImpl();
		user=new UserControllerImpl();
		location=new LocationControllerImpl();
		aisc=new AssignedItemStatusControllerImpl();
		
	
		Item i = null;
		try {
		//	i=item.getItemBySerialNo(Integer.parseInt(req.getParameter("selectedSerialNo")));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	
		assignItem.setItem(i);

		User u = null;
		try {
			u = user.getUserByName(req.getParameter("selectedUserName"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		assignItem.setUser(u);
	
		Location l = null;
		try {
			l=location.getLocation(Integer.parseInt(req.getParameter("selectedLocationId")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		assignItem.setLocation(l);

		AssignedItemStatus ais = null;
		try {
			ais=aisc.getAssignedItemStatus(req.getParameter("selectedAssignItemStatusName"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		assignItem.setAssignItemStatusId(ais);
		
		AssignItemControllerImpl assignItemController=new AssignItemControllerImpl();

		try {
			assignItemController.addAssignItem(assignItem);
			
			return SUCCESS;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}

		
		//return SUCCESS;
	}

}
