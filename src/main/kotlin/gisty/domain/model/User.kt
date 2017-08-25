package gisty.domain.model

import java.time.LocalDateTime

class User: Entity {
    var id: Int = 0
    lateinit var name: String
    lateinit var email: String

    constructor(id: Int, name: String, email: String) {
        this.id = id
        this.name = name
        this.email = email
        this.updatedDatetime = LocalDateTime.now()
        this.createdDatetime = LocalDateTime.now()
    }

    private constructor(): super() {}
}