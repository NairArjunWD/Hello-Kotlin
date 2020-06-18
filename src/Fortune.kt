import java.util.*

fun main(args: Array<String>) {
    println("\nYour fortune is: ${getFortuneCookie()}")
}

fun getFortuneCookie() : String {
    val fortune = listOf("What a wonderful day!", "You will be visited by three ghosts.", "Relax man.", "You believe in this?", "Take it easy")
    print("\nEnter your birthday: ")

    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortune[birthday.rem(fortune.size)]


}