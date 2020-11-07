package com.tech.enthusiasts.merchandising.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.enthusiasts.merchandising.entity.BrandInfoEntity;
import com.tech.enthusiasts.merchandising.repository.BrandInfoRepository;
import com.tech.enthusiasts.merchandising.response.BrandInfoResponse;

@Service
public class BrandInfoService {
	
	@Autowired
	private BrandInfoRepository brandInfoRepository;
	
	public BrandInfoResponse findBrandDetailsById(final Long brandId) {
		final BrandInfoResponse brandInfoResponse = new BrandInfoResponse();
		Optional<BrandInfoEntity> entity =brandInfoRepository.findById(brandId);
		entity.ifPresent(brandInfo -> BeanUtils.copyProperties(brandInfo, brandInfoResponse));
		return brandInfoResponse;
	}
	
	public void addDummyData(final List<BrandInfoEntity> entities) {
		brandInfoRepository.saveAll(entities);
	}

}
