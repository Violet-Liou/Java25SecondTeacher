public class DemoClass {

    public static void main(String[] args) {
        // int number = 10;

        // // 類別實作 - Car
        // Car car1 = new Car("001", "blue", 0); // 這裡的 car1 是物件名稱，new Car() 是類別名稱
        // car1.showCarInfo(); // 輸出: Car color:001 Car number: blue Car Year: 0

        // // 類別實作 - Person
        // Person person1 = new Person("Tom", 20); // 這裡的 person1 是物件名稱，new Person() 是類別名稱
        // person1.showName(); // 輸出: Person name:Tom
        // person1.showAge(); // 輸出: Person name:Tom


        //銀行
        // Bank bank1 = new Bank("123456", 1000); // 這裡的 bank1 是物件名稱，new Bank() 是類別名稱
        // bank1.showAccount(); // 輸出: Account: 123456 & Balance: 1000
        
        // bank1.setBalance(5000);
        // int balance = bank1.getBalance(); // 這裡的 balance 是物件名稱，new Bank() 是類別名稱
        // System.out.println("Account: " + bank1.getAccount() + " & Balance: " + balance); // 輸出: Account: 123456 & Balance: 5000

        // bank1.setBalance(-1000); // 輸出: 存款金額不能小於0
        // int balance2 = bank1.getBalance(); // 這裡的 balance 是物件名稱，new Bank() 是類別名稱
        // System.out.println("Account: " + bank1.getAccount() + " & Balance: " + balance2); // 輸出: Account: 123456 & Balance: 5000

    
        //課程練習1：修改可以變更account >>未完成
        // Bank bank2 = new Bank("654321", 2000); // 這裡的 bank1 是物件名稱，new Bank() 是類別名稱
        // bank2.showAccount(); // 輸出: Account: 654321 & Balance: 2000

        // bank2.setBalance1("111111","0",1000);
        // String account = bank2.getAccount(); // 這裡的 account 是物件名稱，new Bank() 是類別名稱
        // int balance3 = bank2.getBalance(); // 這裡的 balance 是物件名稱，new Bank() 是類別名稱
        // System.out.println("Account: " + account + " & Balance: " + balance3); // 輸出: Account: 654321 & Balance: 2000



        //課程練習2：Student類別
        Student student1 = new Student("Tom", 101); // 這裡的 student1 是物件名稱，new Student() 是類別名稱
        System.out.println("Student name: " + student1.getName() + " & Student score: " + student1.getScore()); // 輸出: Student name: Tom & Student score: 90

        Cat c1= new Animal.Cat();
        c1.speak();
        c1.meow();

    }
}
