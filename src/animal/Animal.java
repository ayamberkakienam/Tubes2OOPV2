/**
 * Created by Diki Ardian W (135150092) on 3/27/17.
 */

package animal;

/** Animal
 * Kelas untuk membuat hewan
 */
public class Animal {
  static {
    /**
     * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari
     */
    consumerate = 0;
    /**
     * Jumlah hewan yang telah di construct
     */
    n_animal = 0;
  }
  /** Constructor.
   * Melakukan inisialisasi kelas dengan parameter berat,koordinat lokasi x,koordinat lokasi y,dan kejinakan
   * @param hewan nama spesies hewan
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   */
  public Animal(String hewan, int x, int y) {
    switch (hewan) {
      case "Bekantan" :
      {
        name = "Bekantan";
        habitat = "Land";
        weight = 50;
        type = "Herbivore";
        tamed = true;
        diet = "Fruit";
        legs = 2;
        content = 'A';
        suara = "Uuuuuuuu";
        break;
      }
      case "BurungHantu" :
      {
        name = "Burung Hantu";
        habitat = "Air";
        weight = 2;
        type = "Carnivore";
        tamed = true;
        diet = "Meat";
        legs = 2;
        content = 'B';
        suara = "Kur kur kur";
        break;
      }
      case "Codot" :
      {
        name = "Codot";
        habitat = "Air";
        weight = (float)0.5;
        type = "Herbivore";
        tamed = false;
        diet = "Fruit";
        legs = 2;
        content = 'C';
        suara = "Cit cit cit";
        break;
      }
      case "Elang" :
      {
        name = "Elang";
        habitat = "Air";
        weight = 3;
        type = "Carnivore";
        tamed = false;
        diet = "Meat";
        legs = 2;
        content = 'D';
        suara = "Koak koakk koakk";
        break;
      }
      case "Gajah" :
      {
        name = "Gajah";
        habitat = "Land";
        weight = 3500;
        type = "Herbivore";
        tamed = true;
        diet = "Leaf";
        legs = 4;
        content = 'E';
        suara = "Ngoett";
        break;
      }
      case "Gorilla" :
      {
        name = "Gorilla";
        habitat = "Land";
        weight = 200;
        type = "Herbivore";
        tamed = false;
        diet = "Fruit";
        legs = 2;
        content = 'C';
        suara = "Huhahuha";
        break;
      }
      case "Harimau" :
      {
        name = "Harimau";
        habitat = "Land";
        weight = 450;
        type = "Carnivore";
        tamed = false;
        diet = "Meat";
        legs = 4;
        content = 'G';
        suara = "Roarrrr";
        break;
      }
      case "Hiu" :
      {
        name = "Hiu";
        habitat = "Water";
        weight = 100;
        type = "Carnivore";
        tamed = true;
        diet = "Meat";
        legs = 0;
        content = 'H';
        suara = "Shush shush";
        break;
      }
      case "IkanTerbang" :
      {
        name = "Ikan Terbang";
        habitat = "Water";
        weight = 2;
        type = "Carnivore";
        tamed = true;
        diet = "Insect";
        legs = 0;
        content = 'I';
        suara = "Cepok cepok cepok";
        break;
      }
      case "Jerapah" :
      {
        name = "Jerapah";
        habitat = "Land";
        weight = 500;
        type = "Herbivore";
        tamed = true;
        diet = "Leaf";
        legs = 4;
        content = 'J';
        suara = "Ngoet ngoet";
        break;
      }
      case "Kancil" :
      {
        name = "Kancil";
        habitat = "Land";
        weight = 60;
        type = "Herbivore";
        tamed = true;
        diet = "Leaf";
        legs = 4;
        content = 'K';
        suara = "Ngik ngik ngik";
        break;
      }
      case "Kepik" :
      {
        name = "Kepik";
        habitat = "Air";
        weight = (float)0.01;
        type = "Herbivore";
        tamed = true;
        diet = "Nectar";
        legs = 6;
        content = 'L';
        suara = "Krik krik krik";
        break;
      }
      case "Kepiting" :
      {
        name = "Kepiting";
        habitat = "Water";
        weight = 1;
        type = "Omnivore";
        tamed = true;
        diet = "Plankton";
        legs = 10;
        content = 'M';
        suara = "Kuikk kuikk";
        break;
      }
      case "KumbangHutan" :
      {
        name = "Kumbang Hutan";
        habitat = "Air";
        weight = (float)0.05;
        type = "Herbivore";
        tamed = true;
        diet = "Nectar";
        legs = 6;
        content = 'N';
        suara = "Kruk kruk kruk";
        break;
      }
      case "KupuKupu" :
      {
        name = "KupuKupu";
        habitat = "Air";
        weight = (float)0.03;
        type = "Herbivore";
        tamed = true;
        diet = "Nectar";
        legs = 6;
        content = 'O';
        suara = "Wir wir";
        break;
      }
      case "Lobster" :
      {
        name = "Lobster";
        habitat = "Water";
        weight = (float)0.5;
        type = "Omnivore";
        tamed = true;
        diet = "Plankton";
        legs = 10;
        content = 'P';
        suara = "Crek crek crek";
        break;
      }
      case "LumbaLumba" :
      {
        name = "Lumba lumba";
        habitat = "Water";
        weight = 100;
        type = "Omnivore";
        tamed = true;
        diet = "Plankton";
        legs = 0;
        content = 'Q';
        suara = "Cet cet cet";
        break;
      }
      case "MacanTutul" :
      {
        name = "Macan Tutul";
        habitat = "Land";
        weight = 350;
        type = "Carnivore";
        tamed = true;
        diet = "Meat";
        legs = 4;
        content = 'R';
        suara = "Aummmm";
        break;
      }
      case "OwaOwa" :
      {
        name = "OwaOwa";
        habitat = "Land";
        weight = 70;
        type = "Herbivore";
        tamed = true;
        diet = "Fruit";
        legs = 2;
        content = 'S';
        suara = "Huhuhuhu";
        break;
      }
      case "PausSperma" :
      {
        name = "Paus Sperma";
        habitat = "Water";
        weight = 7000;
        type = "Omnivore";
        tamed = true;
        diet = "Plankton";
        legs = 0;
        content = 'T';
        suara = "Srosh srosh";
        break;
      }
      case "Piranha" :
      {
        name = "Piranha";
        habitat = "Water";
        weight = (float)0.7;
        type = "Carnivore";
        tamed = false;
        diet = "Meat";
        legs = 0;
        content = 'U';
        suara = "Kraus kraus";
        break;
      }
      case "Platypus" :
      {
        name = "Platypus";
        habitat = "Land and Water";
        weight = 5;
        type = "Carnivore";
        tamed = true;
        diet = "Insect";
        legs = 4;
        content = 'Z';
        suara = "Krr krr";
        break;
      }
      case "Singa" :
      {
        name = "Singa";
        habitat = "Land";
        weight = 400;
        type = "Carnivore";
        tamed = false;
        diet = "Meat";
        legs = 4;
        content = 'W';
        suara = "Groarrr";
        break;
      }
      case "SingaLaut" :
      {
        name = "Singa Laut";
        habitat = "Water";
        weight = 70;
        type = "Carnivore";
        tamed = false;
        diet = "Meat";
        legs = 0;
        content = 'Y';
        suara = "Ou ou ou";
        break;
      }
    }
    fodder = (float)0.025*weight;
    loc_x = x;
    loc_y = y;
    n_animal++;
    consumerate += fodder;
    n_animal++;
  }
  /** Menetapkan lokasi dari sebuah objek animal
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   */
  public void setLoc(int x, int y) {
    loc_x = x;
    loc_y = y;
  }
  /** Menghasilkan nama hewan
   * @return string suara hewan.
   */
  public String getName() {
    return  name;
  }
  /**
   * Mengembalikan letak baris objek pada map zoo
   * @return Indeks baris map zoo dimana objek berada
   */
  public int getLocX() {
    return loc_x;
  }
  /**
   * Mengembalikan letak kolom objek pada map zoo
   * @return Indeks kolom map zoo dimana objek berada
   */
  public int getLocY() {
    return loc_y;
  }
  /**
   * Mengembalikan jumlah makanan yang dikonsumsi hewan per hari
   * @return Berat makanan yang dikonsumsi hewan dalam satu hari
   */
  public double getFodder() {
    return 0.025 * weight;
  }
  /**
   * getter nilai atribut content
   * @return content
   */
  public char getContent() {
    return content;
  }
  /**
   * Mengembalikan berat badan hewan
   * @return Berat badan hewan
   */
  public float getWeight() {
    return weight;
  }
  /**
   * Mengembalikan true jika hewan telah dijinakkan
   * @return True apabila hewan telah dijinakkan
   */
  public boolean IsTamed() {
    return tamed;
  }
  /**
   * Mengembalikan jumlah kaki objek Animal
   * @return Jumlah kaki hewan
   */
  public int getLegs() {
    return legs;
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan baris
   * yang sama dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell dengan indeks baris
   * yang sama dengan objek an
   */
  public boolean DistLocX(Animal an) {
    return (loc_x != an.loc_x);
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan kolom
   * yang sama dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell dengan indeks kolom
   * yang sama dengan objek an
   */
  public boolean DistLocY(Animal an) {
    return (loc_y != an.loc_y);
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell yang sama
   * dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell yang sama dengan
   * objek an
   */
  public boolean DistLoc(Animal an) {
    return (DistLocX(an) || DistLocY(an));
  }
  /**
   * Mencetak semua atribut kelas beserta nilainya.
   */
  public void getInfo() {
    System.out.println("Content        : "+content);
    System.out.println("Name           : "+name);
    System.out.println("Location       : ("+loc_x+","+loc_y+")");
    System.out.println("Weight         : "+String.format("%.5f",weight)+" kg/day");
    System.out.println("Habitat        : "+habitat);
    System.out.println("Type           : "+type);
    System.out.println("Diet           : "+diet);
    System.out.println("Fodder         : "+String.format("%.5f",getFodder())+" kg");
    System.out.println(tamed ? "Tame           : Yes " : "Tame           : No ");
    System.out.println("Number of Legs : "+legs);
  }
  /**
   * Mengembalikan string yang menggambarkan
   * interaksi user dengan hewan
   * @return suara
   */
  public String Interact(){
    return suara;
  }
  /**
   * Mengembalikan berat total makanan yang dikonsumsi semua hewan per hari
   * @return Berat makanan yang dikonsumsi semua jenis hewan pada map zoo per hari
   */
  static public float getConsumeRate() {
    return consumerate;
  }
  /**
   * getter nilai data n_animal
   * @return n_animal
   */
  static public int getNAnimal() {
    return  n_animal;
  }
  /**
   * Nama jenis hewan
   */
  protected String name;
  /**
   * Habitat hidup hewan
   */
  protected String habitat;
  /**
   * Berat tubuh hewan
   */
  protected float weight;
  /**
   * Jumlah makan yang dikonsumsi hewan per hari
   */
  protected float fodder;
  /**
   * Tipe diet hewan
   */
  protected String type;
  /**
   * True apabila hewan telah dijinakkan
   */
  protected boolean tamed;
  /**
   * Jenis makanan hewan
   */
  protected String diet;
  /**
   * Indeks baris pada map zoo tempat hewan berada
   */
  protected int loc_x;
  /**
   * Indeks kolom pada map zoo tempat hewan berada
   */
  protected int loc_y;
  /**
   * Jumlah kaki hewan
   */
  protected int legs;
  /**
   * Karakter yang melambangkan hewan apabila map zoo dicetak
   */
  protected char content;
  /**
   * Suara hewan
   */
  protected String suara;
  /**
   * Suara hewan yang telah di construct
   */

  static public int n_animal;
  /**
   * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari
   */
  static public float consumerate;
}
