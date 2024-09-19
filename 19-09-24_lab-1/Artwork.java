public class Artwork{
private String Title;
private int Year;
private Artist Artist1;

//contructor 1
Artwork(String t,int y, Artist a){
this.Title=t;
this.Year=y;
this.Artist1=a;
}

//costructor 2
Artwork(String t,int y){
this.Title=t;
this.Year=y;
this.Artist1= new Artist();
}

//getters
public void SetTitle(String t){
this.Title=t;}

public String GetTitle(){
return Title;
}

public void SetYear(int Y){
this.Year=Y;}

public int GetYear(){
return Year;}

public void SetArtist(Artist a){
this.Artist1=a;}

public Artist GetArtist (){
return Artist1;}


public void displayArtwork(){
System.out.println("Title : "+Title);
System.out.println("Year : "+Year);
Artist1.displayArtist();}

//shallow copy
Artwork(Artwork a1){
this.Title=a1.GetTitle();
this.Year=a1.GetYear();
this.Artist1=a1.GetArtist();

//deep copy
//this.Artist1=new Artist(a1.GetArtist());
}









}