package com.github.chicoferreira.claimsystem.claim.impl;

import com.github.chicoferreira.claimsystem.claim.Claim;
import com.github.chicoferreira.claimsystem.claim.ClaimStorage;
import com.github.chicoferreira.claimsystem.util.ChunkCoordinate;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;

public class ClaimStorageImpl implements ClaimStorage {

    private Map<ChunkCoordinate, Claim> map;

    public ClaimStorageImpl() {
        this.map = new TreeMap<>();
    }

    @Override
    public CompletableFuture<Claim> get(ChunkCoordinate chunkCoordinate) {
        assert chunkCoordinate != null : "Chunk coordinate cannot be null";

        return CompletableFuture.supplyAsync(() -> map.get(chunkCoordinate));
    }

    @Override
    public void create(Claim claim) {
        this.map.put(claim.getChunkCoordinate(), claim);
    }

}
