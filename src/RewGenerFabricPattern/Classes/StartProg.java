package RewGenerFabricPattern.Classes;

import RewGenerFabricPattern.Classes.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartProg {
    public static void main(String[] args) throws Exception {
//        ItemFabric generator = new GoldGenerator();
//        generator.openReward();
//
//        generator = new GemGenerator();
//        generator.openReward();

        Random random = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new PotionGenerator());
        fabricList.add(new MedalGenerator());
        fabricList.add(new ArmourGenerator());
        fabricList.add(new WeaponGenerator());
        fabricList.add(new ExperienceGenerator());


        for (int i = 0; i < 20; i++) {
//            int index = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            int index = random.nextInt(0,fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
