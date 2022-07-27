package com.boot.restaurantapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.restaurantapi.entities.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

	Optional<Restaurant> findById(Long id);

	Optional<Restaurant> findByNamed(String name);

	@Query("SELECT REST FROM Restaurant REST")
	public List<Restaurant> findRestaurants();


}
