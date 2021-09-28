
package p1;

public class Album {
	/**
	 * The Album class is meant to represent the album and its attributes. 
	 * 
	 * This class holds the title, artist, genre, release date, and availability of the album. 
	 * It also holds the  equal method which checks if an album is the same as another album. The  class also 
	 * contains getters and setters to integrate the class with other classes in the project. 
	 * 
	 * @author Rohit Krishnan, Moses Devanesan
	 */
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
	/**
	 * Allows us to use the Album attributes from the Album class
	 * 
	 * 
	 * @return The title of the album
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Sets the title of the album from the input
	 * 
	 * 
	 * 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Allows us to use the Album attributes from the Album class
	 * 
	 * 
	 * @return The artist of the album
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * Sets the artist of the album from the input
	 * 
	 * 
	 * 
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * Allows us to use the Album attributes from the Album class
	 * 
	 * 
	 * @return the genre of the album
	 */
	public Genre getGenre() {
		return genre;
	}
	/**
	 * Sets the genre of the album from the input
	 * 
	 * 
	 * 
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	/**
	 * Allows us to use the Album attributes from the Album class
	 * 
	 * 
	 * @return the release date of the album
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * Sets the release date of the album from the input
	 * 
	 * 
	 * 
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * Allows us to use the Album attributes from the Album class
	 * 
	 * 
	 * @return true if the album is available, false if the album is not available
	 */
	public boolean isAvailable() {
		return isAvailable;
	}
	/**
	 * Sets the availability of the album from the input
	 * 
	 * 
	 * 
	 */
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
	/**
	 * Checks if two albums are the same
	 * 
	 * @param album object
	 * @return true if the albums are equal, false if they are noto
	 */
	public String toString() {
		String availability = "is not available";
		if (isAvailable)
			availability = "is available";
		String albumoutput = title + "::" + artist + "::" + genre.toString() + "::" + releaseDate + "::" + availability ;
		return albumoutput;
	}
}
