package building;

import animal.Animal;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
public class Zoo {
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";
  //  private int sizeBrs;
//  private int sizeKol;
//  private int numCage;
//  private Cell[][] matCell;
//  private Cage[] listCage;
//  private Animal[] listAnimal;
  private int sizeBrs;
  private int sizeKol;
  private int numCage;
  private Cell[][] matCell;
  private Cage[] listCage;
  private Animal[] listAnimal;

  /**
   * Constructor.
   * Melakukan inisialisasi kelas Zoo
   *
   * @param sizeBrs ukuran baris (lebar) Zoo
   * @param sizeKol ukuran kolom (panjang) Zoo
   * @param numCage banyaknya kandang pada Zoo
   */
  public Zoo(int sizeBrs, int sizeKol, int numCage) {
    this.sizeBrs = sizeBrs;
    this.sizeKol = sizeKol;
    this.numCage = numCage;

    matCell = new Cell[sizeBrs][sizeKol];
    listCage = new Cage[numCage];
    listAnimal = new Animal[300];
  }

  /**
   * Getter untuk lebar Zoo.
   *
   * @return lebar Zoo
   */
  public int getSizeBrs() {
    return sizeBrs;
  }

  /**
   * Getter untuk panjang Zoo.
   *
   * @return panjang Zoo
   */
  public int getSizeKol() {
    return sizeKol;
  }

  /**
   * Getter untuk banyaknya Cage.
   *
   * @return banyaknya Cage
   */
  public int getNumCage() {
    return numCage;
  }

  /**
   * Getter untuk matrix Cell.
   *
   * @return matrix Cell
   */
  public Cell[][] getCell() {
    return matCell;
  }

  /**
   * Getter untuk array Cage.
   *
   * @return array Cage
   */
  public Cage[] getCage() {
    return listCage;
  }

  /**
   * Getter untuk array Animal.
   *
   * @return array Animal
   */
  public Animal[] getAnimal() {
    return listAnimal;
  }

