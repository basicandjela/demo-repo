
class Reminder(val autor: String, var date: String, var message: String){

    fun remindMe() = println("Dear $autor, on $date you should $message!")
}