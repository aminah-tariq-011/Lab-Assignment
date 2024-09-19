public class Artist{
private String ArtistName;

//getter
public void SetArtistName(String n){
this.ArtistName=n;
}

public String GetArtistName(){
return ArtistName;
}

//costructor
Artist(){
ArtistName="default name";
}


//display
public void displayArtist(){
System.out.println("Artist Name: "+ArtistName);
}





}