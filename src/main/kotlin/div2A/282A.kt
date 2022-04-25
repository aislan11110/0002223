package div2A

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun sol282A(s:String):Int{
    for(i in 0 until s.length-1){
        if(s[i]=='+' && s[i+1]=='+'){
            return 1
        } else if(s[i]=='-' && s[i+1]=='-'){
            return -1
        }
    }
    return 0
}

fun main(){
    var y= readInt()
    var x=0
    var resultado = 0
    while(x!=y){
        resultado+= sol282A(readln())
        x++
    }
    println(resultado)
}