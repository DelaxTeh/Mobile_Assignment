package com.assignmentv1.assignment.Entity

//order class
class Order(
    private var orderDate: String?,
    private var orderTime: String?,
    private var orderStatus: String?,
    private var orderTotal: Double,
    private var orderType: String?,
    private var orderAddress: String?
) {
    private var id: Int = 0

}