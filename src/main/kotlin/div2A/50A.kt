package div2A

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun sol50A(M:Int,N:Int){
    var areatab=M*N
    if(areatab%2==0){
        println(areatab/2)
    } else {
        println((areatab-1)/2)
    }
}

fun main(){
    var lista = readInts()
    sol50A(lista[0],lista[1])
    
}