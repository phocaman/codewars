fun reverseSeq(n: Int): List<Int> {

    val reversed: MutableList<Int> = mutableListOf()

    for (i in n downTo 1)
        reversed.add(i)

    return reversed
    
}
