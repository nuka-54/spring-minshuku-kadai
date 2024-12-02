package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.house;


public interface HouseRepository extends JpaRepository<house, Integer> {
	public Page<house> findByNameLike(String keyword, Pageable pageable);
	
	public Page<house> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword, String addressKeyword, Pageable pageable);  
    public Page<house> findByNameLikeOrAddressLikeOrderByPriceAsc(String nameKeyword, String addressKeyword, Pageable pageable);  
    public Page<house> findByAddressLikeOrderByCreatedAtDesc(String area, Pageable pageable);
    public Page<house> findByAddressLikeOrderByPriceAsc(String area, Pageable pageable);
    public Page<house> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);
    public Page<house> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable); 
    public Page<house> findAllByOrderByCreatedAtDesc(Pageable pageable);
    public Page<house> findAllByOrderByPriceAsc(Pageable pageable);

    public List<house> findTop10ByOrderByCreatedAtDesc();
}