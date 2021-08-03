fun main() {
    println("Nerd shit")
    val person = nerd()
    println(person.first)
    person.nickName = "Dwomo"
    println(person.nickName)
    person.printInfo()
    person.nickName= "Shades"
    person.nickName = null
    person.printInfo()


}

