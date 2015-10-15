import net.sf.sahi.client.Browser;


public class BBLogin {
	private Browser objbrowser;
	
	public BBLogin(){
		this.objbrowser = Singleton.getInstance();
	}
	
	public void openBrowser(){
		objbrowser.open();
	}
	
	public void navegatoTo(String url){
		objbrowser.navigateTo(url);
	}
	
	public void setLogin(String login){
		objbrowser.textbox("user_id").setValue(login);
	}
	
	public void setPsswd(String psswd){
		objbrowser.password("password").setValue(psswd);
	}
	
	public void enviaDados(){
		objbrowser.submit("login").click();
	}
}
