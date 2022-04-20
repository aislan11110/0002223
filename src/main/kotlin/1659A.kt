private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


// não funciona

fun solucao(n:Int,r:Int,b:Int):String{
    var astring =""

        var divresultado=r/(b+1)
        var zeta = r % (b + 1)

        for(i in 0 until divresultado){
            astring+="R"
        }
        for (i in 0 until b){
            if(zeta>0){
                astring+="R"
                zeta--
            }
            astring+="B"
            for(i in 0 until divresultado){
                astring+="R"
            }
        }

    return astring
}


fun main(){
    var y = readInt()
    var x =0
    while(x!=y){
        var lista= readInts()
        println(solucao(lista[0],lista[1],lista[2]))
        x++
    }
}