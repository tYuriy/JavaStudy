package LearningJava.Head9;

/**
 * Created by user on 16.03.2017.
 */
    class Bees {
        Honey[] beeHA;
    }
    class Raccoon {
        Kit k;
        Honey rh;
    }
    class Kit {
        Honey kh;
    }
    class Bear {
        Honey hunny;
    }
    public class Honey {
        public static void main(String [] args) {
            Honey honeyPot = new Honey();
            Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};
            Bees bl = new Bees();
            bl.beeHA = ha;
            Bear[] ba = new Bear[5];
            for (int x = 0; x < 5; x++) {
                ba[x] = new Bear();
                ba[x].hunny = honeyPot;
            }

            Kit k = new Kit();
            k.kh = honeyPot;
            Raccoon r = new Raccoon();

            r.rh = honeyPot;
            r.k = k;
            k = null;
        }
    }

