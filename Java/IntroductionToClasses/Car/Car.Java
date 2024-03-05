public class Main {

  int Año;

  String Marca;

  int Cilindrage;

  String Color;

  public Main(int year, String Name, int Power, final String Tipo){
    Año = year;
    Marca = Name;
    Cilindrage = Power;
    Color = Tipo;
  }
  
  public static void main(String[] args) {
    Main Carro1 = new Main(2020, "Ford", 2000, "Rojo");
    System.out.println(Carro1.Año + " / " + Carro1.Marca + " / " + Carro1.Cilindrage + " / " + Carro1.Color);
    
  }
}
