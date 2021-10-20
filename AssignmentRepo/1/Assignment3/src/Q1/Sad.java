package Q1;

public class Sad extends Moody {
    public String getMood(){
        //returns string indicating sad
        return "sad";
    }

    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

    public void expressFeelings(){
        //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    public String toString(){
        //returns message about self : “Subject cries a lot”
        return"Observation: Subject cries a lot";
    }
}
