import java.util.ArrayList;

public class main {
    public static void main(String args[]) {

        //4.1
        Teacup teacup = new Teacup(33, 2.5, 30);
        Teacup teacup1 = new Teacup(20, 3, 40);
        DVD dvd = new DVD(3, 21, 18, "Java Thriller", "Dan Archambault");
        DVD dvd2 = new DVD(100, 99, 180, "A dog s purpose", "Gabriel John");
        DVD dvd3 = new DVD(50, 60, 80, "Locke Key House", "Daniel Radcliffe");
        DVD dvd4 = new DVD(40, 50, 70, "Riverdale", "I dont even know");
        DVD dvd5 = new DVD(30, 40, 60, "Harry Potter", "J K Rowling");

        cd cd = new cd(4, 22, 10, "Twinkle Twinkle", "Dan Archambault");
        cd cd1 = new cd(5, 23, 11, "It s my life", "Queens");
        cd cd2 = new cd(6, 24, 12, "Yummy ", "Justin Bieber");
        cd cd3 = new cd(7, 25, 13, "Walk me home", "Pink");
        System.out.println(teacup.getvolumeOfTea());
        teacup.setVolumeOfTea(35);
        System.out.println(teacup.getvolumeOfTea());
        System.out.println(teacup.getPrice());
        teacup.setPrice(4);
        System.out.println(teacup.getPrice());
        teacup.setPrice(4);
        System.out.println(teacup.getPrice());
/*
        //4.2
        DVD myDVD = new DVD(11.17, 9, 102, "Your Name", "Makoto Shinkai");
        Playable myPlayable = myDVD;

        System.out.println(myPlayable.getTitle());
        System.out.println(myPlayable.getRuntime());
        System.out.println(myPlayable.getRentalCost());
        System.out.println(myPlayable.getDirector());

        DVD myDVD2 = new DVD(22, 10, 99, "Thriller2", "Predi");
        myPlayable = (Playable) myDVD2;
        System.out.println(myDVD2.getDirector());
        //System.out.println(myPlayable.getDirector);
    }}
*/

/*
        //4.3
        ArrayList<Playable> Mylist = new ArrayList<Playable>();
        Mylist.add(cd);
        Mylist.add(cd1);
        Mylist.add(cd2);
        Mylist.add(dvd2);
        Mylist.add(dvd3);
        Mylist.add(cd3);
        Mylist.add(dvd3);
        Mylist.add(dvd4);
        int i;

        Mylist.forEach(playable -> {
            System.out.println(playable.getTitle());
            System.out.println(playable.getRuntime());
            System.out.println(playable.getRentalCost());
            playable.play();
        });
        for (i = 0; i < Mylist.size(); i++) {
            System.out.println(Mylist.get(i).getTitle());
            System.out.println(Mylist.get(i).getRuntime());
            System.out.println(Mylist.get(i).getRentalCost());
            Mylist.get(i).play();

        }
    }
}

*/
        //4.4
        int i;
        ArrayList<Product> MySecondList = new ArrayList<Product>();
        MySecondList.add(dvd2);
        MySecondList.add(dvd3);
        MySecondList.add(teacup);
        MySecondList.add(teacup1);
        MySecondList.add(dvd);
        MySecondList.add(dvd4);
        MySecondList.add(cd2);
        double sum = 0;
        for (i = 0; i < MySecondList.size(); i++) {
            System.out.println(MySecondList.get(i).getPrice());
            sum = sum + MySecondList.get(i).getPrice();
            System.out.println(MySecondList.get(i).getNumStock());
            System.out.println(sum);

        }
    }
}







