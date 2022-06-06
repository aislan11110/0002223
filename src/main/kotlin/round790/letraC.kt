package round790

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun code(mutableList: MutableList<String>){
    var diferencamin=-1
    var tamanhostring = mutableList[0].length
    for(i in mutableList.indices){
        for(j in i+1 until mutableList.size){
            var diferençaatual=0;
            for (k in 0 until tamanhostring){
                var serto = mutableList[j][k] - mutableList[i][k]
                if(serto<0){
                    serto *= -1
                }
                diferençaatual+= serto
            }
            if(diferencamin==-1){
                diferencamin=diferençaatual
            } else if(diferencamin>diferençaatual){
                diferencamin= diferençaatual
            }
        }
    }
    println(diferencamin)
}

fun main(){
    var y= readInt()
    var x=0
    while(x!=y){
        var z = readInts()
        var w =0
        var listadepalavras = mutableListOf<String>()
        while(z[0]!=w){
            var palavra = readln()
            listadepalavras.add(palavra)
            w++
        }
        code(listadepalavras)
        x++
    }
}