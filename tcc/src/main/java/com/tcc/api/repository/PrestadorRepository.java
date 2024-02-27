package com.tcc.api.repository;

import com.tcc.api.model.PrestadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<PrestadorModel, Long> {
}
