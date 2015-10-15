import net.sf.sahi.client.Browser;


public class Singleton {
	
	static String browserName = "chrome"; // default values are "ie", "firefox", "safari", "chrome", "opera" - specified in userdata/config/browser_types.xml 
	private static Browser browserInstance = null;
	
	protected Singleton(){
		
	}
	
	public static Browser getInstance(){
		if(browserInstance == null){
			 browserInstance=  new Browser(browserName);
		}
		return browserInstance;
	}
}
