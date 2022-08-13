package round799
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


private fun answerA(lista:List<Int>):Int{
    var x=0;

    for(i in 1 until lista.size){
        if(lista[0]<=lista[i]){
            x++
        } else {

        }
    }

    return x;
}

fun main(){
    var y = readInt()
    var x=0
    while(x!=y){
        var lista = readInts()
        println(answerA(lista));
        x++
    }
}
