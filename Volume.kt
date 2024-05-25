import java.nio.DoubleBuffer

class Volume {
    val Sphere = {radius:Double->(4.0/3.0) * Math.PI * Math.pow(radius,3.0) }
    val Pyramid = {length:Double, width:Double, height:Double->((length*width*height)/3) }
    val Rectangle = {length:Double, width:Double, height:Double->(length*width*height) }
    val Cube = {length:Double-> Math.pow(length,3.0)}
}
fun main() {
    val volume = Volume()
    print("Enter Shape to get Volume(Sphere, Pyramid, Rectangle, or Cube): ")
    val shape = readln()
    when(shape){
        "Sphere"-> {
            print("Enter Radius of Sphere: ")
            var radius = readln().toDouble()
            print("The Volume of the Sphere is: ${volume.Sphere(radius)}")
        }
        "Pyramid"-> {
            print("Enter length: ")
            var length = readln().toDouble()

            print("Enter width: ")
            var width = readln().toDouble()

            print("Enter height: ")
            var height = readln().toDouble()
            print("The Volume of Pyramid: ${volume.Pyramid(length,width,height)}")
        }
        "Rectangle"-> {
            print("Enter length: ")
            var length = readln().toDouble()
            print("Enter width: ")
            var width = readln().toDouble()
            print("Enter height: ")
            var height = readln().toDouble()
            print("The Volume of Rectangle: ${volume.Rectangle(length,width,height)}")
        }
        "Cube"-> {
            print("Enter Length of Cube: ")
            var length = readln().toDouble()
            print("The Volume of the Cube is: ${volume.Cube(length)}")
        }
        else->print("Error try again.")
    }
}


