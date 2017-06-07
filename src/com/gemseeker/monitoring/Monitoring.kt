package com.gemseeker.monitoring

import com.gem.seek.SeekApplication
import javafx.application.Application
import javafx.stage.Stage

/**
 * Starting point of the application.
 */
class Monitoring: Application() {

    override fun start(primaryStage: Stage?) {
        val app = SeekApplication(primaryStage!!)
        app.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Monitoring::class.java)
        }
    }
}