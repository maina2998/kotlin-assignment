fun main() {
    name()

    sentence("Grace",21)

    moon()

    student("Grace")
    student("Edna")

}
fun name() {
    var name ="AkiraChix"
            println(name[0])
    println(name[2])
    println(name[3])


}
fun sentence(name:String,age:Int) {

    var sentence =("Hi,my name is $name,i am $age years old")
    println(sentence)


}
fun moon() {
   var moon = "Jupiter"
    println(moon.length)
}
fun student(name: String) {
    if (name=="Grace") {
        println("that's me!")
    }
    else{
        println("i don't know who it is")
    }

}
