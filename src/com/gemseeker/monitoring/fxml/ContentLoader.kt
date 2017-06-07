package com.gemseeker.monitoring.fxml

import javafx.fxml.FXMLLoader


class ContentLoader {

    fun loadContent(source: String): FXMLLoader {
        val loader = FXMLLoader()
        loader.location = javaClass.getResource(source)
        loader.load<Any>()
        return loader
    }
}
