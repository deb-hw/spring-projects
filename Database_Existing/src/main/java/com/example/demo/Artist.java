package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// creating to match one of our database tables
// @Entity defines as a database related object (javax.persistence.Entity)
@Entity
// define the table that holds this object javax.persistence.Table
@Table(name="albums")
public class Artist {
	
	@Id
	@Column(name="AlbumId")
	// Integer has to be initial caps when it's a database key (any type of relational key).
	private Integer albumId;
	@Column(name="Title")
	private String title;
	@Column(name="ArtistId")
	private Integer artistId;
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getArtistId() {
		return artistId;
	}
	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

}
