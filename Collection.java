public class Collection {
	/**
	The Collection class holds the list of albums and the methods that 
	can be used to edit the list.
	
	The Collection class holds methods that can be used to find, add, 
	and remove albums in the list. It also holds methods that can be 
	used to lend out and return albums to the list. Finally, the Collection 
	class holds methods that can print the list of albums in no order, by order
	of date, and by order of genre.
	@author Rohit Krishnan, teammemberName2
	*/
 private Album[] albums;
 private int numAlbums; //number of albums currently in the collection

 /**
	Finds the album index of the album that the user inputs.
 @param album object for the album that the user is looking for
 @return The index of the album, -1 if it can't  be found
 */
 private int find(Album album) {
	 for (int i=0; i<  albums.length; i++) {
		 if (albums[i].title == album.title && albums[i].artist == album.artist) {
			 return i;
		 } 
	 }
	 return -1;
 } //find the album index, or return NOT_FOUND
 /**
	Grows the album array by 4 spots
 */
 private void grow() {
	 Album newArray[] = new Album [albums.length+4];
	 for (int i= 0; i < albums.length; i++) {
		 newArray[i]=albums[i];
		 albums = newArray;
	 }
	 
	 
	 
 } //increase the capacity of the array list by 4
 /**
	Adds the album that the user inputs to the album array
 @param Album object of the album the user wants to add
 @return True after the album is added, false if the date of the inputed album is not valid
 */
 public boolean add(Album album) {
	if (!album.Date.isValid()) {
		return false;
	}
		
	 for (int i=0; i< albums.length; i++) {
		 if (albums[i]==null) {
			 albums[i]=album;
			 numAlbums++;
			 albums[i].isAvailable=true;
			 return true;
		 }		 
	 }
	 if (numAlbums == albums.length) {
		 grow();
	 }
	 
	 
 }
 /**
	Removes the inputed album from the  albums array
 @param Album object of the album the user wants to remove
 @return True after the album is removed, false if the album doesn't exist in the list
 */
 public boolean remove(Album album) {
	 int index = find(album);
	 if (index ==-1) {
		 return false;
	 }
	 Album tempArr[] = new Album [albums.length-1];
	 
	 for (int i=0, k=0; i< albums.length; i++) {
		 	if  (i==index) {
		 		continue;		 
		 	}
		 	tempArr[k++]= albums[i]; 
	 }
	 albums  = tempArr;
	 return true;
}
 /**
	Sets the inputed album as not available
 @param Album object of the album the user wants to set as not available
 @return True after the album is set to not available, false if the album doesn't exist in the list
 */
 public
 public boolean lendingOut(Album album) {
	 int index = find(album);
	 if (index ==-1) {
		 return false;
	 }
	 albums[index].isAvailable = false;
	 return true;
 }
 /**
	Sets the inputed album as available 
@param Album object of the album the user wants to set as available
@return True after the album is set to available, false if the album doesn't exist in the list
*/
 public boolean returnAlbum(Album album) {
	 int index = find(album);
	 if (index ==-1) {
		 return false;
	 }
	 albums[index].isAvailable = true;
	 return true;
 }
 /**
	Prints the albums in the albums array in no particular order
*/
 public void print() {
	 System.out.println(albums);
 } //display the list without specifying the order
 
 /**
	Prints the albums in the albums array by order of dates
*/
 public void printByReleaseDate() {
	 Album arr[] = albums;
	 int n= albums.length;
	  // One by one move boundary of unsorted subarray
     for (int i = 0; i < n-1; i++)
     {
         // Find the minimum element in unsorted array
         int min_idx = i;
         for (int j = i+1; j < n; j++)
             if (albums[j].releaseDate.compareTo(albums[min_idx])<0);
                 min_idx = j;

         // Swap the found minimum element with the first
         // element
         int temp = arr[min_idx];
         arr[min_idx] = arr[i];
         arr[i] = temp;
     }
   System.out.println(arr);
 }
 
 /**
	Prints the albums in the albums array by order of genre alphabetically
*/
 public void printByGenre() {
	 Album arr[] = albums;
	 for(int i = 0; i < arr.length; i++)
	 {
	     int smallest = i;
	     for(int j = i + 1; j < arr.length; j++) // here you find the index of the minimum String between the strings in the unsorted side of the array
	     {
	         if(arr[j].genre.compareTo(arr[i].genre) < 0)
	             smallest = j;
	     }
	     //put the new minimum in the i-th position.
	     Album a = arr[i];
	     arr[i] = arr[smallest];
	     arr[smallest] = a;
 }
	 System.out.println(arr);	 
}

}
