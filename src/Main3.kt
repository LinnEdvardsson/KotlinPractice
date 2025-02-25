//REKURSION

fun functional(n: Int): Int {
    if(n <= 1) return 1
    return n * functional(n - 1)
}

fun facc(n: Long) : Long {
    fun facAcc(acc: Long, n: Long): Long {
        if(n== 1L) return acc
        else return facAcc(n*acc, n-1)
    }
    return facAcc(1, n)
}

 fun facct2(n: Long) : Long {
    tailrec fun facAcc(acc: Long, n: Long): Long {
        if(n== 1L) return acc
        else return facAcc(n*acc, n-1)
    }
    return facAcc(1, n)
}

fun main(){
    println(functional(5))
    println(facc(5))
    println(facct2(5))
}

