package com.example.demo.repository;
import com.example.demo.model.demoModel;
import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.UUID;

public interface demoDao extends CassandraRepository<demoModel, UUID>{
}
