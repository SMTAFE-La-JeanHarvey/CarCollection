import model.Car
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream


fun main() {
    var carArray: ArrayList<Car> = arrayListOf(
//        Car("Suzuki", "swift", "2013", 225000),
//        Car("Toyota", "Camry", "1975", 125000),
//        Car("Honda", "Civic", "2024", 90000)
    )


    while(true){
        menuOptions()

        var userInput = readln().lowercase()
        println("")
        when(userInput) {
            "d" -> for (item in carArray) {
                item.display()
            }
            "r" -> carArray.sortBy{it.make}
            "f" -> {
                println("What car make would you like to search for?: ")
                userInput = readln()
                println("")
                // first or null makes the result
                val result = carArray.find { it.make== userInput }
                result?.display()
            }
            "s" -> {
                val fos = FileOutputStream("cars.dat")
                val oos = ObjectOutputStream(fos)
                oos.writeObject(carArray)
                oos.close()
                fos.close()
            }
            "w" -> {
                val fis = FileInputStream("cars.dat")
                val oos = ObjectInputStream(fis)

                carArray = oos.readObject() as ArrayList<Car>
                oos.close()
                fis.close()

            }
            "q" -> break
        }
    }
}

fun menuOptions() {
    println("Press 'd' to display the list of cars.")
    println("Press 'r' to sort the cars by its make.")
    println("Press 'f' to find a car by its make.")
    println("Press 's' to save the list of cars.")
    println("Press 'w' to load a list of cars.")
    println("Press 'q' to quit.")
    println("")
}

