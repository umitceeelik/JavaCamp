
public class Campaign {
	private String campaignName;
	private String campaignTime;
	private String campaignDescription;
	
	public Campaign(String campaignName, String campaignTime, String campaignDescription) {
		this.campaignName = campaignName;
		this.campaignTime = campaignTime;
		this.campaignDescription = campaignDescription;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignTime() {
		return campaignTime;
	}

	public void setCampaignTime(String campaignTime) {
		this.campaignTime = campaignTime;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}	
}
