package Q1;

public abstract class Moody {
    // Return the mood : sad or happy – depending on which object sends the message
    public abstract String getMood();
    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public abstract void queryMood();
    // Each Object expresses a different motion
    public abstract void expressFeelings();
}
