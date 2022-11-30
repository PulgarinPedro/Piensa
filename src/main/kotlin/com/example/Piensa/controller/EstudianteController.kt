package com.example.evaluacion.controller

import com.example.Piensa.model.Estudiante
import com.example.evaluacion.model.Estudiante
import com.example.evaluacion.service.EstudianteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/estudiante")
class EstudianteController {

    @Autowired
    lateinit var estudianteService: EstudianteService

    @GetMapping
    fun list():List<Estudiante>{
        return estudianteService.list()
    }

    @PostMapping
    fun save(@RequestBody @Validated estudiante: Estudiante):Estudiante{
        return estudianteService.save(estudiante)
    }

    @PutMapping
    fun update (@RequestBody estudiante: Estudiante): ResponseEntity<Estudiante>{
        return ResponseEntity(asistenteService.update(asistente),HttpStatus.OK )
    }

    @PatchMapping
    fun updateName (@RequestBody asistente:Asistente):ResponseEntity<Asistente>{
        return ResponseEntity(asistenteService.updateName(asistente), HttpStatus.OK)
    }

}