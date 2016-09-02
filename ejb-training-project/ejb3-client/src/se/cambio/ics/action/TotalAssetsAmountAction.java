package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.AssignItemController;
import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.controller.ItemController;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.model.ItemAmountQty;
import se.cambio.ics.persistence.Category;

import com.opensymphony.xwork2.ActionSupport;

public class TotalAssetsAmountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ItemController itemdel;
	
	ArrayList<ItemAmountQty> list=new ArrayList<ItemAmountQty>();
	
	
	
	public ArrayList<ItemAmountQty> getList() {
		return list;
	}

	public void setList(ArrayList<ItemAmountQty> list) {
		this.list = list;
	}

	public TotalAssetsAmountAction() throws Exception{

		itemdel=new ItemControllerImpl();
		
	}

	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		String categoryName=req.getParameter("selectedCategoryName");
		
		CategoryControllerImpl categoryCon=new CategoryControllerImpl();
		long categoryId = 0;
		try {
			//categoryId=categoryCon.getCategoryByName(categoryName).getCategoryId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ItemAmountQty iaq=new ItemAmountQty();
		Object[] o;
		try {
			o=itemdel.totalAmountOfAssetsAndQtyByCategoryId(categoryId);
	
				iaq.setPrice((double)o[0]);
				iaq.setCount((long) o[1]);
				iaq.setName((String) o[2]);
				list.add(iaq);
				
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return SUCCESS;
		
	}

}
