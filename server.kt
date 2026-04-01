fun login(username: String, password: String): Boolean {
    return username == "admin" && password == "1234"
}

fun fetchServerStatus(): String {
    return "ONLINE"
}