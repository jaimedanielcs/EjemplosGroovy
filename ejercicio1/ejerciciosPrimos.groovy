import javax.print.attribute.standard.DateTimeAtCompleted

/**
 * Created by dell on 05/03/2015.
 */
//decrementa el numero inicial hasta el valor dado despues de downto
//10.downto(5){println it}
//incrementa el numero dado hasta el valor despues de upto
//2.upto(20){println it}
//itera un numero de veces la accion o sentencia que se desee
//10.times {println "${it} te engañe"}

//Ejercicio que se itere 100 veces numero y que de esas 100 veces imprima el numero par
/*100.times {
    if(it>1){
        if(!(2..it).any(){numero -> it % numero ==0 && it !=numero}) println("${it},")
    }
}*/
long time_star,time_end;
time_star=System.currentTimeMillis();

100.times{
    if(!(2..it).any(){
        numero -> it % numero==0 && it !=numero})
        println("${it}")
}






time_end =System.currentTimeMillis()
System.out.println("/tiempo de ejecucion "+(time_end-time_star)+" milis" )
//List.firs()
//def l=[5,6,7,8,9,10]
//println "\nfirst ${l.first()}"

//List.last()
//println "last ${l.last()}"
//List.head()
//println "head ${l.head()}"
//List.tail
//println "tali ${l.tail()}"
//List.reverse()
//println "tail ${l.reverse()}"
//List.reverseEach()
//l.reverseEach {
//    println it
//}
//List.execute()
//println (["uname","-a"].execute().getText())