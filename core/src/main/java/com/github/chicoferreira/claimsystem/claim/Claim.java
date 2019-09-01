package com.github.chicoferreira.claimsystem.claim;

import com.github.chicoferreira.claimsystem.user.User;
import com.github.chicoferreira.claimsystem.util.ChunkCoordinate;

public class Claim {

    private User owner;
    private ChunkCoordinate chunkCoordinate;

    public Claim(User owner, ChunkCoordinate chunkCoordinate) {
        this.owner = owner;
        this.chunkCoordinate = chunkCoordinate;
    }

    public User getOwner() {
        return owner;
    }

    public ChunkCoordinate getChunkCoordinate() {
        return chunkCoordinate;
    }
}
