
private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun sol1671A(s:String){
    var letra=""
    var contador = 0
    for(i in s.indices){
        if(letra==""){
            letra=s[i].toString()
            contador++
        } else if(letra==s[i].toString()){
            contador++
        } else {
            if(contador==1){
                println("NO")
                contador=0
                break
            } else if(contador%2==0){

            } else if(contador%2==1){
                if((contador-3)%2==0){

                } else {
                    println("NO")
                    contador=0
                    break
                }
            }
            contador=1
            letra=s[i].toString()
        }

    }
    if(contador!=0){
        if(contador==1){
            println("NO")
        } else if(contador%2==0){
            println("YES")
        } else if(contador%2==1){
            if((contador-3)%2==0){
                println("YES")
            } else {
                println("NO")
            }
        }
    }
}
fun main (){
    var y=readInt()
    var x=0

    while(x!=y){
        sol1671A(readln())
        x++
    }
}