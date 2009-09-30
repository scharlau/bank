package bank.test;
import bank.Account;
import junit.framework.TestCase;
/*
 * Created on 17-Feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author bscharla
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AccountTest extends TestCase {

	
	public AccountTest(String arg0) {
		super(arg0);
	}
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAccount(){
		Account myAccount = new Account();
		myAccount.deposit(Float.parseFloat("150.00"));
		assertEquals("check balance wrong",Float.parseFloat("150.00"),myAccount.getBalance(), 0);
	}
	
	public void testTransferFunds(){
		Account myAccount = new Account();
		Account destination = new Account();
		myAccount.deposit(Float.parseFloat("300.00"));
		destination.deposit(Float.parseFloat("50.00"));
		myAccount.transferFunds(destination,Float.parseFloat("150.00"));
		assertEquals("transfer funds wrong",Float.parseFloat("150.00"),myAccount.getBalance(),0);
		assertEquals("transfer funds wrong",Float.parseFloat("200.00"),destination.getBalance(),0);
	}

}
