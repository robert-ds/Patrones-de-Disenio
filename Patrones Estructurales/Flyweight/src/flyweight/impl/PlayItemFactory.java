package flyweight.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/8/22
 * Time: 3:15 p. m.
 */

public class PlayItemFactory {

  public static boolean enableFlyweight = true;
  private static final Map<String,PlayItem> PLAY_ITEMS = new HashMap<>();
  private static Long idSequence = 0L;

  public static PlayItem createPlayItem(String songName){

    if(enableFlyweight && PLAY_ITEMS.containsKey(songName)){
      return PLAY_ITEMS.get(songName);
    }else{
      PlayItem playItem = new PlayItem(++idSequence, songName);
      PLAY_ITEMS.put(songName, playItem);
      return playItem;
    }
  }
}
