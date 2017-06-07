package com.gemseeker.monitoring.data

/**
 * A soft copy or scanned copy of the document (word, excel etc.) for a
 * specific project.
 */
class Document {
    var id: Int = -1
    var projectId: Int = -1
    var name: String = ""
    var location: String = "" // path on the computer
    var num: Int = 0 // sequence number
}