package div2A

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun sol112A(s:String,r:String):Int{
    var palavra1 =s.toLowerCase()
    var palavra2 = r.toLowerCase()
    for(i in palavra1.indices){
        if(palavra1[i]>palavra2[i]){
            return 1
        } else if (palavra2[i]>palavra1[i]){
            return -1
        }
    }
    return 0
}


fun main(){
    println(sol112A(readln(), readln()))
}