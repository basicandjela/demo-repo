
class Reminder(val autor: String, var date: String, var message: String){

    fun remindMe() :Unit{
        println("Dear $autor, on $date you should $message!")
    }
}