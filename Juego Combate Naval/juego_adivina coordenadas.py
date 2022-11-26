import os
import time
import random as rd
import numpy as np
import funciones_jac as fj
arreglo_jugador=np.empty([10,10],dtype=object)
arreglo_computador=np.empty([10,10],dtype=object)
arreglo_coordenadas=np.empty([10,10],dtype=int)
lista_computador=[]
lista_jugador=[]
indice=-1
for a in range(10):
    for b in range(10):
        indice=indice+1
        arreglo_coordenadas[a,b]=indice
while True:
    os.system("cls")
    for a in range(10):
        for b in range(10):
            arreglo_jugador[a,b]="A"
            arreglo_computador[a,b]="A"
    op_menu=str(input('''Combate naval V0.7
1.- Ver reglas del juego
2.- Iniciar vs ia
3.- Iniciar 1 vs 1
4.- Salir
Digite el numero de la opción a elegir: ''')).strip()
    if op_menu=="1":
        os.system("cls")
        print('''Bienvenido a Combate naval
En este juego lo primero es saber que la A representa agua y la B representa Barco.
Sabiendo esto a continuacion se presenta el campo de batalla del que dispondra cada jugador.''')
        print(f"Campo del jugador: \n{arreglo_jugador}")
        print(f"Campo del computador: \n{arreglo_computador}")
        print(f'''Cada jugador puede colocar hasta 10 barcos(B).
luego de esto cada jugador en su turno bombardeara las coordenasdas del contrincante.
Estas se ordenan de la siguiente manera en el campo de batalla:
Campo: \n{arreglo_coordenadas}
El primero que hunda los barcos de su contrincante gana\n''')
        os.system("pause")
    if op_menu=="2":
        os.system("cls")
        for k in range(10):
            num_coordenada=fj.val_error_cp()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            while num_coordenada in lista_jugador:
                print("Error... ingrese un numero distinto")
                num_coordenada=fj.val_error_cp()
                num_coordenada=fj.validador_coordenadas(num_coordenada)
            lista_jugador.append(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        arreglo_jugador[a,b]="B"
        lista_jugador.clear()
        for k in range(10):
            num_coordenada=rd.randint(0,99)
            while num_coordenada in lista_computador:
                num_coordenada=rd.randint(0,99)
            lista_computador.append(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        arreglo_computador[a,b]="B"
        lista_computador.clear()
        while True:
            num_coordenada=fj.val_error_cb()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        if arreglo_computador[a,b]=="B":
                            arreglo_computador[a,b]="A"
            num_coordenada=rd.randint(0,99)
            while num_coordenada in lista_computador:
                num_coordenada=rd.randint(0,99)
            lista_computador.append(num_coordenada)
            print(f"Computador ha bombardeado: {num_coordenada}")
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        if arreglo_jugador[a,b]=="B":
                            arreglo_jugador[a,b]="A"
            if not "B" in arreglo_jugador:
                print("Computador ha ganado")
                break
            elif not "B" in arreglo_computador:
                print("Jugador ha ganado")
                break
        lista_computador.clear()
        print(f"Campo del jugador: \n{arreglo_jugador}")
        print(f"Campo del computador: \n{arreglo_computador}\n")
        os.system("pause")
    if op_menu=="3":
        os.system("cls")
        for k in range(10):
            num_coordenada=fj.val_error_p1p()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            while num_coordenada in lista_jugador:
                print("Error... ingrese un numero distinto")
                num_coordenada=fj.val_error_p1p()
                num_coordenada=fj.validador_coordenadas(num_coordenada)
            lista_jugador.append(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        arreglo_jugador[a,b]="B"
        lista_jugador.clear()
        print("Mantenga en su memoria las coordenadas elegidas")
        os.system("pause")
        os.system("cls")
        for k in range(10):
            num_coordenada=fj.val_error_p2p()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            while num_coordenada in lista_computador:
                print("Error... ingrese un numero distinto")
                num_coordenada=fj.val_error_p2p()
                num_coordenada=fj.validador_coordenadas(num_coordenada)
            lista_computador.append(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        arreglo_computador[a,b]="B"
        lista_computador.clear()
        print("Mantenga en su memoria las coordenadas elegidas")
        os,os.system("pause")
        os.system("cls")
        while True:
            num_coordenada=fj.val_error_p1b()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        if arreglo_computador[a,b]=="B":
                            arreglo_computador[a,b]="A"
            num_coordenada=fj.val_error_p2b()
            num_coordenada=fj.validador_coordenadas(num_coordenada)
            for a in range(10):
                for b in range(10):
                    if num_coordenada==arreglo_coordenadas[a,b]:
                        if arreglo_jugador[a,b]=="B":
                            arreglo_jugador[a,b]="A"
            if not "B" in arreglo_jugador:
                print("Jugador 2 ha ganado")
                break
            elif not "B" in arreglo_computador:
                print("Jugador 1 ha ganado")
                break
        print(f"Campo del jugador 1: \n{arreglo_jugador}")
        print(f"Campo del jugador 2: \n{arreglo_computador}\n")
        os.system("pause")
    if op_menu=="4":
        os.system("cls")
        op_salir=str(input("¿esta seguro que desea salir?(S/N): ")).strip().upper()
        if op_salir=="S":
            break
print("Cerrando aplicación")
time.sleep(1)