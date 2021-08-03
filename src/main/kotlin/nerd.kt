class nerd(val first: String = "Peter", val last: String ="Parker") {
    var nickName: String? = null
        set(value){
            field = value
            println("The new nick name is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }
    fun printInfo(){
        val nickNameToPrint = if (nickName != null) nickName else "No Nickname"
        println("$first ($nickNameToPrint) $last ")
    }
}