package round789

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun soluçãoletraB(s:String) {
    var lista = mutableListOf<Int>()
    var letra = '-'
    var contador = 1
    for (i in s.indices) {
        if (letra == '-') {
            letra = s[i]
        } else if (letra == s[i]) {
            contador++
        } else if (letra != s[i]) {
            lista.add(contador)
            letra = s[i]
            contador = 1
        } else if (i == s.length - 2) {

        }
    }
    if (contador != 0) {
        lista.add(contador)
    }
    contador = 0
    var i = 0
    while(i<lista.size) {
        if (lista[i] % 2 == 0) {

        } else {
            var j = i+1
            while(j<lista.size){
                if(lista[j]%2==1){
                    contador+=(j-i)
                    i=j
                    break
                } else {
                    j++
                }
            }
        }
        i++
    }
    println(contador)
}

fun main (){
    var x = readInt()
    var y = 0
    while(x!=y){
        readInt()
        soluçãoletraB(readln())
        y++
    }
}