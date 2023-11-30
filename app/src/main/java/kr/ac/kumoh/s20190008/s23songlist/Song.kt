package kr.ac.kumoh.s20190008.s23songlist

data class Song(
    val id: Int,
    val title: String,
    val singer: String,
    val rating: Int,
    val lyrics: String?
)
