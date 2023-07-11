package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class GoldReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gold");
    }
}
