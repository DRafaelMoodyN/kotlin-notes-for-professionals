fun resultNumber (numero: Int): Int{
    return 900
}

fun main(){

    // Conditional

    val myName:String ="David"

    // Condition if
    if (myName.equals("David")){
        println("My name is David")
    }  else if(myName.equals("david")) {
        println("My name is david")
    } else {
        println("My name is not david")
    }

    // for Cascades of Conditions
    when(myName){
        "David" -> println("My name is David when")
        "david" -> println("My name is david when")
        else -> println("My name is not david when")
    }

    var myNumber:Int = 900

    when(myNumber){
        700 -> println("El valor es 700")
        1, 2,3 -> println("El valor puede ser 1,2,3")
        in 6..10 -> println("El valor esta entre 6 y 10")
        !in 30..50 -> println("El valor no esta entre 30 y 80")
        else -> println("El valor no se encontro")
    }

    // when sin argumento (permite condiciones booleanas)
    when {
        myNumber < 18 -> println("El valor es menor que 18")
        resultNumber(myNumber) == 900 -> println("El número es correcto")
        else -> println("El valor no se encontró")
    }

    // Observece que no hay sentencias break

    //  Expressions
    var whenResult = when("david"){
        "david" -> "Soy David"
        else -> "No se quien soy"
    }

    println("Soy $whenResult")
}

