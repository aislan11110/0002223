private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map{ it.toLong()}


fun bsolução(k:Long,n:Long){
    var arrayint = readln()
    var arrayflopado =""
    var bitsselect = IntArray(n.toInt())
    var moves = k
    if(k>0) {
        for (i in 0 until n) {
            if(moves==0L){
                break
            }
            if (k % 2L == 1L && arrayint[i.toInt()] == '1') {
                bitsselect[i.toInt()] += 1
                moves--
            } else if (k % 2L == 0L && arrayint[i.toInt()] == '0') {
                bitsselect[i.toInt()] += 1
                moves--
            }
        }
        if (moves > 0) {
            bitsselect[n.toInt() - 1] += moves.toInt()
        }
        for (x in 0 until n) {
            if ((k - bitsselect[x.toInt()]) % 2L == 0L) {
                arrayflopado += if (arrayint[x.toInt()] == '0') {
                    "0"
                } else {
                    "1"
                }
            } else if ((k - bitsselect[x.toInt()]) % 2L == 1L) {
                arrayflopado += if (arrayint[x.toInt()] == '0') {
                    "1"
                } else {
                    "0"
                }
            }
        }
        println(arrayflopado)
    } else {
        println(arrayint)
    }
    for (x in 0 until n) {
        print(bitsselect[x.toInt()].toString() + " ")
        if (x == n - 1) {
            println()
        }
    }
}


fun main(){
    var y= readInt()
    var x = 0

    while(x!=y){
        var lista = readLongs()
        bsolução(lista[1],lista[0])
        x++
    }
}