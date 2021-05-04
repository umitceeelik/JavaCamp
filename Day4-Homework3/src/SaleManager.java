
public class SaleManager implements SaleServise {
	private DiscountCampaingManager discountCampaingManager;
	
	public SaleManager(DiscountCampaingManager discountCampaingManager) {
		super();
		this.discountCampaingManager = discountCampaingManager;
	}
	
	@Override
	public void sellingForGift(User user,Gamer gamer, DiscountCampaign campaign, Game game1) {
		System.out.println(game1.getGameName() + " adl� oyunu " + user.getFirstName() + " isimli kullan�c� " 
				+ campaign.getCampaignName() + " isimli kampanyadan yararlanarak "  +"y�zde " + campaign.getDiscount()
				+ " indirim ile " + discountCampaingManager.implementingDiscount(game1) +
				
				" TL ile " + gamer.getGamerNickname() + " isimli kullanc�ya hediye etti !!");
		
	}
	
	@Override
	public void selling(Gamer gamer, DiscountCampaign campaign, Game game1) {
		System.out.println(game1.getGameName() + " adl� oyun " + gamer.getGamerNickname() + " isimli kullan�c� taraf�ndan " 
				+ campaign.getCampaignName() + " isimli kampanyadan yararlanarak "  +"y�zde " + campaign.getDiscount()
				+ " indirim ile " + discountCampaingManager.implementingDiscount(game1) +
				
				" TL ile sat�n al�nd� .");		
	}
	
	@Override
	public void returning(Gamer gamer ,Game game) {		
		System.out.println(game.getGameName() + " adl� oyun " + gamer.getGamerNickname() + " isimli kullan�c� taraf�ndan iade edildi .");
	}


}	
