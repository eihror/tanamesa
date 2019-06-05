package com.eihror.tanamesa.model

data class User(
    var id : Int? = null,
    var name : String? = null
) {
    override fun toString(): String {
        return this.name.toString()
    }
}