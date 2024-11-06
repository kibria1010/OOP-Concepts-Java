package oop;

/**
 * Encapsulation is a way to restrict the direct access to some components of an
 * object, so users cannot access state values for all of the variables of a
 * particular object. Encapsulation can be used to hide both data members and
 * data functions or methods associated with an instantiated class or object.
 */
public class Encapsulation {

    public static void main(String[] args) {
        Bank k = new Bank(1);
        k.setMoney(1, 500);
        System.out.println(k.getMoney(1));
        System.out.println(k.getMoney(2));
    }
}

class Bank {

    private int id, money;

    public Bank(int id) {
        this.id = id;
    }

    public void setMoney(int id, int money) {
        if (id == this.id && money > 0) {
            this.money += money;
            System.out.println("Money deposited");
        }
    }

    public int getMoney(int id) {
        if (id != this.id) {
            System.out.println("Invalid Id");
            return -1;
        }
        return money;
    }
}
