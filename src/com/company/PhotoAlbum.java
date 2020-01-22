package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class PhotoAlbum {

    private String nameOfAlbum;
    private ArrayList<Photo> photos;

    public PhotoAlbum() {
    }

    public PhotoAlbum(String nameOfAlbum, ArrayList<Photo> photos) {
        this.nameOfAlbum = nameOfAlbum;
        this.photos = photos;
    }

    public void giveNameToPhotoByIndex(int index, String nameOfPhoto) {
        this.photos.get(index).setNameOfPhoto(nameOfPhoto);
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void printQuantityOfPhotos() {
        System.out.println(photos.size());
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbum that = (PhotoAlbum) o;
        return Objects.equals(nameOfAlbum, that.nameOfAlbum) &&
                Objects.equals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAlbum, photos);
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "nameOfAlbum='" + nameOfAlbum + '\'' +
                ", photos=" + photos +
                '}';
    }
}
