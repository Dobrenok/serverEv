package com.dobrenok.config.repository;

import com.dobrenok.config.ent.EvengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EvengerEntityR extends JpaRepository<EvengerEntity,Long> {
}
