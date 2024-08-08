package com.example.basic_of_spring_boot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleServiceTest {
    @Test
    fun `SampleRepositoryをDIしたテスト`() {
        val sampleRepository = object : SampleRepository {
            override fun getPersonFromDb(): PersonFromDb = PersonFromDb("Carol", 24)
        }
        val sampleService = SampleServiceImpl(sampleRepository)

        val actual = sampleService.execute()
        val expected = ServiceDto(ServicePerson("Carol", 24))
        assertEquals(actual, expected)
    }
}