package brtest;

import brtest.assets.*;
import brtest.shows.*;

public class brTest {
    public static void main(String[] args) {
        show buffy = new show(1, "Buffy", "Buffy");
        buffy.addAsset(new video(1, "Episode 1", "video", "http://buffy.com", "1/1/2019", "episode"));

        for (asset asset : buffy.getAssets(null, null)) {
            System.out.println(asset.GetDisplayLine());
        }

        for (asset asset : buffy.getAssets(null, "1/2/2019")) {
            System.out.println(asset.GetDisplayLine());
        }
    }
}
