
public class DiscountCampaingManager extends CampaignManager implements DiscountCampaignService{
	private DiscountCampaign discountCampaign;
	private Double newPrice;	
	
	public DiscountCampaingManager(DiscountCampaign discountCampaign) {
		this.discountCampaign = discountCampaign;

	}
	
	public double implementingDiscount(Game game) {		
		newPrice = game.getGameCost() - (game.getGameCost()*discountCampaign.getDiscount() / 100);				
		return newPrice;
	}
	
}
