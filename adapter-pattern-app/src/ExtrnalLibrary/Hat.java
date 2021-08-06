package ExtrnalLibrary;

public class Hat {
	private String shortName;
	private String longName;
	private double basePrice;
	public Hat(String shortName,String longName,double basePrice) {
		this.shortName=shortName;
		this.longName=longName;
		this.basePrice=basePrice;
	}
	public String getLongName() {
		return longName;
	}
	public String getShortName() {
		return shortName;
	}
	public double getBasePrice() {
		return basePrice;
	}
}
