package com.example.basic_of_spring_boot

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// @RestControllerでエンドポイントになる
@RestController
class SampleController(val sampleService: SampleService) {
    // @GetMapping()で引数のパスにGETリクエストが送れる
    @GetMapping("/")
    fun getPerson(): ResponseEntity<PersonResponse> {
        val result = sampleService.execute()
        return ResponseEntity(PersonResponse(Person(name = result.person.name, age = result.person.age)), HttpStatus.OK)
    }
}

// @JsonProperty で ResponseEntity クラスに渡したとき、レスポンスが JSON に変換される
data class PersonResponse(
    @JsonProperty("person", required = true)
    val person: Person,
)

data class Person(
    @JsonProperty("name", required = true)
    val name: String,
    @JsonProperty("age", required = true)
    val age: Int,
)