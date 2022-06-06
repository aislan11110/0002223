package round791

private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun code(n:Long){
    var rodas = n
    var valormin=0L
    var valormax=0L
    var serto =0;
    if(n%6L==0L) {
         valormin = n / 6
    }
    if(n%4L==0L){valormax=n/4}

    if(n%6L!=0L && n%4L!=0L){
        var contador=0
        while(rodas%6L!=0L){
            rodas -= 4
            contador++
            if(rodas<6){
                serto=-1;
                break
            }
        }
        valormin=(rodas/6)+contador
        //
        contador=0
        rodas=n
        while(rodas%4L!=0L){
            rodas-=6
            contador++
            if(rodas<4 && serto==-1){
                println("-1")
                break;
            }
        }
        valormax=(rodas/4)+contador
    }
    if(valormin==0L){
            valormin=valormax
        }
    if(serto!=-1) {
        println("$valormin $valormax")
    }

}

fun main (){
    var y=readInt()
    var x=0;

    while(x!=y){

        var n = readLong()
        code(n)
        x++
    }
}
