package mx.itson.cheemstour.entities

import android.content.Context

class Trip {
    var id : Int? = null
    var name : String? = null
    var city : String? = null
    var country : String? = null

    constructor()

    constructor(id: Int?, name: String?, city: String?, country: String?) {
        this.id = id
        this.name = name
        this.city = city
        this.country = country
    }

}