package rasi.urgencies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rasi.urgencies.models.Urgency;

@Repository
public interface UrgencyRepository extends MongoRepository<Urgency, String> {
    // Métodos personalizados si es necesario
}
