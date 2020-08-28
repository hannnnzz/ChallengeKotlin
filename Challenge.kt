import java.util.*
import kotlin.math.ceil

fun main(){

    //Scanner
    val inputUser = Scanner(System.`in`)

    //Identitas
    print("Nama :")
    val nama = inputUser.nextLine()

    print("Kelas :")
    val kelas = inputUser.nextLine()

    print("No.Absen : ")
    val absen = inputUser.nextInt()

    println("============================")

    //Class Bangun
    val balok = Balok()
    val bola = Bola()

    println("1. Balok")
    println("2. Bola")
    print("Silahkan pilih : ")
    when {
        inputUser.nextInt() == 1 -> {

            //Volume Balok
            print("Panjang Balok : ")
            balok.panjang = inputUser.nextFloat()
            print("Lebar Balok : ")
            balok.lebar = inputUser.nextFloat()
            print("Tinggi Balok : ")
            balok.tinggi = inputUser.nextFloat()
            println("Maka Volume Balok Tersebut Adalah : ")
            println("Diketahui : \n Panjang ${balok.panjang} \n Lebar ${balok.lebar} \n Tinggi ${balok.tinggi}")


            //Hasil Volume
            val vBalok = volumeBalok(balok.panjang!!, balok.lebar!!, balok.tinggi!!)
            //Menggunakan string karena untuk menampilkan 2 angka dibelakang
            //Ceil, untuk membulatkan angka lebih tinggi
            val volumeBulatkan = ceil(vBalok)
            println("Jawab : \n Rumus volume balok adalah Panjang * Lebar * Tinggi \n Jadi volume balok adalah "
                    + String.format("%.2f", vBalok )
                    + "\n Dan volume balok setelah dibulatkan $volumeBulatkan")
            println("============================")

        }
        inputUser.nextInt() == 2 -> {

            //Volume Bola
            print("Jari jari Bola : ")
            bola.jariJari = inputUser.nextFloat()
            println("Maka Volume Balok Tersebut Adalah : ")
            println("Diketahui : \n Jari-jari ${bola.jariJari}")

            //hasil volume
            val vBola = volumeBola(bola.jariJari!!)
            //menggunakan string format karena kita akan menampilkan 2 angka dibelakang koma
            //ceil ---> untuk membulatkan lebih tinggi dari angka sebelumya
            val volumeBulatkan = ceil(vBola)
            println("Jawab : \n Rumus volume bola adalah ( (4/3) * (22/7) * r * r * r )\n Jadi volume bola adalah "
                    + String.format("%.2f", vBola )
                    + "\n Dan volume bola setelah dibulatkan $volumeBulatkan")
            println("============================")

        }
        else -> {
            println("Mohon maaf yang anda pilih saat ini belum tersedia!!")
            println("============================")
        }
    }

}

fun volumeBalok(p : Float, l : Float, t : Float) : Float{
    return (p * l * t )
}
fun volumeBola(r : Float) : Double {
    return (Math.PI * 4/3 * r * r * r)
}
class Balok {

    var panjang : Float? = null
    var lebar : Float? = null
    var tinggi : Float? = null

}
class Bola {

    var jariJari : Float? = null

}