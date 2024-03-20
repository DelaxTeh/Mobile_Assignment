package com.assignmentv1.assignment.Entity

class Address(
    private var _addressLine1: String,
    private var _addressLine2: String,
    private var _city: String,
    private var _state: String,
    private var _posCode: String
) {

    var addressLine1: String
        get() = _addressLine1
        set(value) {
            _addressLine1 = value
        }

    var addressLine2: String
        get() = _addressLine2
        set(value) {
            _addressLine2 = value
        }

    var city: String
        get() = _city
        set(value) {
            _city = value
        }

    var state: String
        get() = _state
        set(value) {
            _state = value
        }

    var posCode: String
        get() = _posCode
        set(value) {
            _posCode = value
        }


    val addressID: Int
        get() = generateAddressID()
    companion object {
        private var addressCount = 0

        private fun generateAddressID(): Int {
            addressCount++
            return addressCount
        }
    }

    init {
        // Initialize product ID when a new product is created
        addressID
    }

}
