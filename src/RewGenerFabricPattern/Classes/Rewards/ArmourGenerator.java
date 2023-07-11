package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class ArmourGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new ArmourReward();
    }
}
