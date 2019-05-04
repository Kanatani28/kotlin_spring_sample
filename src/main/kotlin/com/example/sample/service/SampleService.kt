package com.example.sample.service

import com.example.sample.mapper.SampleMapper
import com.example.sample.model.SampleModel
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class SampleService(val mapper: SampleMapper) {

    fun find() : List<SampleModel> = mapper.find()

}