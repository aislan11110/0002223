package div2A

private fun readInt() = readln().toInt()

fun sol4A(x:Int){
    var primeirametade= 2
    var segundametade= x-primeirametade
    if(segundametade>0 && segundametade%2==0){
        println("YES")
    } else {
        println("NO")
    }
}

fun main (){
    var num = readInt()
    sol4A(num)
}