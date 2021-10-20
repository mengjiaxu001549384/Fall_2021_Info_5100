package Q1;

public class Psychiatrist {
    public void examine(Moody obj){
        //asks moody object about its mood
        System.out.println("How are you feeling today?");
        obj.queryMood();

    }

    public void observe(Moody obj){
        //a moodyObject is observed to either laugh or cry
        obj.expressFeelings();
        System.out.println(this.toString(obj));
    }

    public String toString(Moody obj){
        //returns message about self: “Subject laughs a lot”
        return obj.toString();
    }
}
