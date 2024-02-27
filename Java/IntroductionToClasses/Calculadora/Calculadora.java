public class Main{

  int X;
  int Y;
  float R;

  public Main(int A, int B, float C) {
    X = A;
    Y = B;
    R = C;
  }

  public float Sumar(int A, int B) {
    X = A;
    Y = B;
    R = X + Y;
    return R;
  }

  public float Restar(int A, int B){
    X = A;
    Y = B;
    R = X - Y;
    return R;
  }

  public float Multiplicar(int A, int B){
    X = A;
    Y = B;
    R = X * Y;
    return R;
  }

  public float Dividir(int A, int B){
    X = A;
    Y = B;
    R = X / Y;
    return R;
  }

  public void Resultado() {
    System.out.println("El resultado es: " + R);
  }

  public static void main(String[] args) {
      Main Obj1 = new Main(0, 0, 0);
    Obj1.Sumar(5, 5);
    Obj1.Resultado();

      Main Obj2 = new Main(0, 0, 0);
    Obj2.Restar(23, 5);
    Obj2.Resultado();

      Main Obj3 = new Main(0, 0, 0);
    Obj3.Multiplicar(5, 5);
    Obj3.Resultado();

      Main Obj4 = new Main(0, 0, 0);
    Obj4.Dividir(5, 5);
    Obj4.Resultado();
  }

}
