private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun main (){

    var x = readInts()
    var y = 0
    var contador =0
    var z = readInts()
    while(y!=x[0]){
        if(z[y]>x[1]){
            contador++
        }
        y++
    }
    println(contador)
}