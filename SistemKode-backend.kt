fun main() {
    print("Masukkan jumlah jam kerja dalam seminggu: ")
    val jamKerja = readLine()?.toInt() ?: 0

    print("Masukkan tarif per jam: ")
    val tarifPerJam = readLine()?.toIntOrNull() ?: 0

    val gaji = hitungGaji(jamKerja, tarifPerJam)

    println("Gaji karyawan untuk $jamKerja jam kerja dalam seminggu adalah: Rp $gaji")
}

fun hitungGaji(jamKerja: Int, tarifPerJam: Int): Int {
    val jamNormal = 40
    val tarifLembur = (tarifPerJam * 1.5).toInt()

    return if (jamKerja > jamNormal) {
        val jamLembur = jamKerja - jamNormal
        (jamNormal * tarifPerJam) + (jamLembur * tarifLembur)
    } else {
        jamKerja * tarifPerJam
    }
}