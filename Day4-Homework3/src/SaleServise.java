
public interface SaleServise {
	
	void selling(Gamer gamer , DiscountCampaign campaign1,Game game1);
	void sellingForGift(User user,Gamer gamer,DiscountCampaign campaign1,Game game1);
	
	void returning(Gamer gamer ,Game game);
}
