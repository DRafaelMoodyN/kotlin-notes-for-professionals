fun main() {
    print("Hola mundo \n")

    // Existen 2 tipos de variables
    // var que es mutable
    // val que es inmutable

    // Variable mutable que apunta a una cadena inmutable
    var myName:String ="David Rafael"
    myName += " Moody Nunez"

    println("Mi nombre es: $myName")

    // variable inmutable que apunta a un objeto mutable
    val myListNumber = mutableListOf(1,2,3,4,5)

    println("Mi lista original 1: $myListNumber")

    // Aun que myListNumber no se puede reasignar, si podemos modifar su contenido
    myListNumber.add(6)
    println("Mi lista original 2: $myListNumber")

    // Si intentamos hacer esto, dara error de compilacion
    // myListNumber = mutableListOf(1,2,3,4,5)

    //  Para aprovechar la inmutabiidad de forma completa, tanto la referencia com el objeto debe ser
    // mutables
}
