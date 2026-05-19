package minimas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import minimas.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}