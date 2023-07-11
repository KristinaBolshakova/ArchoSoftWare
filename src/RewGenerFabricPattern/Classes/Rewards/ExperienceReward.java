package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class ExperienceReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Experience");
    }
}
