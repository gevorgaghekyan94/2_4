package com.company;

import java.util.Objects;

public class Photo {

    private String nameOfPhoto;
    private int size;

    public Photo() {
    }

    public Photo(String name, int size) {
        this.nameOfPhoto = name;
        this.size = size;
    }

    public String getNameOfPhoto() {
        return nameOfPhoto;
    }

    public void setNameOfPhoto(String name) {
        this.nameOfPhoto = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return size == photo.size &&
                Objects.equals(nameOfPhoto, photo.nameOfPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPhoto, size);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + nameOfPhoto + '\'' +
                ", size=" + size +
                '}';
    }
}
