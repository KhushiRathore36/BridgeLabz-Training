package BrowserBuddy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();

        Tab t1 = browser.newTab();
        t1.visit("google.com");
        t1.visit("youtube.com");
        t1.visit("github.com");

        t1.back();     
        t1.back();    
        t1.forward();  

        Tab t2 = browser.newTab();
        t2.visit("chat.openai.com");

        browser.printBrowserState();

        browser.closeTab(0);   
        browser.printBrowserState();

        browser.restoreTab();  
        browser.printBrowserState();
	}

}
