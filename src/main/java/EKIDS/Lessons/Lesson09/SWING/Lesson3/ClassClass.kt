package Java.Lessons.Lesson09.SWING.Lesson3

import EKIDS.Lessons.Lesson09.SWING.Lesson3.Movable
import EKIDS.Lessons.Lesson09.SWING.Lesson3.Rotate

class ClassClass : Movable, Rotate {
    override fun move() {
        println("Машина может ехать")
    }

    override fun rotate() {
        TODO("Not yet implemented")
    }

    val object1 = Object() // public final PI = 3,14
    var object2 = Object()

    fun main()  {
//        object1 = object2
        object2 = object1
    }


}

