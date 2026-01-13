class HillStations {
    void location() {
        System.out.println("Hill station location");
    }
    void famousFor() {
        System.out.println("Hill station is famous for its beauty");
    }
}

class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    @Override
    void famousFor() {
        System.out.println("Manali is famous for snow and adventure sports");
    }
}
class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for scenic views");
    }
}
class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for skiing");
    }
}
public class Main {
    public static void main(String[] args) {
        HillStations hs;
        hs = new Manali();
        hs.location();
        hs.famousFor();
        hs = new Mussoorie();
        hs.location();
        hs.famousFor();
        hs = new Gulmarg();
        hs.location();
        hs.famousFor();

        System.out.println("----------------------");
        Manali m = new Manali();
        m.location();
        m.famousFor();
        Mussoorie mu = new Mussoorie();
        mu.location();
        mu.famousFor();
        Gulmarg g = new Gulmarg();
        g.location();
        g.famousFor();
    }
}
