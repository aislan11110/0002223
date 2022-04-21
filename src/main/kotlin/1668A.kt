private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun solução (x:Int, y:Int):Int {
    if (x == 1 && y == 1) {
        return 0
    } else if (x == 1 && y > 2 || x > 2 && y == 1) {
        return -1
    } else if (x == 1 && y == 2 || x == 2 && y == 1) {
        return 1
    } else {
        if (x == y) {
            return 2 * (x - 1)
        }

        return 0
    }
}

fun main () {

    var x = readInt()
    var y = 0
    while (x != y) {
        var linha = readInts()
        println(solução(linha[0], linha[1]))
        y++
    }
}
