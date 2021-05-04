
public class DiscountCampaign extends Campaign{
	private double discount;

	public DiscountCampaign(String campaignName, String campaignTime, String campaignDescription, double discount) {
		super(campaignName, campaignTime, campaignDescription);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	
}
