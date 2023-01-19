import java.time.Year;


public class book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String Title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	public void setPublishyear(int year) {
		this.publishyear=year;
	}
	public int getPublishyear() {
		return publishyear;
	}
	public int getTotalyear() {
		int totalYear=Year.now().getValue()-publishyear;
		return totalYear;
	}
	public String toString() {
		return String.format("Title: "+title+" published for "+getTotalyear()+" year ("+price+" baht.)");
	}
}



