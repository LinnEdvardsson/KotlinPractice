import kotlin.math.roundToLong


fun Calculate(amount: Double, years : Int, interest : Double) : Double {
    fun getCalc(amount : Double, years : Int, interest : Double) : Double {
        if(years == 0) return amount
        else return getCalc(amount*(1 + interest / 100),  years-1, interest)
    }
    return getCalc(amount, years, interest)
}

fun main() {
    println("amount after 5 years; " + Calculate(100.0, 5, 10.0))
}