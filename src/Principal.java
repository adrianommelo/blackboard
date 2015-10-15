
public class Principal {

	public static void main(String[] args) {
		String sahiBasePath = "C:\\Users\\EaD\\Documents\\desenvolvimento\\Sahi";
		String userDataDirectory = "C:\\Users\\EaD\\Documents\\desenvolvimento\\Sahi\\userdata"; // userdata_dir is in sahiBasePath/userdata by default

		net.sf.sahi.config.Configuration.initJava(sahiBasePath, userDataDirectory);
		
		BBLogin obj = new BBLogin();
		obj.openBrowser();
		obj.navegatoTo("https://brazcubas.blackboard.com/");
		obj.setLogin("adriano.melo");
		obj.setPsswd("a123456");
		obj.enviaDados();
		
		

	}

}
