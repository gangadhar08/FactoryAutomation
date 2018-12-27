package com.hcl.factory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.factory.model.TestData;

@Repository
public abstract class TestRepository implements JpaRepository<TestData, Long> {

	
}
