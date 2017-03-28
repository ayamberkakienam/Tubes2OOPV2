package building;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Cage.
 * Menangani objek cage yang merupakan area hidup hewan
 */
public class Cage {
  protected Cell[] arrCell;
  protected int size;

  /**
   * Constructor.
   */
  public Cage() {
    arrCell = new Cell[300];
    size = 0;
  }

  /**
   * Getter ukuran cage.
   * @return Ukuran cage
   */
  public int getSize() {
    return size;
  }

  /**
   * Getter array cell yang merupakan wilayah cage.
   * @return Array cell yang menjadi wilayah cage
   */
  public Cell[] getCell() {
    return arrCell;
  }

  /**
   * Memperbesar wilayah cage.
   */
  public void incSize() {
    size++;
  }

  /**
   * Memperkecil wilayah cage.
   */
  public void decSize() {
    size--;
  }
}
