package ridesync.map

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform