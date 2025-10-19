fun main() {
    val (x, k) = readLine()!!.split(" ").map { it.toInt() }
    println(recTable(0, x, k))
}

tailrec fun recTable(i: Int, x: Int, k: Int): Int{
    if (i==k)
        return x
    else
        return recTable(i + 1, x + x % 10, k)
}
