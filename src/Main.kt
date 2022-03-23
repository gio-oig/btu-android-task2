
fun main() {
    var fact = FactoryProvider();
//    val p1 = Point(5, 5);
//    val p2 = Point(1, 2);
//    println(p1 == p2);
}

data class Point(var x:Int, var y: Int) {
    fun movePoints() {
        this.x = this.x * -1
        this.y = this.y * -1
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point) {
            return this.x == other.x && this.y == other.y
        }
        return false
    }

    override fun toString(): String {
        return "x: " + this.x.toString() + "  y: " + this.y.toString() ;
    }
}