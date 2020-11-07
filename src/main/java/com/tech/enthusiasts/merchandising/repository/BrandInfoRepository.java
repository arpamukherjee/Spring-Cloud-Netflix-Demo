package com.tech.enthusiasts.merchandising.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.enthusiasts.merchandising.entity.BrandInfoEntity;

@Repository
public interface BrandInfoRepository extends JpaRepository<BrandInfoEntity, Long>{

}
