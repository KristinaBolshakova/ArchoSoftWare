package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
