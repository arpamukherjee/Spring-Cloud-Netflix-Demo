package com.tech.enthusiasts.merchandising.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.enthusiasts.merchandising.response.BrandInfoResponse;
import com.tech.enthusiasts.merchandising.service.BrandInfoService;

@RestController
@RequestMapping("/brand")
public class BrandInfoController {
	
	@Autowired
	private BrandInfoService brandInfoService;
	
	@GetMapping("/{brandId}")
	public ResponseEntity<BrandInfoResponse> findBrandDetails(@PathVariable final Long brandId){
		final BrandInfoResponse response = brandInfoService.findBrandDetailsById(brandId);
		return ResponseEntity.ok(response);
	}
}
