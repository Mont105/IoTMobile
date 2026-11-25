package com.mont105.iotmobile.net

import kotlinx.serialization.Serializable

@Serializable
data class Vehiculo(
    val patente: String,
    val propietario: String = "",
    val deuda: Int = 0,
)

@Serializable
data class Paso(
    val id: Int,
    val patente: String,
    val fecha: String,
    val precio: Int,
    val pagado: Boolean,
)

@Serializable
data class RegistroVehiculo(
    val patente: String,
    val propietario: String = "",
)

@Serializable
data class SolicitudPago(val patente: String)

@Serializable
data class RespuestaPago(
    val patente: String,
    // El servidor llama "pagado" al monto cobrado (CLP), no a un booleano como en Paso.
    val pagado: Int,
)
