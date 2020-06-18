import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe" } fish"
    println(message)

    val current = LocalDateTime.now()
    val cal = Calendar.getInstance()
    val hours = cal.get(Calendar.HOUR_OF_DAY)

    val greetings = "${ if (hours < 12) "Good morning, ${args[0]}" else "Good night, ${args[0]}" }"

    println("Current Date and Time is: $current")
    println("Current Hour is: $hours")
    println("$greetings")

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
