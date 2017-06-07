package com.gemseeker.monitoring.data

import java.awt.Dimension

/**
 *
 */
class DamageInfo {
    enum class Level {
        MINIMAL, MEDIUM, SEVERE, NOT_DEFINED
    }

    var id: Int = -1
    var projectId: Int = -1
    var name: String = ""
    var description: String = ""
    var level: Level = Level.NOT_DEFINED
    var coordinate: Coordinate? = null
    var dimension: Dimension? = null
}
