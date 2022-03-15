package ca.gloryq.intervaltimer.classes

class Timer(inpName: String, inpHours: Int, inpMinutes: Int, inpSeconds: Int) {
    var hours: Int = inpHours
    var minutes = inpMinutes
    var seconds: Int = inpSeconds
    var inpName: String = inpName

    override fun toString(): String {
        return "$hours:$minutes:$seconds"
    }
}