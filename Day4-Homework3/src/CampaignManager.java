
public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya eklendi .");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya silindi .");		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya güncellendi .");	
	}
		
}
