package se.cambio.ics.persistence.exceptionmanager;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.ejb.EJBTransactionRolledbackException;

public class DefaultExceptionHandler {

	public static synchronized void reportException(Exception e, String otherException) throws Exception{
		
		String errorString = exceptionStacktraceToString(e);
		
		if (e instanceof EJBTransactionRolledbackException) {
			
			throw new Exception(otherException);
			
		} else if (e instanceof RuntimeException) {
		
			throw new RuntimeException("Something Went Worng");
		}
		 else {
			throw e;
		}
		
	}
	
	private static String exceptionStacktraceToString(Exception e)throws Exception{
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		e.printStackTrace(ps);
		ps.close();
		return baos.toString();
	}
}
