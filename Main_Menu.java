

import java.util.Scanner;

public class Main_Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vstr,tvstr=0,nvstr=0,amt=0,tamt=0,vfd,tvfd,totalamt = 0,fd;
        double vat=0;
        String str="" ,choice="Y";
        System.out.println("           ******* Welcome to Multi Cuisine Restaurant ********     ");
        System.out.println("                   ****   Main menu     ****");
        System.out.println("1.Starters");
        System.out.println("2.Main Course");
        System.out.println("3.Desert");
        System.out.println("Please select Above main menu ");
        int ch=sc.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Welcome to Starters Menu");
                System.out.println("Select 'Vs' for veg Starter or 'Nvs'");
                str = sc.next();
                if (str.equalsIgnoreCase("Vs")) {
                    System.out.println("Starter             Price in Rs");
                    System.out.println("1.Panner Tikka          110");
                    System.out.println("2.Veg Seekh             110");
                    System.out.println("3.Hara Bhara            110");
                    System.out.println("4.Shanghai Spring Roll  150");
                    System.out.println("5.American Corn Ball    150");
                    System.out.println("6.Lassi Rs              120");
                    System.out.println("7.Crispy Mushroom       120");
                    System.out.println("8.Crispy Chilly Potato  120");

                    while (choice.equalsIgnoreCase("Y")) {
                        System.out.println("\n Select From Starter Above list ");
                        vstr = sc.nextInt();
                        System.out.println("Enter Total number of plate which you want to order");
                        tvstr = sc.nextInt();
                        if (vstr >= 1 && vstr <= 3)
                            amt = tvstr * 110;
                        if (vstr >= 4 && vstr <= 5)
                            amt = tvstr * 150;
                        if (vstr >= 6 && vstr <= 8)
                            amt = tvstr * 120;
                        tamt = tamt + amt;
                        System.out.println("Do you want to Place order again ? Enter Y/N");
                        choice = sc.next();
                    }
                }
                if (str.equalsIgnoreCase("Nvs")) {
                    System.out.println("Starter             Price in Rs");
                    System.out.println("1.Chicken Tikka        110");
                    System.out.println("2.Murg Reshmi          110");
                    System.out.println("3.Chickemn Seekh       110");
                    System.out.println("4.Tangdi kebab         150");
                    System.out.println("5.Fish Ajwani          150");
                    System.out.println("6.Chilli Chicken       120");
                    System.out.println("7.Murg Tandoori        120");
                    System.out.println("8.Shanghai Chicken     120");

                    while (choice.equalsIgnoreCase("Y")) {
                        System.out.println("Select From Starter Above list ");
                        vstr = sc.nextInt();
                        System.out.println("Enter Total number of plate which you want to order");
                        tvstr = sc.nextInt();
                        if (vstr >= 1 && vstr <= 3)
                            amt = tvstr * 110;
                        if (vstr >= 4 && vstr <= 5)
                            amt = tvstr * 150;
                        if (vstr >= 6 && vstr <= 8)
                            amt = tvstr * 120;
                        tamt = tamt + amt;
                        System.out.println("Do you want to Place order again ? Enter Y/N");
                        choice = sc.next();
                    }
                }
                System.out.println("******Multi Cuisine Restaurant *********.....");
                System.out.println("************Bill********");
                vat = Math.round(14.5 / 100.0 * tamt);
                System.out.println("VAT =14.5%");
                System.out.println("Total VAT= RS" + vat);
                System.out.println("Amount to be paid =Rs" + (tamt + vat));
                System.out.println();
                break;

            case 2:
                System.out.println("Main Course:Indian and chines Dishes");
                System.out.println("Enter 'V' for Indian Veg Dishes,'NV' for Indian Non-veg Dishes and 'C'  for Chines Dishes");
                str = sc.next();
                if (str.equalsIgnoreCase("V")) {
                    System.out.println(" Welcome to Indian Veg Dishes");
                    System.out.println("Indian Dishes        Price in Rs.");
                    System.out.println("1. Shahi Panner           180");
                    System.out.println("2. Navratan Korma         180");
                    System.out.println("3. Kadahi  Paneer         140");
                    System.out.println("4. Malai Kofta            140");
                    System.out.println("5. Kadahi  Vegetable      150");
                    System.out.println("6. Vegetable Pakeeza      150");
                    System.out.println("7. Butter Naan             150");
                    while (choice.equalsIgnoreCase("Y")) {
                        System.out.println("Choose your Main Course from the list by entering number : ");
                        vfd = sc.nextInt();
                        System.out.println("How many plates do you want to places from above list?");
                        tvfd = sc.nextInt();
                        if (vfd == 1 || vfd == 2)
                            amt = tvfd * 180;
                        if (vfd == 3 || vfd == 4)
                            amt = tvfd * 140;
                        if (vfd == 5 || vfd == 6 || vfd == 7)
                            amt = tvfd * 150;
                        totalamt = totalamt + amt;
                        System.out.println(" Do you want to place more order ? Enter Y/N");
                        choice = sc.next();


                    }
                }
                if (str.equalsIgnoreCase("NV")) {
                    System.out.println(" Welcome to Indian Non -Veg Dishes");
                    System.out.println("Indian Non_veg Dishes         Prices in Rs.");
                    System.out.println("1. Chicken Tika Masala         180 ");
                    System.out.println("2. Chicken Tika Labadar        180");
                    System.out.println("3. Chicken Bharta              150");
                    System.out.println("4. Mutton  Rogan josh           150");
                    System.out.println("5. Prawan Malai Curry           130");
                    System.out.println("6. Fish Sarsowala               130");
                    while (choice.equalsIgnoreCase("Y")) {
                        System.out.println(" Choose your Non-veg Course from the list by entering number :");
                        vfd = sc.nextInt();
                        System.out.println("How many plates do you want to places from above list?");
                        tvfd = sc.nextInt();
                        if (vfd == 1 || vfd == 2)
                            amt = tvfd * 180;
                        if (vfd == 3 || vfd == 4)
                            amt = tvfd * 150;
                        if (vfd == 5 || vfd == 6)
                            amt = tvfd * 130;
                        totalamt = totalamt + amt;
                        System.out.println(" Do you want to place more order ? Enter Y/N");
                        choice = sc.next();
                    }
                }
                if (choice.equalsIgnoreCase("C")) {
                    System.out.println("Welcome to Chines Dishes");
                    System.out.println(" Chines Dishes        Prices in Rs.");
                    System.out.println("1. Schezwan Fried Rice         249");
                    System.out.println("2. Schezwan Chicken            249");
                    System.out.println("3. Chilly Chicken              300");
                    System.out.println("4. Chilly Paneer               300");
                    System.out.println("5. Kimchi Rice Veg             210");
                    System.out.println("6. Paneer Manchurier           210");
                    while (choice.equalsIgnoreCase("Y")) {
                        System.out.println("Choose your main Course from Above list");
                        fd = sc.nextInt();
                        System.out.println("How many plates do you want to places from above list?");
                        int tfd = sc.nextInt();
                        if (fd == 1 || fd == 2)
                            amt = tfd * 249;
                        if (fd == 3 || fd == 4)
                            amt = tfd * 300;
                        if (fd == 5 || fd == 6)
                            amt = tfd * 210;
                        totalamt = totalamt + amt;
                        System.out.println(" Do you want to place more order ? Enter Y/N");
                        choice = sc.next();
                    }

                }
                System.out.println();
                System.out.println("******Multi Cuisine Restaurant *********.....");
                System.out.println("************Bill********");
                vat = Math.round(14.5 / 100.0 * totalamt);
                System.out.println("VAT =14.5%");
                System.out.println("Total VAT= RS" + vat);
                System.out.println("Amount to be paid =Rs" + (totalamt + vat));
                System.out.println();
                break;
            case 3:
                System.out.println(" Cool with Deserts");
                System.out.println("Desert         Price in Rs");
                System.out.println("1.Softy Pineapple      110");
                System.out.println("2. Softy Crunchy        110");
                System.out.println("3.Chocolate Doughnut      120");
                System.out.println("4.Marble Cake       120");
                System.out.println("5. pineapple shake    100");
                System.out.println("6.Tooty Fruity         100");
                while (choice.equalsIgnoreCase("Y")) {
                    System.out.println(" Choose your Desert by entering your number: ");
                    int d = sc.nextInt();
                    System.out.println("Enter total number of items  you want to buy!!");
                    int totaId = sc.nextInt();
                    int damt = 0;
                    if (d == 1 || d == 2)
                        damt = totaId * 110;
                    if (d == 3 || d == 4)
                        damt = totaId * 120;
                    if (d == 5 || d == 6)
                        damt = totaId * 100;
                    totalamt = totalamt + damt;
                    System.out.println(" Do you want to place more order ? Enter Y/N");
                    choice = sc.next();

                }
                System.out.println();
                System.out.println("******Multi Cuisine Restaurant *********.....");
                System.out.println("************Bill********");
                vat = Math.round(14.5 / 100.0 * totalamt);
                System.out.println("VAT =14.5%");
                System.out.println("Total VAT= RS" + vat);
                System.out.println("Amount to be paid =Rs" + (totalamt + vat));
                System.out.println();
                break;
            default:
                System.out.println(" You have entered  wrong choice!!");
                System.out.println(" You can enter in MultiCuisine Restaurant by executing the  program again with correct choice");
                System.out.println("Now ,'Quit' the program");
        }
        System.out.println( "To exit Multi Cuisine Restaurant World ,enter the  word 'Quit'!!");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("quit")){
            System.out.println("Thanks for Coming to Multi Cuisine Restaurant !!");
            System.out.println(" Your Pleasure Our Comfort !!" );
            System.out.println("Visit Again!!!");
            System.out.println();
        }

    }
}