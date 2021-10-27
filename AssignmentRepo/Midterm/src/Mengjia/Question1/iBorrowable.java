package Mengjia.Question1;

public interface iBorrowable {
    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);
}
/*
void setBorrowDate(int day)
void setReturnDate(int day)
boolean isAvailable(int day)

In order to implement the iBorrowable interface define new data members to store the borrow and return dates,
implement the setBorrowDate and setReturnDate methods to store values for these data members. Also implement the
isAvailable method to return false if the given data is between or equal to the start and end dates, otherwise it returns true.
 */
