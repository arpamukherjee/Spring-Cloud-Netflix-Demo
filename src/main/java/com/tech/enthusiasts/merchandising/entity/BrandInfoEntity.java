package com.tech.enthusiasts.merchandising.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BrandInfoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "brand_id")
	private Long brandId;
	
	@Column(name = "description")
	private String brandDescription;
	
	@Column(name = "country_of_origin")
	private String countryOfOrigin;
}
