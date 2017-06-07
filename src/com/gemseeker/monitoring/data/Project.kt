package com.gemseeker.monitoring.data

import javafx.beans.property.SimpleObjectProperty
import java.util.*

/**
 *
 */
abstract class Project {

    enum class State {
        CREATED, APPROVED, QUOTED, ON_GOING, POSTPONED, TERMINATED, FINISHED
    }

    enum class Type {
        IRRIGATION, FACILITY, ROAD, EQUIPMENT, NOT_SET
    }

    // Project Properties
    val stateProperty = SimpleObjectProperty<State>()
    var id: Int = -1
    var type: Type = Type.NOT_SET
    var name: String = ""
    var location: Location? = null
    var cost: Double = 0.0
    var proponent: String = ""
    var quoted: Date? = null
    var started: Date? = null
    var completion: Date? = null
    var condition: Int = 0 // value ranges from 0 to 100
}