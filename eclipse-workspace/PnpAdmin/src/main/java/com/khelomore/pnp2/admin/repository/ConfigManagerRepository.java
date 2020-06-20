package com.khelomore.pnp2.admin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khelomore.pnp2.admin.model.ConfigurationManager;

@Repository
public interface ConfigManagerRepository extends JpaRepository<ConfigurationManager, Integer> {
	List<ConfigurationManager> findByGroup(String group);

}
