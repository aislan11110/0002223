package eduround128

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun code(lista:List<Int>){
    if(lista[2]>lista[0] && lista[2]<lista[1]){
        println(lista[2])
    } else if(lista[0]>lista[2] && lista[0]<lista[3]){
        println(lista[0])
    } else if(lista[0]==lista[2]){
        println(lista[0])
    } else {
        println(lista[0]+lista[2])
    }
}

fun main (){

    var y=readInt()
    var x=0
    while(x!=y){
        code(readInts())
        x++
    }
}
