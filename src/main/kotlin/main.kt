fun main(){
    vowelCheck("today is christmas")
}
fun vowelCheck(sit: String): String{
    val rep = StringBuilder()
    for (i in sit){
        if (i != 'A' && i != 'a'
            && i != 'E' && i != 'e'
            && i != 'I' && i != 'i'
            && i != 'O' && i != 'o'
            && i != 'U' && i!= 'u'){
            rep.append(i)
        }
    }
    return rep.toString()
}
