import java.util.HashMap;
import java.util.Map;
public class WebsiteAnalytics {
    private HashMap<String, Integer> pageVisitCounts;
    public WebsiteAnalytics() {
        pageVisitCounts = new HashMap<>();}
    public void incrementVisit(String pageUrl) {
        pageVisitCounts.put(pageUrl, pageVisitCounts.getOrDefault(pageUrl, 0) + 1);}
    public int getVisitCount(String pageUrl) {
        return pageVisitCounts.getOrDefault(pageUrl, 0);}
    public String getMostVisitedPage() {
        String mostVisitedPage = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : pageVisitCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostVisitedPage = entry.getKey();
                highestCount = entry.getValue();}}
        return mostVisitedPage;}
    public static void main(String[] args) {
        WebsiteAnalytics analytics = new WebsiteAnalytics();
        analytics.incrementVisit("home");
        analytics.incrementVisit("about");
        analytics.incrementVisit("contact");
        analytics.incrementVisit("home");
        analytics.incrementVisit("home");
        System.out.println("Visit count for 'home': " + analytics.getVisitCount("home"));
        System.out.println("Visit count for 'about': " + analytics.getVisitCount("about"));
        System.out.println("Visit count for 'contact': " + analytics.getVisitCount("contact"));
        System.out.println("Most visited page: " + analytics.getMostVisitedPage()); }}
/*3. Scenario:
You are building an analytics tool for a website. The tool needs to count the number of visitors to each page and store the data. Write a Java program that uses a HashMap to track the number of visits to different pages of a website. Each time a visitor accesses a page, the tool should increment the visit count for that page.
Requirements:
a)	The key should be the page URL (as a string), and the value should be the number of visits (as an integer).
b)	Provide a method to retrieve the visit count for a given page.
        c)	Provide a method to get the page with the highest visit count.*/