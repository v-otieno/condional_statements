fun main() {
    for (i in 15..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("KotlinCode")
        } else if (i % 3 == 0) {
            println("Kotlin")
        } else if (i % 5 == 0) {
            println("Code")
        } else {
            println(i)
        }
    }
}