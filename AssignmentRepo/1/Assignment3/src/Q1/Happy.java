package Q1;

public class Happy extends Moody{
    public String getMood(){
        return "happy";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }


    public void expressFeelings(){
        //returns message about self: “Subject laughs a lot”
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        //print laughter string “heeehee....hahahah...HAHAHA!!”
        return "Observation: Subject laughs a lot";
    }
}
