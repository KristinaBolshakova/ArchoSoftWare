package RewGenerFabricPattern.Classes.Rewards;

import RewGenerFabricPattern.Classes.iGameItem;

public class WeaponReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Weapon");
    }
}
