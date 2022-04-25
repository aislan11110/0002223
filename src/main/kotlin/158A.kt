private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun sol158A(n:Int,k:Int,intArray: IntArray){
    var pontKpos= intArray[k]
    var contador = 0
    for(i in intArray.indices){
        if(i<=k && intArray[i]>0){
            contador++
        } else if(i>k && intArray[i]>0 && intArray[i]>=pontKpos){
            contador++
        } else {

        }
    }
    println(contador)
}
fun main (){

    var x = readInts()
    var z = readInts().toIntArray()
    sol158A(x[0],x[1]-1,z)
}