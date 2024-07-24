package com.example.storage_service_dbms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepo extends JpaRepository<ImageData, Long> {

  Optional<ImageData> findByName(String filename);

}
