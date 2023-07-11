package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class MedalReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Medal");
    }
}
