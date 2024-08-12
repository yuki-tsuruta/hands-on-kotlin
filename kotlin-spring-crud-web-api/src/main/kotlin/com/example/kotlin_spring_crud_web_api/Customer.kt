package com.example.kotlin_spring_crud_web_api

/**
 * Web API で利用するデータモデル
 *
 * @property id カスタマーID
 * @property firstName 名前
 * @property lastName 名字
 */
data class Customer(
    val id: Long,
    val firstName: String,
    val lastName: String,
)