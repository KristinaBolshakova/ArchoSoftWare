package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.ItemFabric;
import RewGenerFabricPattern.Classes.iGameItem;

public class GemReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}
