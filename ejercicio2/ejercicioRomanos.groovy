import java.util.Scanner;
/**
 * Created by dell on 06/03/2015.
 */
/*
programa que implemente la conversion a numeros a romanos
* */

println("ingerse un numero del rango 1-3999")
nc=new Scanner(System.in)
def numero=nc.nextLine()
def  posision=numero.length()
def resultado=""
def punto=0
if (posision==4){numero[punto].toInteger().times {resultado=resultado +"M"}
    punto++
    posision--
    }
    if(posision==3 ){
        if (numero[punto].toInteger()==9){resultado=resultado+"CM"}
        if (numero[punto].toInteger()>5 && numero[punto].toInteger()<9){resultado=resultado+"D"(numero[punto].toInteger()-5).times {resultado=resultado+"C"}
        }
       if (numero[punto].toInteger()==5){resultado=resultado+"D"}
        if (numero[punto].toInteger()==4){resultado=resultado+"CD"}
        if (numero[punto].toInteger()<4){numero[punto].toInteger().times {resultado=resultado+"C"}}
        punto++
        posision--
    }
if(posision==2){
    if (numero[punto].toInteger()==9){resultado=resultado+"XC"}
    if (numero[punto].toInteger()>5 && numero[punto]<9){resultado=resultado+"L"+(numero[punto].toInteger()-5).times {resultado+"x"}}
    if (numero[punto].toInteger()==5){resultado=resultado+"L"}
    if (numero[punto].toInteger()<4){numero[punto].toInteger().times {resultado=resultado+"X"}}
    punto++
    posision--
}
if (posision==1){
    if (numero[punto].toInteger()==9){resultado=resultado+"IX"}
    if (numero[punto].toInteger()>5 && numero[punto]<9){resultado=resultado+"V"+(numero[punto].toInteger()-5).times {resultado+"I"}}
    if (numero[punto].toInteger()==5){resultado=resultado+"V"}
    if (numero[punto].toInteger()==4){resultado=resultado+"IV"}
    if (numero[punto].toInteger()<4){numero[punto].toInteger().times {resultado=resultado+"I"}}
    punto++
    posision--
}

println ("EL numero Romano es "+resultado)

// Arabigos a romanos
println("ingrese el numero Romano")
romano=nc.nextLine()
def salida
romano.each{  if (it=="M"){salida[0]=salida+1}
              if (it=="L"){salida[1]=salida+5}
}

