package building;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class CellTest {
  @Test
  void getContent() {
    Cell a = new Cell("Park", 2, 3);
    assertTrue(a.getContent() == '.');
  }

  @Test
  void getX() {
    Cell a = new Cell("Park", 2, 3);
    assertTrue(a.getX() == 2);
  }

  @Test
  void getY() {
    Cell a = new Cell("Park", 2, 3);
    assertTrue(a.getY() == 3);
  }

  @Test
  void isCaged() {
    Cell a = new Cell("Park", 2, 3);
    assertTrue(!a.isCaged());
  }

  @Test
  void setCaged() {
    Cell a = new Cell("Park", 2, 3);
    a.setCaged();
    assertTrue(a.isCaged());
  }
}