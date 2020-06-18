import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

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