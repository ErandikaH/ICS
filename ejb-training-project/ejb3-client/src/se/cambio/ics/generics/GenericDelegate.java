package se.cambio.ics.generics;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class GenericDelegate<T> {
	
	// The EJB name which by default is the simple class name of the bean
    // implementation class
    private String beanName; //= "ItemFacadeImpl";
    
 // the remote view fully qualified class name
    private String viewClassName; //= "se.cambio.training.emc.item.ItemFacade";
	

    public String getBeanName() {
		return beanName;
	}


	public String getViewClassName() {
		return viewClassName;
	}

	
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}


	public void setViewClassName(String viewClassName) {
		this.viewClassName = viewClassName;
	}


	public T lookupRemoteBean() throws NamingException{
		
		final Properties p = new Properties();
	    p.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
	   
	    // jndiProperties.put("java.naming.factory.initial",
	    // "org.jnp.interfaces.NamingContextFactory");
	    final Context context = new InitialContext(p);

	    // The app name is the application name of the deployed EJBs. This is
	    // typically the ear name
	    // without the .ear suffix. However, the application name could be
	    // overridden in the application.xml of the
	    // EJB deployment on the server.
	    // Since we haven't deployed the application as a .ear, the app name for
	    // us will be an empty string
	    final String appName = "";

	    // This is the module name of the deployed EJBs on the server. This is
	    // typically the jar name of the
	    // EJB deployment, without the .jar suffix, but can be overridden via
	    // the ejb-jar.xml
	    // In this example, we have deployed the EJBs in a
	    // jboss-as-ejb-remote-app.jar, so the module name is
	    // jboss-as-ejb-remote-app
	    final String moduleName = "ejb3-server";

	    // AS7 allows each deployment to have an (optional) distinct name. We
	    // haven't specified a distinct name for
	    // our EJB deployment, so this is an empty string
	    final String distinctName = "";

	    // The EJB name which by default is the simple class name of the bean
	    // implementation class
	    //////final String beanName = "PatientFacadeImpl";

	    // the remote view fully qualified class name
	    //////final String viewClassName = "se.cambio.training.emc.patient.PatientFacade";

	    // let's do the lookup
	    String aBuscar = "ejb:" + appName + "/" + moduleName + "/" +
	                     distinctName + "/" + beanName + "!" + viewClassName;
	    aBuscar = "ejb:" + appName + "/" + moduleName + "/" + beanName + "!" +
	              viewClassName;

	    //System.out.println(aBuscar);

	    final Object o = context.lookup(aBuscar);
	    //System.out.println(o.getClass());

	    return (T) o;
		
		
	}

}