  /**
   * Method untuk membuat Animal bergerak.
   */
  public void moveAnimal() {
    int x;
    int y;
    int move;
    int j;
    boolean moved = false;
    boolean dist = true;
    for (int i = 0; i < Animal.getNAnimal(); i++) {
      do {
        Random rand = new Random();
        move = rand.nextInt(5) + 1;
        x = listAnimal[i].getLocX();
        y = listAnimal[i].getLocY();
        switch (move) {
          // CHECK CELL APAKAH CAGED
          case 1:
            x--;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].DistLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              x++;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 2:
            y++;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].DistLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              y--;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 3:
            x++;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].DistLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              x--;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 4:
            y--;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].DistLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              y++;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          default:
            moved = true;
            break;
        }
      } while (!moved);
    }
  }

  /**
   * Setter untuk inisialisasi Cell di Cage.
   *
   * @param n  array ke n pada Cage
   * @param nn array ke nn pada Cell di Cage
   * @param i  absis pada Zoo
   * @param j  ordinat pada Zoo
   */
  public void setCellCage(int n, int nn, int i, int j) {
    if (matCell[i][j].getContent() == '*') {
      listCage[n].getCell()[nn] = new Cell("AirHabitat", i, j);
    } else if (matCell[i][j].getContent() == '#') {
      listCage[n].getCell()[nn] = new Cell("LandHabitat", i, j);
    } else if (matCell[i][j].getContent() == '~') {
      listCage[n].getCell()[nn] = new Cell("WaterHabitat", i, j);
    }
    listCage[n].getCell()[nn].setCaged();
    listCage[n].incSize();
    matCell[i][j].setCaged();
  }

  /**
   * Create Cage pada Zoo.
   *
   * @param n array ke n pada Cage
   */
  public void createCage(int n) {
    listCage[n] = new Cage();
  }

  /**
   * Create Cell pada Zoo.
   *
   * @param c content yang ada pada Cell di Zoo
   * @param i absis pada Cell di Zoo
   * @param j ordinat pada Cell di Zoo
   */
  public void createCell(char c, int i, int j) {
    switch (c) {
      case '*':
        matCell[i][j] = new Cell("AirHabitat", i, j);
        break;
      case '#':
        matCell[i][j] = new Cell("LandHabitat", i, j);
        break;
      case '~':
        matCell[i][j] = new Cell("WaterHabitat", i, j);
        break;
      case '+':
        matCell[i][j] = new Cell("Road", i, j);
        break;
      case '=':
        matCell[i][j] = new Cell("RoadEntrance", i, j);
        break;
      case '!':
        matCell[i][j] = new Cell("RoadExit", i, j);
        break;
      case '.':
        matCell[i][j] = new Cell("Park", i, j);
        break;
      case '$':
        matCell[i][j] = new Cell("Restaurant", i, j);
        break;
    }
  }

  /**
   * Create Animal pada Zoo.
   *
   * @param c content yang ada pada Animal di Zoo
   * @param i absis pada Animal di Zoo
   * @param j ordinat pada Animal di Zoo
   * @param n jumlah total hewan yang ada pada Zoo
   */
  public void createAnimal(char c, int i, int j, int n) {
    if (matCell[i][j].isCaged()) {
      int k = 0;
      boolean found = false;
      while (k < getNumCage() && !found) {
        int l = 0;
        while (l < listCage[k].getSize() && !found) {
          if (listCage[k].getCell()[l].getX() == i && listCage[k].getCell()[l].getY() == j) {
            found = true;
          } else {
            l++;
          }
        }
        k++;
      }
      k--;
      int area = listCage[k].getSize();
      int max_n_animal = area * 3 / 10;
      int n_animal = 0;
      for (int ii = 0; ii < Animal.getNAnimal(); ii++) {
        for (int jj = 0; jj < listCage[k].getSize(); jj++) {
          if (listCage[k].getCell()[jj].getX() == listAnimal[ii].getLocX() && listCage[k].getCell()[jj].getY() == listAnimal[ii].getLocY()) {
            n_animal++;
          }
        }
      }
      if (n_animal < max_n_animal) {
        switch (c) {
          case 'A':
            listAnimal[n] = new Animal("Bekantan", i, j);
            break;
          case 'B':
            listAnimal[n] = new Animal("BurungHantu", i, j);
            break;
          case 'C':
            listAnimal[n] = new Animal("Codot", i, j);
            break;
          case 'D':
            listAnimal[n] = new Animal("Elang", i, j);
            break;
          case 'E':
            listAnimal[n] = new Animal("Gajah", i, j);
            break;
          case 'F':
            listAnimal[n] = new Animal("Gorilla", i, j);
            break;
          case 'G':
            listAnimal[n] = new Animal("Harimau", i, j);
            break;
          case 'H':
            listAnimal[n] = new Animal("Hiu", i, j);
            break;
          case 'I':
            listAnimal[n] = new Animal("IkanTerbang", i, j);
            break;
          case 'J':
            listAnimal[n] = new Animal("Jerapah", i, j);
            break;
          case 'K':
            listAnimal[n] = new Animal("Kancil", i, j);
            break;
          case 'L':
            listAnimal[n] = new Animal("Kepik", i, j);
            break;
          case 'M':
            listAnimal[n] = new Animal("Kepiting", i, j);
            break;
          case 'N':
            listAnimal[n] = new Animal("KumbangHutan", i, j);
            break;
          case 'O':
            listAnimal[n] = new Animal("KupuKupu", i, j);
            break;
          case 'P':
            listAnimal[n] = new Animal("Lobster", i, j);
            break;
          case 'Q':
            listAnimal[n] = new Animal("LumbaLumba", i, j);
            break;
          case 'R':
            listAnimal[n] = new Animal("MacanTutul", i, j);
            break;
          case 'S':
            listAnimal[n] = new Animal("OwaOwa", i, j);
            break;
          case 'T':
            listAnimal[n] = new Animal("PausSperma", i, j);
            break;
          case 'U':
            listAnimal[n] = new Animal("Piranha", i, j);
            break;
          case 'V':
            listAnimal[n] = new Animal("Platypus", i, j);
            break;
          case 'W':
            listAnimal[n] = new Animal("Singa", i, j);
            break;
          case 'X':
            listAnimal[n] = new Animal("SingaLaut", i, j);
            break;
        }
      }
    }
  }

  /**
   * Print Zoo pada layar.
   */
  public void printZoo() {
    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        System.out.print(matCell[i][j].getContent());
      }
      System.out.println("");
    }
  }

  /**
   * Mencetak peta Zoo berikut kandang-kandangnya.
   */
  public void printZooCage() {
    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        char c = matCell[i][j].getContent();
        if (c == '*' || c == '#' || c == '~') {
          if (matCell[i][j].isCaged()) {
            System.out.print(ANSI_RED + c + ANSI_RESET);
          } else {
            System.out.print(c);
          }
        } else {
          System.out.print(c);
        }
      }
      System.out.println("");
    }
  }

  /**
   * Mencetak Zoo lengkap dengan lokasi tiap hewan dan kandangnya.
   *
   * @param x1 Absis titik awal peta yang akan dicetak
   * @param y1 Ordinat titik awal peta yang akan dicetak
   * @param x2 Absis titik akhir peta yang akan dicetak
   * @param y2 Ordinat titik akhir peta yang akan dicetak
   */
  public void printZooCageAnimal(int x1, int y1, int x2, int y2) {

    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {

        char c = matCell[i][j].getContent();
        if (c == '*' || c == '#' || c == '~') {
          if (matCell[i][j].isCaged()) {
            boolean ada_hewan = false;
            int hewan_n = 0;
            for (int k = 0; k < Animal.getNAnimal(); k++) {
              if (listAnimal[k].getLocX() == i && listAnimal[k].getLocY() == j) {
                ada_hewan = true;
                hewan_n = k;
              }
            }
            if (i >= x1 && i <= x2 && j >= y1 && j <= y2) if (ada_hewan)
              System.out.print(ANSI_PURPLE + listAnimal[hewan_n].getContent() + ANSI_RESET);
            else System.out.print(ANSI_RED + c + ANSI_RESET);
          } else {
            if (i >= x1 && i <= x2 && j >= y1 && j <= y2) System.out.print(c);
          }
        } else {
          if (i >= x1 && i <= x2 && j >= y1 && j <= y2) if (c == '+') {
            System.out.print(ANSI_WHITE + c + ANSI_RESET);
          } else if (c == '.') {
            System.out.print(ANSI_GREEN + c + ANSI_RESET);
          } else if (c == '$') {
            System.out.print(ANSI_YELLOW + c + ANSI_RESET);
          } else {
            System.out.print(c);
          }
        }
      }
      System.out.println("");
    }
  }

  /**
   * Mencetak tiap elemen peta Zoo secara berwarna.
   *
   * @param x Absis elemen yang akan dicetak
   * @param y Ordinat elemen yang akan dicetak
   */
  public void printZooAnimalCageTour(int x, int y) {

    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        if (i == x && j == y) {
          System.out.print(ANSI_BLUE + 'P' + ANSI_RESET);
        } else {
          char c = matCell[i][j].getContent();
          if (c == '*' || c == '#' || c == '~') {
            if (matCell[i][j].isCaged()) {
              boolean ada_hewan = false;
              int hewan_n = 0;
              for (int k = 0; k < Animal.getNAnimal(); k++) {
                if (listAnimal[k].getLocX() == i && listAnimal[k].getLocY() == j) {
                  ada_hewan = true;
                  hewan_n = k;
                }
              }
              if (ada_hewan)
                System.out.print(ANSI_PURPLE + listAnimal[hewan_n].getContent() + ANSI_RESET);
              else System.out.print(ANSI_RED + c + ANSI_RESET);
            } else {
              System.out.print(c);
            }
          } else {
            if (c == '+') {
              System.out.print(ANSI_WHITE + c + ANSI_RESET);
            } else if (c == '.') {
              System.out.print(ANSI_GREEN + c + ANSI_RESET);
            } else if (c == '$') {
              System.out.print(ANSI_YELLOW + c + ANSI_RESET);
            } else {
              System.out.print(c);
            }
          }
        }
      }
      System.out.println("");
    }
    System.out.println("\nPress \"ENTER\" to continue...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
  }
}
