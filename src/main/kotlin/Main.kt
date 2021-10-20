fun main(args: Array<String>) {
var st1=Student("aymn","ali",2)
var st2=Student("rakan","aaa",10)
var prof1=professor("ali","khalid","055412365","math")
var cours1=cours("math",50,5,prof1.FullPFN(),4)
    println(cours1.IfAssint()).toString()
    println(cours1.PFullName()).toString()
    println(cours1.CoursInformiton()).toString()
}
class cours(var coursName:String,var numOfLac:Int,var student:Int,var professor:String, var numStudent:Int) {
    var Assient = true
    fun IfAssint(){
        if (Assient) {
            println("you can't asssient becose there is a professor")
        }


    }


    fun PFullName(){
        println("professor")
    }

    var coursinfo: Boolean = student >= 5
    fun CoursInformiton(){
        if (coursinfo) {
            println("student can't joined becose it's full")
        } else {
            println("student joined the cours")
        }
        println("$coursName $numOfLac $professor $numStudent")
    }


}
class  professor(var PFN:String,var PLN:String,var Tele:String,var coursess:String){
    fun FullPFN():String{
        return "$PFN $PLN"
    }
}
class Student(FN:String,LN:String,courses:Int){

}
