package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.persistence.Vendor;

import com.opensymphony.xwork2.ActionSupport;

public class DataSearchAction extends ActionSupport {
	
private List<Vendor> aaData=new ArrayList<Vendor>();
    
    private String dummyMsg;
	//Parameter for Jquery
    private String companyName;
        
        
    public List<Vendor> getAaData() {
        return aaData;
    }

    public void setAaData(List<Vendor> aaData) {
        this.aaData = aaData;
    }

    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDummyMsg() {
        return dummyMsg;
    }

    public void setDummyMsg(String dummyMsg) {
        this.dummyMsg = dummyMsg;
    }
    
    
    @Override
    public String execute(){
    	
    	VendorControllerImpl vendor=new VendorControllerImpl();
        if(companyName!=null){
        	try {
				aaData=vendor.getAllVendorsListByName(companyName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        //aaData = BusinessService.getCompanyList(countryName);
            for (Vendor countries : aaData) {
                System.out.println(countries.getCompanyName());
                System.out.println(countries.getPrimaryContactName());
            }
        }else{
           dummyMsg = "Ajax action Triggered";
            System.out.println("test3");
        }
        
        dummyMsg = "test completed.";
        System.out.println("test2");
        System.out.println("test3");
        return SUCCESS;

    }

    

}
