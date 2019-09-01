package com.github.chicoferreira.claimsystem.claim;

import com.github.chicoferreira.claimsystem.util.ChunkCoordinate;

import java.util.concurrent.CompletableFuture;

public interface ClaimStorage {

    CompletableFuture<Claim> get(ChunkCoordinate chunkCoordinate);

    void create(Claim claim);

}
