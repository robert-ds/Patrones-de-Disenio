package flyweight.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/8/22
 * Time: 3:15 p. m.
 */

public class PlayList {

  private String playListName;
  private List<PlayItem> playItems = new ArrayList<>();

  public PlayList(String playListName){
    this.playListName = playListName;
  }

  public void addPlayItem(String songName){
    playItems.add(PlayItemFactory.createPlayItem(songName));
  }

  public void printList(){
    String out = "\nPlayList > " + playListName;

    for(PlayItem playItem: playItems){
      out += "\n\t " + playItem.toString();
    }

    System.out.println(out);

  }

  // Getter and Setters

  public String getPlayListName(){
    return this.playListName;
  }

  public void setPlayListName(String playListName){
    this.playListName = playListName;
  }

  public List<PlayItem> getPlayItems(){
    return this.playItems;
  }

  public void setPlayItems(List<PlayItem> playItems){
    this.playItems = playItems;
  }

}
