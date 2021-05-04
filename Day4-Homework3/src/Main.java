import java.util.Date;


public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Emre", "�elik", "62260297880", new Date(1998, 11, 3), "emrecelik", "123456");
		Gamer gamer2 = new Gamer(1, "�mit", "�elik", "62260297880", new Date(1998, 11, 3), "emrecelik", "123456");
		User guestUser = new GuestUser(1, "Ahmet", "�elik", "623062296482", new Date(1994, 4, 16), "ahmetcelik@gmail.com");		
		Game game1 = new Game(101, "Cs Go", 30);
		Game game2 = new Game(102, "Gta V", 150);
		
		BaseUserManager gamerManager = new GamerManager(new MernisServiceAdapters());
		// BaseUserManager guestUserManager = new GuestUserManager(); Base olarak kullanam�yoruz ��nk� misafir kullan�c�lar kay�t olmaz !
		
		gamerManager.register(gamer1);
		gamerManager.updateInformation(gamer1);
		gamerManager.deregistration(gamer1);
		System.out.println();
		gamerManager.register(gamer2);
		
		System.out.println("*******************************************************************************");
		
		DiscountCampaign campaign1 = new DiscountCampaign("Bayram Kampanyas�", " 5 g�n ", " s�re boyunca al�nan �r�nlerde indirim !!", 40);
		
		DiscountCampaign campaign2 = new DiscountCampaign("Tatil kampanyas�", " 15 g�n ","s�re boyunca al�nan �r�nler yar� fiyat�na !! " , 50);
		
		DiscountCampaingManager campaignManager1 = new DiscountCampaingManager(campaign1);
		DiscountCampaingManager campaignManager2 = new DiscountCampaingManager(campaign2);
		
		campaignManager1.addCampaign(campaign1);
		campaignManager1.updateCampaign(campaign1);
		campaignManager1.deleteCampaign(campaign1);
		System.out.println();
		campaignManager2.addCampaign(campaign2);
		campaignManager2.updateCampaign(campaign2);
		campaignManager2.deleteCampaign(campaign2);
		
		System.out.println("*******************************************************************************");

		SaleManager saleManager1 = new SaleManager(campaignManager1);
		SaleManager saleManager2 = new SaleManager(campaignManager2);
		saleManager1.selling(gamer1, campaign1, game1);
		saleManager2.sellingForGift(guestUser, gamer1, campaign2, game2);
		
		
	}
}
