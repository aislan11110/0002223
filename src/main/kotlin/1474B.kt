private fun readLong() = readln().toLong() // single int
private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun éprimo(x: Long):Boolean{
    var z=2
   while(z*z<=x){
       if(x%z==0L){
           return false
       }
       z++
   }

    return true
}

fun solução(d:Long):Long{
        var primeiroprimo=d+1
        while(!éprimo(primeiroprimo)){
            primeiroprimo++
        }
        var segundoprimo = primeiroprimo+d
        while(!éprimo(segundoprimo)){
            segundoprimo++
        }

        if(primeiroprimo*primeiroprimo*primeiroprimo>primeiroprimo*segundoprimo) {
            return (primeiroprimo * segundoprimo)
        } else {
            return primeiroprimo*primeiroprimo*primeiroprimo
        }

}


fun main (){
    var t= readInt()
    var m=0
    var lista = mutableListOf<Long>()
    while(t!=m){
        lista.add(solução(readLong()))
        m++
    }
    for (x in lista){
        println(x)
    }
}