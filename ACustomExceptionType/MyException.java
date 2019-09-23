public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int detail;
	
	public MyException(int a) {
		detail = a;
	}
	
	public String toString() {
		return "MyException[" + detail + "]";
	}
	

}
