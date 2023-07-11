package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class GemGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
