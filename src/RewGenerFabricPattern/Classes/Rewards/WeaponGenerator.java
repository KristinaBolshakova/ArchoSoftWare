package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class WeaponGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new WeaponReward();
    }
}
