package building;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Class Building.Building.Cell.
 * Merepresentasikan petak yang ada pada Virtual Zoo.
 */
public class Cell {
  private final int locX;
  private final int locY;
  private char content;
  private boolean caged;
  private boolean entrance;
  private boolean exit;

  /**
   * Default class constructor.
   */
  public Cell() {
    locX = 0;
    locY = 0;
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
      case ("Park"): {
        content = '.';
        entrance = false;
        exit = false;
        break;
      }
      case ("Restaurant"): {
        content = '$';
        entrance = false;
        exit = false;
        break;
      }
      case ("Road"): {
        content = '+';
        entrance = false;
        exit = false;
        break;
      }
      case ("RoadEntrance"): {
        content = '=';
        entrance = true;
        exit = false;
        break;
      }
      case ("RoadExit"): {
        content = '=';
        entrance = false;
        exit = true;
        break;
      }
      case ("LandHabitat"): {
        content = '#';
        entrance = false;
        exit = false;
        break;
      }
      case ("WaterHabitat"): {
        content = '~';
        entrance = false;
        exit = false;
        break;
      }
      case ("AirHabitat"): {
        content = '*';
        entrance = false;
        exit = false;
        break;
      }
      default:
      {
        content = '-';
        entrance = false;
        exit = false;
        break;
      }
    }
    caged = false;
    locX = i;
    locY = j;
  }

  /**
   * Mendapatkan content.
   *
   * @return content cell
   */
  public char getContent() {
    return content;
  }

  /**
   * Mendapatkan lokasi absis.
   *
   * @return lokasi absis cell
   */
  public int getX() {
    return locX;
  }

  /**
   * Mendapatkan lokasi ordinat.
   *
   * @return lokasi ordinat cell
   */
  public int getY() {
    return locY;
  }

  /**
   * True apabila cell berlokasi di dalam Cage.
   * @return boolean caged.
   */
  public boolean isCaged() {
    return caged;
  }

  /**
   * Memberikan atau mengubah nilai boolean dari caged.
   */
  public void setCaged() {
    caged = true;
  }

  /**
   * Menampilkan informasi lokasi dan content cell.
   */
  private void display() {
    System.out.println("x : " + getX());
    System.out.println("y : " + getY());
    System.out.println("content : " + getContent());
  }
}
