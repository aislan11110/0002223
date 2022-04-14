private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun solução231A(lista:List<List<Int>>):Int{
    var contador=0

    var y=0
    var x=0
    var sabem =0
    while(x<lista.size){
        while(y<lista[x].size){
            if(lista[x][y]==1){
                sabem++
            }
            y++
        }
        if(sabem>=2){
            contador++
        }
        sabem=0
        y=0
        x++
    }


    return contador
}

fun main (){
    var y = readInt()
    var x=0
    var lista = mutableListOf<List<Int>>()
    while(x!=y){
        lista.add(readInts())
        x++
    }
    println(solução231A(lista))
}