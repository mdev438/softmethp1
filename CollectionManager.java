package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CollectionManager {
	/**
	 * The CollectionManager class is used to run methods in the Album, Collection, and Date class. 
	 * 
	 * Holds the run method  which takes in user input constantly. Depending on the input, 
	 * it accesses methods from the aforementioned classes to follow the user command
	 * 
	 * @author Rohit Krishnan, Moses Devanesan
	 */
	Scanner userin = new Scanner(System.in);
	String[] user_input = new String[5];
	String command = null;
	
	String request,title, artist, rdate;
	String string_genre = "null";
	
	Album album = null;
	Collection albumList = new Collection();
	Date release = new Date();
	int z = 0;
	
	public boolean albumExists(Album album) {
		if (albumList.length() == 0) {
			return false;
		}
		
		
		for (int i = 0; i < albumList.length(); i++) {
			if (albumList.getAlbums()[i] != null) {
				if (albumList.getAlbums()[i].equals(album)) {
					return true;
				}
			}
		}
	
		
		return false;
	}
	/**
	 * Finds the album from the albums array
	 * 
	 * @parameters title and artist
	 * @return the index of the album, null if there is no album
	 */
	public Album findAlbum(String title, String artist) {
		for (int i = 0; i < albumList.getAlbums().length; i++) {
			if (albumList.getAlbums()[i] != null) {
				if (albumList.getAlbums()[i].getTitle().equals(title) && albumList.getAlbums()[i].getArtist().equals(artist)) {
					return albumList.getAlbums()[i];
				}
			}
			
		}
		return null;
	}
	/**
	 * Constantly runs and takes commands from the user
	 * 
	 * 
	 * 
	 */
	public void run() {
		System.out.println("Collection Manager starts running.");
		while (0 < 1) {
			String cmd = userin.nextLine();
			user_input = cmd.split(",");
			command = user_input[0];
			
			switch (command) {
				case "A":
					title = user_input[1];
					artist = user_input[2];
					string_genre = user_input[3];
					rdate = user_input[4];
					Date date = new Date(rdate);
					
					album = new Album(title, artist, null, date, true);
					
					// handle Genre
					if (string_genre.toLowerCase().equals("classical"))
						album.setGenre(Genre.Classical);
					else if (string_genre.toLowerCase().equals("country"))
						album.setGenre(Genre.Country);
					else if (string_genre.toLowerCase().equals("pop"))
						album.setGenre(Genre.Pop);
					else if (string_genre.toLowerCase().equals("jazz"))
						album.setGenre(Genre.Jazz);
					else album.setGenre(Genre.Unknown);
					if (date.isValid()) {
					if (!albumExists(album)) {
						albumList.add(album);						
						System.out.println(album + " >> added.");
					} else {
						System.out.println(album + " >> is already in the collection.");
					}
					}
					
					break;
				case "D":
					title = user_input[1];
					artist = user_input[2];
					
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					} else {
						album = new Album(title, artist, null, null, true);
						System.out.println(album.getTitle() +"::"+album.getArtist() + " >> deleted.");
						albumList.remove(album);
					}
				
					break;
				case "L":
					title = user_input[1];
					artist = user_input[2];
					
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					}
					
					album = new Album(title, artist, null, null, true);
					Album inlibrary = findAlbum(title,artist);
					if (inlibrary==null)
						System.out.println(title +"::"+artist + " >> is not in the collection");
					else if (inlibrary.isAvailable()) {
						System.out.println(title +"::"+artist + ":: is available.");
						inlibrary.setAvailable(false);
					} else {
						System.out.println(title +"::"+artist + ":: is not available."); // TODO
					}
					
					
					break;
				case "PD":
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					}
					
					albumList.printByReleaseDate();
					break;
				case "PG":
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					}
					
					albumList.printByGenre();
					break;
				case "P":
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					}
					
					albumList.print();
					break;
				case "R":
					if (albumList.isEmpty()) {
						System.out.println("Invalid command."); // TODO
						break;
					}
					
					title = user_input[1];
					artist = user_input[2];
					
					Album inlibrary2 = findAlbum(title,artist);
					if (inlibrary2==null)
						System.out.println(title +"::"+artist + " >> return cannot be completed");
					else if (inlibrary2.isAvailable()) {
						System.out.println(title +"::"+artist + " >> return cannot be completed.");
						
					} else {
						System.out.println(title +"::"+artist + ">> returning and set to available."); // TODO
						inlibrary2.setAvailable(true);
					}
					
					break;
				case "Q":
					System.out.println("Collection Manager terminated.");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid command!");
					break;
			}
		}
	}

	
}
