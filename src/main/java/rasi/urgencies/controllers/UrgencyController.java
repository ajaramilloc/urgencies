package rasi.urgencies.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rasi.urgencies.models.Urgency;
import rasi.urgencies.repositories.UrgencyRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

@RestController
@RequestMapping("/api/urgencias")
public class UrgencyController {

    @Autowired
    private UrgencyRepository urgenciaRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping
    public Urgency crearUrgencia(@RequestBody Urgency urgencia) {
        return urgenciaRepository.save(urgencia);
    }

    @GetMapping("/documentos")
    public List<String> obtenerTodosLosDocumentos() {
        Query query = new Query();
        query.fields().include("documento").exclude("_id");
        List<Urgency> urgencies = mongoTemplate.find(query, Urgency.class);
        return urgencies.stream().map(Urgency::getDocumento).collect(Collectors.toList());
    }
}
