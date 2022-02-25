import java.io.FileNotFoundException
import java.io.IOException
import scala.util.control.NonFatal
import java.io.FileOutputStream

object Demo {

    def handleFile(): Unit = {
        try {
            val file = new FileOutputStream("./file.txt")
            // val file = new FileOutputStream("/file.dat") // permission denied error
            file.write(Array[Byte](12,13,14,15))
            file.close()
        } catch {
            case e: FileNotFoundException => println(s"Could not open file\t ${e.getMessage}")
            case e: IOException => println(s"Error\t ${e.getMessage}")
            case NonFatal(e) => println(s"Unknown error\t ${e.getMessage}")
        } finally {
            println("Code executed")
        }
    }

    def main(args: Array[String]): Unit = {
        handleFile()
    }
}