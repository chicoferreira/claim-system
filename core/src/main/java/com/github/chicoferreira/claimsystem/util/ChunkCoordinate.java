package com.github.chicoferreira.claimsystem.util;

import java.util.Objects;

public class ChunkCoordinate implements Comparable<ChunkCoordinate> {

    private int x, z;

    private ChunkCoordinate(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public static ChunkCoordinate of(int x, int z) {
        return new ChunkCoordinate(x, z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public int compareTo(ChunkCoordinate chunkCoordinate) {
        int xComparison = Integer.compare(this.getX(), chunkCoordinate.getX());
        int zComparison = Integer.compare(this.getZ(), chunkCoordinate.getZ());

        return xComparison != 0 ? xComparison : zComparison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChunkCoordinate that = (ChunkCoordinate) o;
        return x == that.x && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, z);
    }
}
