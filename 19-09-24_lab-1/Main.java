public class Main{

public static void main(String a[]){

Artist A1=new Artist();
Artwork w1= new Artwork("Spring", 2024,A1);
Artwork w2= new Artwork("fall",2023);

w2.SetTitle("winter");
w2.SetYear(2022);

w2.displayArtwork();


Artwork w3= new Artwork(w1);
w3.displayArtwork();

w1.SetArtist(A1);




}}