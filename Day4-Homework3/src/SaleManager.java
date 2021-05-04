
public class SaleManager implements SaleServise {
	private DiscountCampaingManager discountCampaingManager;
	
	public SaleManager(DiscountCampaingManager discountCampaingManager) {
		super();
		this.discountCampaingManager = discountCampaingManager;
	}
	
	@Override
	public void sellingForGift(User user,Gamer gamer, DiscountCampaign campaign, Game game1) {
		System.out.println(game1.getGameName() + " adlý oyunu " + user.getFirstName() + " isimli kullanýcý " 
				+ campaign.getCampaignName() + " isimli kampanyadan yararlanarak "  +"yüzde " + campaign.getDiscount()
				+ " indirim ile " + discountCampaingManager.implementingDiscount(game1) +
				
				" TL ile " + gamer.getGamerNickname() + " isimli kullancýya hediye etti !!");
		
	}
	
	@Override
	public void selling(Gamer gamer, DiscountCampaign campaign, Game game1) {
		System.out.println(game1.getGameName() + " adlý oyun " + gamer.getGamerNickname() + " isimli kullanýcý tarafýndan " 
				+ campaign.getCampaignName() + " isimli kampanyadan yararlanarak "  +"yüzde " + campaign.getDiscount()
				+ " indirim ile " + discountCampaingManager.implementingDiscount(game1) +
				
				" TL ile satýn alýndý .");		
	}
	
	@Override
	public void returning(Gamer gamer ,Game game) {		
		System.out.println(game.getGameName() + " adlý oyun " + gamer.getGamerNickname() + " isimli kullanýcý tarafýndan iade edildi .");
	}


}	
