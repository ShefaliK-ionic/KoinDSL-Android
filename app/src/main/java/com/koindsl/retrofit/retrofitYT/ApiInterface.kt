package com.koindsl.retrofit.retrofitYT

import retrofit2.http.GET

interface ApiInterface {

    companion object  {

        const val BASE_URL="https://jsonplaceholder.typicode.com/"
    }

    @GET("posts")
    suspend fun getPost():List<PostRes>
}