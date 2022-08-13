package round799
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

private fun answer(tab:List<List<String>>): List<Int> {
    var x = 0
    var y = 0
    for(i in tab[0].indices){
        if(tab[0][i] == "#"){
            x = 0
            y = i
            break
        }
    }
    if(tab[x+1][y+1]=="#"){
        while(tab[x+1][y+1]=="#"){
            if(tab[x+2][y]=="#"){
                return listOf<Int>(x+2,y+1)
            }
            x++
            y++
        }
    } else if(tab[x+1][y-1]=="#"){
        while(tab[x+1][y-1]=="#"){
            if(tab[x+2][y]=="#"){
                return listOf<Int>(x+2,y-1)
            }
            x++
            y--
        }
    }

    return listOf<Int>(x,y)
}

fun main(){
    var y = readInt()
    var x = 0

    while(x!=y){
        readln()
        var tab = mutableListOf<List<String>>()
        for(i in 0..7){
            tab.add(readln().split(""))
        }
      var zeta =  answer(tab.toList())
        println(zeta[0].toString()+" "+zeta[1].toString())
        x++
    }
}
