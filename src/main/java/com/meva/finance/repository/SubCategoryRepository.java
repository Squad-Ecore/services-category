package com.meva.finance.repository;

import com.meva.finance.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

    @Query("SELECT sub FROM SubCategory sub WHERE LOWER(sub.description) = LOWER(:description)")
    Optional<SubCategory> findByDescription(String description);
}
