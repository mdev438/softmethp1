
package p1;

public class Album {
	private String title;
	private String artist;
	private Genre genre; // enum class; Classical, Country, Jazz, Pop, Unknown
	private Date releaseDate;
	private boolean isAvailable;
	
	public Album(String title, String artist, Genre genre, Date releaseDate, boolean isAvailable) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.isAvailable = isAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean equals(Object obj) {
		Album album = (Album) obj;

		if (title.equals(album.title) && artist.equals(album.artist)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String availability = "is not available";
		if (isAvailable)
			availability = "is available";
		String albumoutput = title + "::" + artist + "::" + genre.toString() + "::" + releaseDate + "::" + availability ;
		return albumoutput;
	}
}
