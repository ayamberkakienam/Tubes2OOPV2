package building;

/**
 * Class Building.Building.Cell.
 * Merepresentasikan petak yang ada pada Virtual Zoo.
 * <p>
 * Created by um on 27/03/17.
 */
public class Cell {

  private final int loc_x;
  private final int loc_y;
  private char content;
  private boolean caged;
  private boolean entrance;
  private boolean exit;

  /**
   * Default class constructor.
   */
  public Cell() {
    loc_x = 0;
    loc_y = 0;
    content = '-';
    caged = false;
  }
  /**
   * Class constructor dengan parameter absis dan ordinat
   * dari lokasi cell.
   *
   * @param i absis lokasi cell
   * @param j ordinat lokasi cell
   */
  public Cell(String bangunan, int i, int j) {
    switch (bangunan) {
      case ("Park") :
      {
        content = '.';
        entrance = false;
        exit = false;
      }
      case ("Restaurant") :
      {
        content = '$';
        entrance = false;
        exit = false;
      }
      case ("Road") :
      {
        content = '+';
        entrance = false;
        exit = false;
      }
      case ("RoadEntrance") :
      {
        content = '=';
        entrance = true;
        exit = false;
      }
      case ("RoadExit") :
      {
        content = '=';
        entrance = false;
        exit = true;
      }
      case ("LandHabitat") :
      {
        content = '#';
        entrance = false;
        exit = false;
      }
      case ("WaterHabitat") :
      {
        content = '~';
        entrance = false;
        exit = false;
      }
      case ("AirHabitat") :
      {
        content = '*';
        entrance = false;
        exit = false;
      }
    }
    caged = false;
    loc_x = i;
    loc_y = j;
  }
  /**
   * Mendapatkan content
   *
   * @return content cell
   */
  public char getContent() {
    return content;
  }
  /**
   * Mendapatkan lokasi absis
   *
   * @return lokasi absis cell
   */
  public int getX() {
    return loc_x;
  }
  /**
   * Mendapatkan lokasi ordinat
   *
   * @return lokasi ordinat cell
   */
  public int getY() {
    return loc_y;
  }
  /** @brief Mengembalikan nilai boolean jika habitat terletak dalam kandang atau tidak
   * @return boolean caged.
   */
  public boolean isCaged() {
    return caged;
  }
  /** @brief Memberikan atau mengubah nilai boolean dari caged
   *
   */
  public void setCaged() {
    caged = true;
  }
  /**
   * Menampilkan informasi lokasi dan content cell
   */
  private void display() {
    System.out.println("x : " + getX());
    System.out.println("y : " + getY());
    System.out.println("content : " + getContent());
  }
  /**
   * Mengembalikan content dari cell
   * @return karakter content pada cell
   */
  public char render() {
    return getContent();
  }
}
