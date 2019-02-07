package GenericInterfaceAufgabe3;

public class Arena {
    void startTournament() {
        new Turnier()
                .registerFighter(new Knight("Sir Julian"))
                .registerFighter(new Knight("Sir Jethro"))
                .registerFighter(new Dragon ("Moritz"))
                .registerFighter(new Farmer ("Sinan"))
                .registerFighter(new Knight("Sir Julian Junior"))
                .registerFighter(new Knight("Sir Jethro Junior"))
                .registerFighter(new Dragon ("Moritz Junior"))
                .registerFighter(new Farmer ("Sinan Junior"))
                .registerFighter(new Knight("Lady Julian"))
                .registerFighter(new Knight("Lady Jethro"))
                .registerFighter(new Dragon ("Lady Moritz"))
                .registerFighter(new Farmer ("Lady Sinan"))
                .registerFighter(new Knight("Lady Julian Junior"))
                .registerFighter(new Knight("Lady Jethro Junior"))
                .registerFighter(new Dragon ("Lady Moritz Junior"))
                .registerFighter(new Farmer ("Lady Sinan Junior"))
       .startFight();
    }
}
