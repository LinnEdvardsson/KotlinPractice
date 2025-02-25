fun loopNumber() {
    for (num in 20 downTo 2 step 2)
        print("$num ")
}

fun mulitable(table : Int, lowest : Int, highest : Int) { // ".." betyder range.
    for (num in lowest..highest) println(num * table)
}





fun main() {
//    loopNumber()
mulitable(5, 2, 5)
}