package div2A




fun sol339A(s:String){
    var x =s.replace('+',' ')
    var lista = x.split(" ").map{it.toInt()}
    lista= lista.sorted()
    var str =""
    for(i in lista.indices){
        if(i==lista.size-1){
            str+=lista[i].toString()
            break
        }
        str+=lista[i].toString()+"+"
    }
    println(str)
}

fun main(){
    var x= readln()
    sol339A(x)
}