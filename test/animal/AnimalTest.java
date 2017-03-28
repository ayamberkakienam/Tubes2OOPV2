package animal;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class AnimalTest {
  @Test
  void setLoc() {
    Animal ayam = new Animal("Elang", 1,4);
    ayam.setLoc(2, 3);
    assertTrue(ayam.getLocX() == 2 && ayam.getLocY() == 3);
  }

  @Test
  void getName() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    Animal pausSperma = new Animal("PausSperma", 4, 5);
    Animal test = new Animal("Elang", 4, 5);

    System.out.println(bekantan.getName() + ' ' + pausSperma.getName() +  ' ' + test.getName());

    assertTrue(bekantan.getName() == "Bekantan" && pausSperma.getName() == "Paus Sperma");
  }

  @Test
  void getLocX() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getLocX() == 2);
  }

  @Test
  void getLocY() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getLocY() == 3);
  }

  @Test
  void getFodder() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getFodder() == (float)0.025 * bekantan.getWeight());
  }

  @Test
  void getContent() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getContent() == 'A');
  }

  @Test
  void getWeight() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getWeight() == 50);
  }

  @Test
  void isTamed() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.IsTamed());
  }

  @Test
  void getLegs() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    assertTrue(bekantan.getLegs() == 2);
  }

  @Test
  void distLocX() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    Animal ayam = new Animal("Elang", 2, 4);
    assertTrue(!bekantan.DistLocX(ayam));
  }

  @Test
  void distLocY() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    Animal ayam = new Animal("Elang", 3, 3);
    assertTrue(!bekantan.DistLocY(ayam));
  }

  @Test
  void distLoc() {
    Animal bekantan = new Animal("Bekantan", 2, 3);
    Animal ayam = new Animal("Elang", 2, 3);
    assertTrue(!bekantan.DistLoc(ayam));
  }

  @Test
  void interact() {
    Animal ayam = new Animal("Elang", 3, 3);
    assertTrue(ayam.Interact() == "Koak koakk koakk");
  }

}