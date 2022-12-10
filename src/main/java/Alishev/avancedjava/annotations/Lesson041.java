package Alishev.avancedjava.annotations;

@OlegAnnotation()
public class Lesson041 {
    // в аннотациях методы являются их полями можно ставить значения default по умолчанию

    // есть аннотации, аннотирующие ваши аннотации

//    @Target
public static void main(String[] args) {

}
@MethodInfo(author = "Oleg", dateOfCreation = 2021, purpose = "Print Hello World!")
public void printHelloWorld() {

}
@MethodInfo(purpose = "Print Hello World") // как с параметрами метода
public void printIfo() {

}
}
