var numb = (1..10).random()
var input = 0


fun readInput() {
    try {
        while (true) {
            println("\nEnter a number between 1 and 10: ")
            input = readLine()?.toInt()!!
            if (input < numb) print("higher")
            else if (input > numb) print("Lower")
            else return print("Correct!")
        }
    } catch (e: NumberFormatException) {
        print("Error, please enter a number!")

    }
}

fun main() {
    readInput()
}