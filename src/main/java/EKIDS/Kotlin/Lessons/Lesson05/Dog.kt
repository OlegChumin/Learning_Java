package Kotlin

class Dog {
    var name: String? = null
    var age = 0
    var weight = 0.0
    var color: String? = null
    var voice: String? = null
    var owner: String? = null

    constructor(name: String, age: Int, weight: Double, color: String, voice: String, owner: String) {
        this.name = name
        this.age = age
        this.weight = weight
        this.color = color
        this.voice = voice
        this.owner = owner
    }

    constructor() {}
}

internal class main {
    init {
        val dog1 = Dog("Боня", 3, 3.0, "grey", "loud", "Глеб")
        val dog2 = Dog()

        when (dog1.age) {
            1 -> println("собаке 1 год")
            2 -> println("собаке 2 года")
            3 -> println("собаке 3 года")
            else -> println("Возраст неизвестен")
        }
    }

}