package inheritance;

public class SeleniumStructureDemo {
	public static void main(String[] args) {
		Browser browser = new MozillaBrowser();
		browser.click();
		
	}
}

interface Browser{
	public void click();
}


class ChromeBrowser implements Browser{
	public void click() {

	}
	
	public void chromexyz() {

	}
}

class MozillaBrowser implements Browser{
	public void click() {

	}
	
	public void moxillaxyz() {

	}
	
}

class IE implements Browser{
	public void click() {

	}
}