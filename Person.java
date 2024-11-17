package Exercise2;

import java.util.Scanner;

public class Person {
    private String name;
    private String id;
    private String date;
    private String email;
    private String cityDestiny;
    private String cityOrigin;
    Song[] song;
    byte iterator = 0;

    private final byte SIZE = 3;

    public Person() {
        song = new Song[SIZE];
    }

    public Person(String name, String id, String date, String email, String cityDestiny, String cityOrigen){
        this.name = name;
        this.id = id;
        this.date = date;
        this.email = email;
        this.cityDestiny = cityDestiny;
        this.cityOrigin = cityOrigen;
        song = new Song[SIZE];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", cityDestiny='" + cityDestiny + '\'' +
                ", cityOrigin='" + cityOrigin + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getCityDestiny() {
        return cityDestiny;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) { this.date = date; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCityDestiny(String cityDestiny) { this.cityDestiny = cityDestiny;}

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public byte getSIZE() {return SIZE;}

    public void addSong() {
        Scanner stdin = new Scanner(System.in);

        if (iterator == SIZE){
            System.out.println("cannot you add more songs");
            return;
        }

        for(byte i = 0; i < SIZE; i++) {

            song[i] = new Song();
            System.out.print("Input name the song " + (i + 1) + ": ");
            song[i].setTitle(stdin.nextLine());

            System.out.print("Input name the artis " + (i + 1) + ": ");
            song[i].setArtist(stdin.nextLine());
            iterator++;
        }
    }

    public void showInformation(){

        System.out.println("The person: " + getName() + " these are your favorite songs: ");
        for(byte i = 0; i < SIZE; i++) {
            song[i].showSong();
        }
    }
}
