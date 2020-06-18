//fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
//}
//
//fun getBirthday(): Int {
//    print("\nEnter your birthday: ")
//
//    return readLine()?.toIntOrNull() ?: 1
//}
//
//fun getFortune(birthday): String {
//    val fortune = listOf(
//            "What a wonderful day!",
//            "You will be visited by three ghosts.",
//            "Relax man.",
//            "You believe in this?",
//            "Take it easy",
//            "You are going on an average adventure",
//            "No comment")
//    val index = when(birthday) {
//    in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortune.size)
//    }
//    return fortune[index]
//}