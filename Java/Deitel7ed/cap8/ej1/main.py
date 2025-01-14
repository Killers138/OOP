import clase

opciones = clase.mostrar_menu()


Calcular = clase.calculadora()

if opciones==1: 
    Calcular.suma()
elif opciones ==2 :
    Calcular.resta()
elif opciones==3 :
    Calcular.multiplicacion()
elif opciones==4 :
    Calcular.potencia()
elif opciones==5 :
    Calcular.division()
elif opciones > 5:
    print ("No selecciono ninguna operacion.")







