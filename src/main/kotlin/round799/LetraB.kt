package round799
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

private fun answer(Lista:List<Int>):Int{
    var Hashmap = HashSet<Int>()
    var z=0;
    for (i in Lista.indices) {
            Hashmap.add(Lista[i])
    }
   if((Lista.size-Hashmap.size)%2 ==0){
       return Hashmap.size
   } else {
       return Hashmap.size-1
   }
}

fun main (){
    var y = readInt()
    var x=0
    while(x!=y){
        readInt()
        println(answer(readInts()))
        x++
    }
}