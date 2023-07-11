package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class ArmourReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Armour");
    }
}
