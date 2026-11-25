package com.mont105.iotmobile.net

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PeajeApi {

    @POST("api/vehiculos")
    suspend fun registrarVehiculo(@Body registro: RegistroVehiculo): Vehiculo

    @GET("api/vehiculos/{patente}")
    suspend fun vehiculo(@Path("patente") patente: String): Vehiculo

    @GET("api/pasos")
    suspend fun pasos(): List<Paso>

    @GET("api/pasos/{id}")
    suspend fun paso(@Path("id") id: Int): Paso

    @POST("api/pagos")
    suspend fun pagar(@Body solicitud: SolicitudPago): RespuestaPago
}
