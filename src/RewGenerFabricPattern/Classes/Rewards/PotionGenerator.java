package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class PotionGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new PotionReward();
    }
}
