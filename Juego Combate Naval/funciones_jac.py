def validador_coordenadas(num_coordenada):
    while not 0<=num_coordenada<=99:
        print("Error... numero ingresado fuera de rango")
        num_coordenada=int(input("Ingrese un numero del 0 al 99: "))
    return num_coordenada
def val_error_cp():
    while True:
        try:
            num_coordenada=int(input("Ingrese el numero de la coordenada que desea poblar: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada 
def val_error_cb():
    while True:
        try:
            num_coordenada=int(input("Ingrese el numero de la coordenada que desee bombardear: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada
def val_error_p1p():
    while True:
        try:
            num_coordenada=int(input("P1 ingrese el numero de la coordenada que desea poblar: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada
def val_error_p2p():
    while True:
        try:
            num_coordenada=int(input("P2 ingrese el numero de la coordenada que desea poblar: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada
def val_error_p1b():
    while True:
        try:
            num_coordenada=int(input("P1 ingrese el numero de la coordenada que desee bombardear: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada
def val_error_p2b():
    while True:
        try:
            num_coordenada=int(input("P2 ingrese el numero de la coordenada que desee bombardear: "))
            break
        except ValueError:
            print("Error... ingrese numero")
    return num_coordenada