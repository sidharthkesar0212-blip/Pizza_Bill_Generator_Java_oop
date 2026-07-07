import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.println("Do you want to take orders: \n 1. Yes\n 2. No\n Enter your choice(1/2):");
        k = sc.nextInt();
        while(k != 2){
            boolean deluxePizza = false;
            boolean veg = false;
            int n;
            System.out.println("What Kind of Pizza do you want: \n 1. Deluxe\n2. Normal\nEnter the type(1/2):");
            n = sc.nextInt();
            if(n == 1)deluxePizza = true;
            else if(n == 2)deluxePizza = false;

            System.out.println("What Kind of Pizza do you want: \n 1. Veg\n2. Non veg\nEnter the type(1/2):");
            n = sc.nextInt();
            if(n == 1)veg = true;
            else if(n == 2)veg = false;

            if(deluxePizza)
            {
                Pizza p1 = new DeluxePizza(veg);
                System.out.println("Do you want take away \n1. yes\n2. No\nEnter your choice(1/2):");
                if(sc.nextInt() == 1) p1.takeAway();
                p1.getBill();
            }
            else
            {
                Pizza p1 = new Pizza(veg);
                System.out.println("Do you want extra cheese \n1. yes\n2. No\nEnter your choice(1/2):");
                if(sc.nextInt() == 1) p1.getExtraCheese();
                System.out.println("Do you want extra toppings \n1. yes\n2. No\nEnter your choice(1/2):");
                if(sc.nextInt() == 1) p1.getExtraToppings();
                System.out.println("Do you want take away \n1. yes\n2. No\nEnter your choice(1/2):");
                if(sc.nextInt() == 1) p1.takeAway();
                p1.getBill();
            }
            System.out.println("Do you want to take orders: \n 1. Yes\n 2. No\n Enter your choice(1/2):");
            k = sc.nextInt();
        }
        System.out.println("Bill Generator Exited!!!");
    }
}
