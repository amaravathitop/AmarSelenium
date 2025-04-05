package week2.day1;

public class Browser {

	
	public String launchBrowser() {
		// TODO Auto-generated method stub
    System.out.println("Browser Lunched successfully");
    return("Chrome");
	}
	
	public void loadurl() {
		// TODO Auto-generated method stub
    System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser broswerOptions=new Browser();
		broswerOptions.loadurl();
		String a=broswerOptions.launchBrowser();
		System.out.println(a);
	}

}
