
def mostrar_menu():
    print("Selecciona una operación:")
    print("1. Sumar")
    print("2. Restar")
    print("3. Multiplicar")
    print("4. potencia")
    print ("5. dividir")
    print("0. Salir")
    print()
    opcion = int(input("Ingrese su opción: "))
    print()
    return opcion


class calculadora:
   def __init__(self):
      self.a = int(input("Ingrese el primer número: "))
      self.b = int(input("Ingrese el segundo número: "))
      print()


   def suma(self):
      print(f"la suma de los numeros es: {self.a + self.b }")
      print()
   def resta(self):
      print(f"la resta de los numeros es: {self.a - self.b}")
      print()
   def multiplicacion(self):
      print(f"la Multiplicación de los numeros es: {self.a * self.b}")
      print()
   def potencia(self):
      print(f"su numero de la base es: {self.a} y su exponente es {self.b}")
      print()
      print(f"Su resultado es: {self.a **self.b}")
      print()
   def division(self):
      if self.b ==0:
         print ("Error, no se puede dividir por cero")
      else:  
         print(f"la divisió de los numeros es {self.a / self.b}")
         print()
   
