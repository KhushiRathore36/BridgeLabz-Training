package BrowserBuddy;
import java.util.*;
public class Browser {
	List<Tab> openTabs = new ArrayList<>();
    Stack<Tab> closedTabs = new Stack<>();

    
    Tab newTab() {
        Tab tab = new Tab();
        openTabs.add(tab);
        System.out.println("New Tab Opened. Total tabs: " + openTabs.size());
        return tab;
    }

   
    void closeTab(int index) {
        if (index < 0 || index >= openTabs.size()) {
            System.out.println("Invalid Tab Index!");
            return;
        }
        Tab removed = openTabs.remove(index);
        closedTabs.push(removed);
        System.out.println("Tab Closed. Total Open Tabs: " + openTabs.size());
    }

   
    void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No Closed Tabs to Restore!");
            return;
        }
        Tab restored = closedTabs.pop();
        openTabs.add(restored);
        System.out.println("Tab Restored. Total Open Tabs: " + openTabs.size());
    }

  
    void printBrowserState() {
        System.out.println("\n--- BROWSER STATE ---");
        System.out.println("Open Tabs: " + openTabs.size());
        System.out.println("Closed Tabs: " + closedTabs.size());
        System.out.println("----------------------");
    }
}
