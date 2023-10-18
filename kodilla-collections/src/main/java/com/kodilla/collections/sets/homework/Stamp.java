package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String postageStampName;
    private double postageStampHeight;
    private double postageStampWidth;
    private boolean stamped;

    public Stamp(String postageStampName, double postageStampHeight, double postageStampWidth, boolean stamped) {
        this.postageStampName = postageStampName;
        this.postageStampHeight = postageStampHeight;
        this.postageStampWidth = postageStampWidth;
        this.stamped = stamped;
    }

    public String getPostageStampName() {
        return postageStampName;
    }

    public double getPostageStampHeight() {
        return postageStampHeight;
    }

    public double getPostageStampWidth() {
        return postageStampWidth;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(postageStampHeight, stamp.postageStampHeight) == 0 && Double.compare(postageStampWidth, stamp.postageStampWidth) == 0 && stamped == stamp.stamped && Objects.equals(postageStampName, stamp.postageStampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postageStampName, postageStampHeight, postageStampWidth, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "postageStampName='" + postageStampName + '\'' +
                ", postageStampHeight=" + postageStampHeight +
                ", postageStampWidth=" + postageStampWidth +
                ", stamped=" + stamped +
                '}';
    }
}
