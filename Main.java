import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bookstore bookObj = new Bookstore();
        bookObj.setHours("Our store is open from 9am-8pm.");
        bookObj.setName("Gorkem's Bookstore");
        System.out.println("Hello, welcome to " + bookObj.getName());
        System.out.println("------- Main Menu --------");
        System.out.println("Use the numbers to reach answers");
        System.out.println("1- What is the adress of the store?");
        System.out.println("2- Is the store open today?");
        System.out.println("3- How big is the store?");
        System.out.println("4- Does the store have new or used books?");
        System.out.println("5- See our books");

        int number = input.nextInt();

        switch (number) {
            case 1:
                bookObj.setAdress("Bookstore Location is 902 W 4th Street 28202 Charlotte/NC");
                System.out.println(bookObj.getAdress());
                break;
            case 2:
                System.out.println("Which day are you going to visit us?");
                bookObj.setDay("Monday");
                System.out.println("1- " + bookObj.getDay());
                bookObj.setDay("Tuesday");
                System.out.println("2- " + bookObj.getDay());
                bookObj.setDay("Wednesday");
                System.out.println("3- " + bookObj.getDay());
                bookObj.setDay("Thursday");
                System.out.println("4- " + bookObj.getDay());
                bookObj.setDay("Friday");
                System.out.println("5- " + bookObj.getDay());
                bookObj.setDay("Saturday");
                System.out.println("6- " + bookObj.getDay());
                bookObj.setDay("Sunday");
                System.out.println("7- " + bookObj.getDay());
                int days = input.nextInt();

                switch (days) {

                    case 1:
                        System.out.println(bookObj.getHours());
                        break;
                    case 2:
                        System.out.println(bookObj.getHours());
                        break;
                    case 3:
                        System.out.println(bookObj.getHours());
                        break;
                    case 4:
                        System.out.println(bookObj.getHours());
                        break;
                    case 5:
                        System.out.println(bookObj.getHours());
                        break;
                    case 6:
                        bookObj.setHours("Our store is open from 10am-6pm.");
                        System.out.println(bookObj.getHours());
                        break;
                    case 7:
                        System.out.println(bookObj.getHours());
                        break;
                }
                break;
            case 3:
                bookObj.setSqft(26000);
                System.out.println("Our store is " + bookObj.getSqft() + " sqft and it has 1000 books.");
                break;
            case 4:
                System.out.println("Yes, we sell both conditon new and used");
                break;
            case 5:
                bookObj.getTitles();
                break;

        }

    }
}
