//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Los comentarios de una linea son con doble slash
    /*
    los comentarios de mas de una linea se abren con slash asterisco y se cierran con asterisco slash




    //VARIABLES DE TIPO IMPLICITO
    //deduce automaticamente que tipo de dato estas colocando

    //VARIABLES se declaran con la palabra "var"
    //CONSTANTES se declaran con la palabra "val"
    //A diferencia de JAVA en kotlin no se requiere cerrar la centencia con ;
    println("Hola Mundo")
    var numero = 56 //variable de tipo entero
    var decimal = 12.3 //variable de tipo decimal
    var texto = "Repaso kotlin" //variable de tipo String
    val pi = 3.14 //constante

    println("Variable de tipo entero ${numero}")
    println("Variable de tipo decimal ${decimal}")
    println("Variable de tipo String ${texto}")
    println("Constante ${pi}")

*/

/*
    //VARIBLES DE TIPO EXPLICITO
    //debes declarar que tipo de variable vas a manejar

    var numero: Int = 56
    var decimal: Double = 12.3

    println("variable de tipo entero ${numero}")
    println("variable de tipo decimal ${decimal}")
*/
/*
    //Para imprimir varias lineas se usa el print pero con 3 comillas dobles

    println("""
        linea 1
        linea 2
        linea 3
    """.trimIndent())

    //INGRESAR DATOS POR TECLADO

    println("Ingrese un numero")
    var n1 = readln().toInt() //readln pide el valor en tipo String y el .toInt lo convierte a entero

    println("Ingrese otro numero")
    var n2 = readln().toInt()

    var suma = n1+n2

    println("La suma de ${n1} y ${n2} es ${suma}")



    //CONDICIONALES

    //if - else
    /*
    if (condicion){
        instruccion v
    }else{
        intruccion v
    }
    */

    if (suma > 0){
        println("el numero ${suma} es positivo")
    }else if (suma < 0){
        println("el numero ${suma} es negativo")
    }else{
        println("el numero es CERO")
    }
*/


    //when
    /*
    when (var) {     //valor de una variable o condicion dentro del parentesis
        1-> println("instruccion")
        //cuando son varias instrucciones se abre llaves
        2-> {
            println("instruccion")
            println("instruccion")
            println("instruccion")
            println("instruccion")
        }
        else -> {
            println("instruccion")
            println("instruccion")
            println("instruccion")
        }
    }
    */
/*

    //ciclo for

    for (i in 1 .. 100){ //le dice a i que empiece en 1 y vaya hasta 100
        println(i)
    }

    for (x in 100 downTo 1 step 3){ //aqui le dice x que empiece en 100 y baje hasta 1 pero de 3 en 3, para eso es el step
        println(x)
    }

*/
/*

//while
    var z = 1
    while (z<=100){ //condicion
        println(z)  //instruccion
        z+=1 //que incremente 1 en cada ciclo
    }


    //do while
    var c = 0
    do {
        c += 1  //aumento o decremento
        println(c)  //instruccion
    }while (c<100)  //condicion

//
}