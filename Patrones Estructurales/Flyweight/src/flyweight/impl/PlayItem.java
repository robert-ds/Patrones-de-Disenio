package flyweight.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/8/22
 * Time: 3:14 p. m.
 */

public class PlayItem {

  private Long id;
  private String songName;
  private byte[] song = new byte[1000000];

  public PlayItem(Long id, String songName){
    this.id       = id;
    this.songName = songName;
  }

  public PlayItem(){}

  @Override
  public String toString() {
    return "PlayItem{" +
        "id: " + id +
        ", songName: '" + songName + '\'' +
        '}';
  }

  // Getters and Setters

  public Long getId(){
    return this.id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getSongName(){
    return songName;
  }

  public void setSongName(String songName){
    this.songName = songName;
  }

}
