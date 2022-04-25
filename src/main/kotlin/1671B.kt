private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun sol1671B(arraydenumeros:IntArray){
    if(arraydenumeros.size==1){
        println("YES")
    } else {
        var array=arraydenumeros
        var arrayD = IntArray(array.size-1)
        for(i in arrayD.indices){
            arrayD[i]=array[i+1]-array[i]
        }

    }
}


fun main(){
    var y = readInt()
    var x =0
    while(x!=y){
        readInt()
        sol1671B(readInts().toIntArray())
        x++
    }
}