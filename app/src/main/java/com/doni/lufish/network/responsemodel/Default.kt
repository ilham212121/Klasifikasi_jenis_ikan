package com.doni.lufish.network.responsemodel

import com.google.gson.annotations.SerializedName

data class Default (
    @SerializedName("Nama_Ikan")
    var nm_ikn:String?,
    @SerializedName("Jenis_ikan")
    var jns_ikn:String?,
    @SerializedName("Makanan")
    var makan:String?,
    @SerializedName("Status")
    var status:String?


)