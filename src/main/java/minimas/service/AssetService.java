package minimas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import minimas.entity.Asset;
import minimas.repository.AssetRepository;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset updateAssetStatus(Long id, String status) {

    Asset asset = assetRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Asset not found"));

    asset.setStatus(status);

    return assetRepository.save(asset);
    }  
}