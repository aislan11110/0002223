package round789

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun soluçãoletraA(sequencia:List<Int>){
    var valorminimo = -1
    var sequencia2 = sequencia.sorted().toMutableList()
    var contador=0
    valorminimo=sequencia2[0]
    if(valorminimo==0){

    } else if(valorminimo!=0){
        var sert =false
        for (i in 0..sequencia2.size-2){
            if(sequencia2[i]==sequencia2[i+1]){
                contador++
                sequencia2[i]=0
                sert =true
                break
            }
        }
        if(!sert){
            contador++
        }
    }
    for (i in sequencia2.indices){
        if(sequencia2[i]!=0){
            contador++
        }
    }
    println(contador)
}


fun main (){
    var x = readInt()
    var y = 0
    while(x!=y){
        readInt()
        soluçãoletraA(readInts())
        y++
    }
}