package ca.gloryq.intervaltimer.classes

class Repeat(inpRepeats: Int) {
    var numRepeats = inpRepeats
    lateinit var timers: List<Timer>
}