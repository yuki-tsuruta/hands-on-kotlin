package com.example.basic_of_spring_boot

import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import kotlin.test.assertEquals

class SampleControllerTest {
    @Test
    fun `SampleServiceをDIしたテスト`() {
        val sampleService = object : SampleService {
            override fun execute(): ServiceDto = ServiceDto(ServicePerson("Bob", 24))
        }
        val sampleController = SampleController(sampleService)

        val actual = sampleController.getPerson()

        val expected = ResponseEntity(PersonResponse(Person(name = "Bob", age = 24)), HttpStatus.OK)
        assertEquals(actual, expected)
    }
}