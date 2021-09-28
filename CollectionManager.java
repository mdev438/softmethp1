import java.util.Scanner;
import java.util.StringTokenizer;
public class CollectionManager {

Scanner userin = new Scanner(System.in);
String[] commands = new String[5];
String request,album,artist,genre,date;

public void run()
{
while (0<1) {

String cmd = userin.nextLine();
StringTokenizer splitter = new StringTokenizer(cmd, ",");
for (int i=0;i<commands.length;i++){
    commands[i] = splitter.nextToken();
}
request = commands[0];
album = commands[1];
artist = commands[2];
genre = commands[3];
date = commands[4];
switch (request) {

  case "A" : Collection.add(album,artist,genre,date);
            break;

  case "D" : Collection.remove(album,artist,"",0);
             break;

  case "L" : if (album.isAvailable()==true){
                 album.lendingOut;
                 }
             else System.out.println(album+"is not available");
             break;

  case "PD" : Collection.printbyReleaseDate();
              break;

  case "PG" : Collection.printByGenre();
              break;

  case "P" : Collection.print();
             break;

  case "R" : Album.isAvailable() = !Album.isAvailable();
             break;

  case "Q" : System.out.println("Collection Manager terminated.");
             exit;
             break;

  default : System.out.println("Invalid command!");
             break; 

}
}





}



    
}



}