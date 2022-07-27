package com.boot.restaurantapi.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.boot.restaurantapi.entities.Turn;

@Repository
public interface TurnRepository extends JpaRepository<Turn, Long> {

	Optional<Turn> findById(Long id);

	Optional<Turn> findByLocator(String locator);

	@Modifying
	@Transactional
	Optional<Turn> deleteByLocator(String locator);

	Optional<Turn> findByTurnAndRestaurantId(String turn, Long restaurantId);

}
