package com.compose.fakultascompose

import com.compose.fakultascompose.ui.theme.*


object DataFakultas {
    private val fakultasNames = arrayOf(
            "FAKULTAS ARSITEKTUR DAN DESAIN",
            "FAKULTAS EKONOMI",
            "FAKULTAS BISNIS",
            "FAKULTAS ILMU KOMPUTER",
            "FAKULTAS PERTANIAN",
            "FAKULTAS HUKUM",
            "FAKULTAS ILMU SOSIAL DAN ILMU POLITIK",
            "FAKULTAS TEKNIK",
            "FAKULTAS SAINS",
            "FAKULTAS KEDOKTERAN"
    )

    private val fakultasEmail = arrayOf(
            "fad@upnjatim.ac.id",
            "fe@upnjatim.ac.id",
            "fb@upnjatim.ac.id",
            "fik@upnjatim.ac.id",
            "faperta@upnjatim.ac.id",
            "fhukum@upnjatim.ac.id",
            "fisip@upnjatim.ac.id",
            "ft@upnjatim.ac.id",
            "fs@upnjatim.ac.id",
            "fk@upnjatim.ac.id"
    )

    private val fakultasDetails = arrayOf(
            "Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Desain Komunikasi dan Visual \n 2. Arsitektur",
            "Fakultas Ekonomi merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Ekonomi Akutansi \n 3. Ekonomi Pembangunan \n 4. Magister Akutansi",
            "Fakultas Bisnis merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Ekonomi Manajemen \n 2. Magister Manajemen",
            "Fakultas Ilmu Komputer merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Sistem Informasi \n 2. Informatika \n 3. Sains Data",
            "Fakultas Pertanian merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Agribisnis \n 2. Agroteknologi \n 3. Magister Agribisnis \n 4. Magister Agroteknologi",
            "Fakultas Hukum merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Hukum",
            "Fakultas Ilmu Sosial dan Politik merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Administrasi Negara \n 2. Administrasi Bisnis \n 3. Hubungan Internasional \n 4. Ilmu Komunikasi \n 5. Pariwisata",
            "Fakultas Teknik merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Teknik Industri \n 2. Teknik Kimia \n 3. Teknik Lingkungan \n 4. Teknik Sipil \n 5. Teknologi Pangan",
            "Fakultas Sains merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Sains Fisika \n 2. Sains Biologi \n 3. Sains Kimia",
            "Fakultas Kedokteran merupakan salah satu dari 10 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Kedokteran Hewan \n 2. Kesehatan Masyarakat \n 3. Kedokteran Gigi",
    )

    private val fakultasColor = arrayOf(
        Violet,
        Grey,
        Brown,
        Orange,
        Green,
        Red,
        Yellow,
        Blue,
        Teal200,
        Purple700
    )

    private val fakultasImages = intArrayOf(
        R.drawable.fad,
        R.drawable.feb,
        R.drawable.fb,
        R.drawable.fik,
        R.drawable.faperta,
        R.drawable.hukum,
        R.drawable.fisip,
        R.drawable.ft,
        R.drawable.fs,
        R.drawable.fk
    )

        val listFakultas: ArrayList<fakultas>
            get() {
                val list = arrayListOf<fakultas>()
                for (position in fakultasNames.indices) {
                    val fakultas = fakultas(
                            fakultasNames[position],
                            fakultasDetails[position],
                            fakultasImages[position],
                            fakultasEmail[position],
                            fakultasColor[position]
                    )
                    list.add(fakultas)
                }
                return list
            }

}