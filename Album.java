public class Album {
 private String title;
 private String artist;
 private Genre genre; //enum class; Classical, Country, Jazz, Pop, Unknown
 private Date releaseDate;
 private boolean isAvailable;

 @Override
 public boolean equals(Object obj) {
	 if (Album.title==obj.title && Album.artist == obj.artist) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }

 @Override
 public String toString() {
	 String albumoutput = title+"::"+artist+"::"+genre+"::"+releaseDate;
	 return albumoutput;
 }
}
