import kotlin.math.roundToLong

fun Calculate(amount: Double, years : Int, interest : Double) : Double {
    fun getCalc(amount : Double, years : Int, interest : Double) : Double {
        if(years == 0) return amount
        else return getCalc(amount*(1 + interest / 100),  years-1, interest)
    }
    return getCalc(amount, years, interest)
}

Calculate(100.0, 5, 10.0).roundToLong()

println("Amount after 5 years " + Calculate(1000.0, 10, 10.0).roundToLong() + "kr")




fun recSum(intList: List<Int> = listOf()): Int {
    fun iRecSum(intList: List<Int>, sum: Int) : Int {
        if(intList.isEmpty()) return sum
        return iRecSum(intList.drop(1), intList.first() + sum)
    }
    return iRecSum(intList, sum =  0)
}
println("Sum of list: " + recSum(intList = listOf(1, 2, 3, 4, 5, 6,)))