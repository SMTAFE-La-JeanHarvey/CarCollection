import model.Car

fun main() {
    var carArray: ArrayList<Car> = arrayListOf(
        Car("Suzuki", "swift", "2013", 225000),
        Car("Toyota", "Camry", "1975", 125000),
        Car("Honda", "Civic", "2024", 90000)
    )

    while(true){
        menuOptions()
        var userinput = readln()
        userinput = readln().lowercase()
        println("")
//        when(userinput != "q" || userinput != "quit" ) {
//
//        }
    }
//    for (car in carArray) {
//        car.display()
//    }
}

fun menuOptions() {
    println("Press 'p' to print the list of cars.")
}

