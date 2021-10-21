    fun main(args: Array<String>) {
var st1=Student("aymn","ali",2)
var st2=Student("rakan","aaa",10)
var st3 =Student("khalid","aymn",5)
var st6 =Student("dafer","halo",6)
var st4=Student("x","c",5)
var st5=Student("tt","joa",56)
var prof1=professor("ali","khalid","055412365","math")
var prof2=professor("aymnAli","kedri","0112546","pa")
var prof3=professor("khlead","al-qhtane","0112547","pc")
var cours1=cours("math",50,5,40)
var cours2=cours("pa",10,100,150)
var cours3=cours("pc",15,149,150)
        cours1.professor=prof1.FullPFN()
        println(cours1.IfAssint()).toString()
        println(cours1.CoursInformiton()).toString()
        println("-----------------------------------------------------")
        cours2.professor=prof2.FullPFN()
        println(cours2.IfAssint()).toString()
        println(cours2.CoursInformiton()).toString()
        println("-----------------------------------------------------")
        cours3.professor=prof3.FullPFN()
        println(cours3.IfAssint()).toString()
        println(cours3.CoursInformiton()).toString()
    }
    class  professor(var PFN:String,var PLN:String,var Tele:String,var coursess:String){
        fun FullPFN():String{
            return "$PFN $PLN"
        }
    }
    class Student(FN:String,LN:String,courses:Int){

    }

    class cours(var coursName:String,var numOfLac:Int,var student:Int, var numStudent:Int) {
        var professor:String=""
        var Assient:Boolean = professor==""
        fun IfAssint():String{
            if (Assient) {
                println("you can't asssient becose there is a professor")
            }else{
                println("joiend")}

        return (professor)
        }
        var coursinfo: Boolean = student >= numStudent
        fun CoursInformiton():String{
            if (coursinfo) {
                println("student can't joined becose it's full")
            } else {
                println("student joined the cours")
            }
        return ("name of class is $coursName has number of lacter $numOfLac name of proessor is $professor number of student in the class $student of $numStudent")
        }


    }

