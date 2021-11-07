/*

package org.itstep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class WiseCounting {
    public static void main(String[] args) {
Emperor emperor = new Emperor("Акбар");
        List<Courtier> courtiers = new ArrayList<>();
        courtiers.add(new Courtier("First Courtier"));
        courtiers.add(new Courtier("Second Courtier"));
        courtiers.add(new Courtier("Third Courtier"));
        virbal.add(new Virbal("Virbal"));
        emperor.asks(0);
        //for (int i = 0; i< courtiers.size(); i++) {
            //courtiers.get(i).thinks();
    //    for (Callable courtier: courtiers) {

  //  courtier.thinks();
        courtiers.forEach(Courtier::thinks);
    virbal.enters();
    virbal.asks();
    emperor.asks(0);
    virbal.replice();
    virbal.says();




    }
}
    class Persons {

        private final String name;
       Persons(String name) {
           this.name = name;
       }
        public String getName() {
            return name;
        }
       }
    class Emperor extends Persons {
        private final ArrayList<String> questions = new ArrayList<>();

        {
            questions.add("\"How many crows are there in this city?\"");
            questions.add("\"How can you be so sure?\"");
        }

        Emperor(String name) {
            super(name);

        }

        public void asks(int number) {
            String s = questions.get(number);
            System.out.println(getName() + " asks: " + s);
        }

        public void looks() {
            System.out.println(getName() + " glanced at his courtiers");
        }
    }
        class Courtier extends Persons {

            public Courtier(String name) {
                super(name);

        }
        public void thinks(){
            System.out.println("Head of the "+getName()+
                    " began to hang low in search of an answer");
        }
    }
    class Virbal extends Persons {
        //System.out.println("Head of the "+getName()+" began to hang low in search of an answer");
    }
public void enters(){
    System.out.println(getName()+" enters the courtyard");
}
public void asks(){
    System.out.println(getName()+" asks: \"May I know the question so that I can try for an answer?\"");
}
private void replice(){
    System.out.println(getName()+" replies: \"There are fifty thousand five hundred and eighty nine crows, my lord\"");
}
private void says(){
    System.out.println(getName()+" says: \"Make you men count, My lord. \n"+
            "If you find more crows it means some have come to visit their relatives here.\n"+
            "If you find less number of crows it means some have gone to visit their relatives elsewhere\"");
}
    }
*/