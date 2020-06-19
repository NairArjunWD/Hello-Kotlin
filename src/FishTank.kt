fun main(args: Array<String>) {
    fitMoreFish(10.0, listOf(3, 3, 3), 2, false)
    fitMoreFish(8.0, listOf(2, 2, 2), 2, false)
    fitMoreFish(9.0, listOf(1, 1, 3), 2, false)
    fitMoreFish(10.0, listOf(), 2, true)

}

fun fitMoreFish(

        tankSize : Double,

        currentFish : List<Int>,

        fishSize : Int,

        hasDecorations : Boolean = true) : Boolean {


    var inches = if (hasDecorations) (tankSize * 0.8 - fishSize) else (tankSize * fishSize)

    currentFish.forEach{
        inches = inches.minus(it)
        if (inches < 0) return  false

    }
    return true
}


