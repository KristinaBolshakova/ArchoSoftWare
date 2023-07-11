package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class PotionReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Potion");
    }
}
