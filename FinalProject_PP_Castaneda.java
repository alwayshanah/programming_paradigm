import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; // I used this statement for my first scenario.
import java.util.Scanner; // to scan the user's input 

public class FinalProject_PP_Castaneda {
   public static void main (String[] args) {
   
   Scanner a = new Scanner (System.in);
   
   String typeText = "Enter Your Name: "; // I used String data type to achieve the typing effect
   typingEffect(typeText); // this is to perform the typing effect
   String name = a.nextLine();
   
   String textToType = "\nHello, " + name + ". Welcome to Adulthood.\nThis is a story mode game, created for academic purpose only.\nI hope you'll have fun!";
   typingEffect(textToType);
   
   String textToType1 = "\n\n    [1] START\n    [2] QUIT \nEnter Your Choice: "; // if-else statement
   typingEffect(textToType1); 
   int choice = a.nextInt();
   
  if (choice == 2) {
     handleGameEnd(a); // this is to access one of the private static method I created
  } else {
     handleGameStart1(a); 
  }
   
    String textnext1 = "\nGreat job completing your first task!\n\nAre you ready to move on to your next one? [y/n]: ";
        typingEffect(textnext1);
        char choice2 = a.next().charAt(0);
   
        if (choice2 == 'n') {
         handleGameEnd1(a); 
        } else {
         handleGameStart2(a); 
        }
        
    String textnext2 = "\n\nGreat job completing your second task!\n\nAre you ready to move on to your next one? [y/n]: ";
        typingEffect(textnext2);
        char choice3 = a.next().charAt(0);
   
        if (choice3 == 'n') {
         handleGameEnd2(a); 
        } else {
         handleGameStart3(a); 
        }
}

   private static void handleGameEnd (Scanner a) { // I used private static method to shorten my code. With this method I can call this modifier how many times without writing the code again.
      String typetext1 = "\nAre You Sure You Want To Quit This Game? [y/n]: ";
      typingEffect(typetext1);
      char want = a.next().charAt(0);
      
  if (want == 'y' || want == 'Y') {
     String typetext2 = "\nWhenever you're ready to play, the game awaits. Have a great day!"; 
     typingEffect(typetext2);   
  } else {
      String textToType2 = "\nPress Enter to Start the Game."; 
      typingEffect(textToType2); 

      a.nextLine();
      String blank = a.nextLine(); // this is to allow user to press the enter key exclusively, without entering any other input
   
      handleGameStart1(a);
   }
}

   private static void handleGameEnd1 (Scanner a) { // this will run on the first scenario if the user chooses not to continue the game
      String typetext1 = "\nDo You Wish To Quit The Game? [y/n]: ";
      typingEffect(typetext1);
      char want1 = a.next().charAt(0);
      
  if (want1 == 'y' || want1 == 'Y') {
     String typetext2 = "\nWhenever you're ready to play, the game awaits. Have a great day!"; 
     typingEffect(typetext2);   
  } else {
      String textToType2 = "\nPress Enter to Resume the Game."; 
      typingEffect(textToType2); 

      a.nextLine();
      String blank = a.nextLine();
   
      handleGameStart2(a); 
   }
}

   private static void handleGameEnd2 (Scanner a) { // this will run on the second scenario if the user chooses not to continue the game
      String typetext1 = "\nDo You Wish To Quit The Game? [y/n]: ";
      typingEffect(typetext1);
      char want1 = a.next().charAt(0);
      
  if (want1 == 'y' || want1 == 'Y') {
     String typetext2 = "\nWhenever you're ready to play, the game awaits. Have a great day!"; 
     typingEffect(typetext2);   
  } else {
      String textToType2 = "\nPress Enter to Resume the Game."; 
      typingEffect(textToType2); 

      a.nextLine();
      String blank = a.nextLine();
   
      handleGameStart3(a);
   }
}

   private static void handleGameEnd3 (Scanner a) { // this will run on the last scenario if the user chooses not to continue the game
      String typetext1 = "\nDo You Wish To Quit The Game? [y/n]: ";
      typingEffect(typetext1);
      char want1 = a.next().charAt(0);
      
  if (want1 == 'y' || want1 == 'Y') {
     String typetext2 = "\nWhenever you're ready to play, the game awaits. Have a great day!"; 
     typingEffect(typetext2);   
  } else {
      String textToType2 = "\nPress Enter to Order Again."; 
      typingEffect(textToType2); 

      a.nextLine();
      String blank = a.nextLine();
   
      grabeFoode(a);
   }
}
    
   private static void handleGameStart1 (Scanner a) { // this is the first scenario the player will play
      String textToType3 = "\nOn this Sunday morning, you've been granted a day off from your job, and to add to the joy, you've just received your salary along with a Christmas bonus.\nWith this free time and financial boost, you've chosen to dedicate the day to spending quality moments with your family."; 
      typingEffect(textToType3);
      String textToType4 = "\nYou created a list on what to do, and the first thing on the list is to buy a mobile load because you just ran out of it.\nThis ensures you'll have internet connectivity while spending time with your family outdoors.\n\nYou headed to the loading store...\nYou arrived at the loading store."; 
      typingEffect(textToType4);
      
      String dialogue = "\n\nYou: Ayo! I'll buy load.";
      typingEffect(dialogue);
      
      String dialogue1 = "\nVendor: What load?";
      typingEffect(dialogue1);
      
      int choice1;
      char ag2;
      do {
      String textToType1 = "\n\n    [1] Smart\n    [2] Globe\n    [3] Dito \nEnter Your Choice: "; // if-else statement to execute do-while
      typingEffect(textToType1);
      choice1 = a.nextInt();
      
      if (choice1 == 1) { // Smart
         String dialogue2 = "\nYou: Smart po.";
         typingEffect(dialogue2);
         String dialogue3 = "\nVender: How much will it be?";
         typingEffect(dialogue3);
         int hmload;
         
         char ag1;
         do {  // do-while in case the user will input an invalid input
         System.out.print("\n\n10 15 20 30 50 60 75 100\n   Enter How Much: "); // I'm using systen.out.print() to print them at once
         hmload = a.nextInt();
         a.nextLine();
         
         if (hmload == 10 || hmload == 15 || hmload == 20 || hmload == 30 || hmload == 50 || hmload == 60 || hmload == 75 || hmload == 100) {
                String dialogue6 = "\nVendor: Your number, please?";
                typingEffect(dialogue6);
                System.out.print("\n\n  ENTER 9 NUMBERS ONLY. DON'T INCLUDE 09\n");
                String dialogue7 = "You: 09";
                typingEffect(dialogue7);
                int numberld = a.nextInt();
                a.nextLine();
                String dialogue8 = "\nVendor: Great, please check your SMS for the confirmation.";
                typingEffect(dialogue8);

                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM HH:mm");
                String formattedDateTime = now.format(formatter);

                String text = "\n\n!!! PHONE BEEPS !!!";
                typingEffect(text);
                String dialogue9 = "\n\n1/2 " + formattedDateTime + ": P" + hmload + " loaded to 09" + numberld + " from XXXXXXXX8660 for 1 year.\nRef: AJP4X0KCD. Get MORE with PROMO LOAD in the Smart App!";
                typingEffect(dialogue9);
            } else {
                String dialogue5 = "\nVender: Sorry, we don't load with that amount.";
                typingEffect(dialogue5);
            }

            System.out.print("\n\nEnter Again? [y/n]: ");
            ag1 = a.next().charAt(0);
        } while (ag1 == 'y' || ag1 == 'Y');
}
        else if (choice1 == 2) { // Globe
         String dialogue22 = "\nYou: Globe po.";
         typingEffect(dialogue22);
         String dialogue23 = "\nVender: How much will it be?";
         typingEffect(dialogue23);
         
         int ag1;
         do { // do-while in case the user will input an invalid input
         System.out.print("\n\n10 20 30 50 100\nEnter How Much: ");
         int hmload = a.nextInt();
         a.nextLine();
         
         if (hmload == 10 || hmload == 20 || hmload == 30 || hmload == 50 || hmload == 100) {
                String dialogue6 = "\nVendor: Your number, please?";
                typingEffect(dialogue6);
                System.out.print("\n\n  ENTER 9 NUMBERS ONLY. DON'T INCLUDE 09\n"); 
                String dialogue7 = "You: 09"; // printing 09 so that the user won't have to input it and to use only int data type
                typingEffect(dialogue7);
                int numberld = a.nextInt();
                a.nextLine();
                String dialogue8 = "\nVendor: Great, please check your SMS for the confirmation.";
                typingEffect(dialogue8);

                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss"); // to get the current date and time
                String formattedDateTime = now.format(formatter);

                String text = "\n\n!!! PHONE BEEPS !!!";
                typingEffect(text);
                String dialogue9 = "\n\nP" + hmload + ".00 has been loaded to your mobile number " + numberld + ".\nTrace No: 312735765 " + formattedDateTime +".120";
                typingEffect(dialogue9);
            } else {
                String dialogue5 = "\nVender: Sorry, we don't load with that amount.";
                typingEffect(dialogue5);
            }

            System.out.print("\n\nEnter Again? [y/n]: "); 
            ag1 = a.next().charAt(0);
        } while (ag1 == 'y' || ag1 == 'Y');
}
        else if (choice1 == 3) { //Dito
        String dialogue223 = "\nYou: Dito po.";
         typingEffect(dialogue223);
         String dialogue232 = "\nVendor: How much will it be?";
         typingEffect(dialogue232);
         
         char ag1;
         do { // do-while in case the user will input an invalid input
         System.out.print("\n\n10 20 30 50 100\nEnter How Much: ");
         int hmload = a.nextInt();
         a.nextLine();
         
         if (hmload == 10 || hmload == 15 || hmload == 20 || hmload == 30 || hmload == 40 || hmload == 50 || hmload == 100) {
                String dialogue24 = "\nVendor: Your number, please?";
                typingEffect(dialogue24);
                System.out.print("\n\n  ENTER 9 NUMBERS ONLY. DON'T INCLUDE 09\n");
                String dialogue25 = "You: 09";
                typingEffect(dialogue25);
                int numberld = a.nextInt();
                a.nextLine();
                String dialogue26 = "\nVendor: Great, please check your SMS for the confirmation.";
                typingEffect(dialogue26);
                
                String text0 = "\n\n!!! PHONE BEEPS !!!";
                typingEffect(text0);
                String dialogue27 = "\n\nYou've earned 1.00 DITO Point(s) from your load purchase. Your total DITO points is 5.00.\nGo to your DITO APP and tap Rewards to monitor your points.\nhttps://app.dito.ph/rewards";
                typingEffect(dialogue27);
            } else {
                String dialogue28 = "\nVendor: Sorry, we don't load with that amount.";
                typingEffect(dialogue28);
            }

            System.out.print("\n\nEnter Again? [y/n]: ");
            ag1 = a.next().charAt(0);
        } while (ag1 == 'y' || ag1 == 'Y');
   
        } else {
            System.out.print("\nInvalid Input!\n\nEnter Again? [y/n]: ");
            ag2 = a.next().charAt(0);
            continue; // if the condition is met, the continue statement will be used. It causes the loop to skip the rest of its body for the current iteration and jump to the next iteration
        }
            break; // to exit the loop
        } while (ag2 == 'y' || ag2 == 'Y');
}

   private static void handleGameStart2 (Scanner a) {  // this is the second scenario the player will play
      String task1 = "\nAfter loading your phone, the next thing to do is to acquire a television.\nYou and your family then travel to the city proper to visit an appliances store in one of the city malls.";
      typingEffect(task1);
      String task2 = "\nYou've all reached the mall, particularly at the appliances store and begun searching for a television to purchase.\nAfter some time, your mom and the others have found a TV they're interested in, and now they're turning to you for your thoughts.\n\nYour mom asked, \"We liked this one. How about you?\"";
      typingEffect(task2);
      
      char ag2;
      do { // do-while in case the user will input an invalid input
      String task3 = "\n\n      [1] Head nod* I like it. Let's go get it.\n      [2] Headshake* Nah, I don't like it."; // switch statement for multiple options
      typingEffect(task3);
      String task4 = "\n                Enter your Choice: ";
      typingEffect(task4);
      int choice3 = a.nextInt();
      
      switch (choice3) {
      case 1: // head nod
         String task5 = "\nYou checked the price of the television and upon discovering that the price exceeds your budget, you doubted for a second if you'll buy it.";
         typingEffect(task5);
         installmentInq(a);
      break;             
      case 2: // headshake
         String task13 = "\nDespite your family explaining why they liked it, you still didn't find it great.\nConsequently, they began searching again, and eventually, they found a television that is your liking. ";
         typingEffect(task13);
         String task14 = "\nYou liked the second television they're interested in, but upon discovering that the price exceeds your budget, you doubted for awhile if you'll buy it.";
         typingEffect(task14);
         installmentInq(a); // accessing a private static method
      break;
      default:
         String task00 = "\nInvalid Input!\n\nPress Enter to Input Again.";
         typingEffect(task00);
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty()); // to let the user press enter key only instead of inputting something
}
     
      
   private static void installmentInq (Scanner a) { // this is for the second scenario where the player will check on its own on how much monthly payment payable if installment plan will be choosen
         String task6 = "\nOne of the sale person saw you doubting, so he immediately went to offer you the store's installment options.";
         typingEffect(task6);
         
         String task7 = "\n\nSale Person: Hi, we have an installment plan for the television you like.\nYou: Really? Let us hear it.";
         typingEffect(task7);
         String task8 = "\nSale Person: This Samsung UHD 4K AU7002 TV is 37,999 pesos in full poayment, but we have 3 installment plans for you.";
         typingEffect(task8);
         String task9 = "\n\n           WARNING! Task Ahead :)           \n\n";
         typingEffect(task9);
         String task10 = "Sale Person: I will only be giving you the details needed on getting the amount of monthly payment and your task is to use the installment calculator with those details.";
         typingEffect(task10);
         
      char check;
      do {
         String task11 = "\nSale Person: Here are the details. Have fun calculating!";
         typingEffect(task11);
         String task12 = "\n\n                  37,999 price         \n 4,939.87 down payment, 3% interest, 6 months to pay\n 4,179.89 down payment, 5% interest, 12 months to pay\n 3,799.9 down payment, 8% interest, 18 months to pay";
         typingEffect(task12);
         
         System.out.print("\n\n         Samsung UHD 4K AU7002         ");
         System.out.print("\n\n             Price: ");
         double price = a.nextDouble();
         System.out.print("             Down Payment: ");
         double dp = a.nextDouble();
         System.out.print("             %Interest: ");
         double interest = a.nextDouble();
         System.out.print("             Months To Pay: ");
         double monstp = a.nextDouble();
         
         double inter = interest / 100;
         double total = price + interest; // process to get the monthly payable
         double mons = total / monstp;
         
         System.out.printf("\n             Monthly: %.2f", mons); // to print only 2 decimal
         System.out.println();
         System.out.print("\n           Check Again? [y/n]: ");
         check = a.next().charAt(0);
      } while (check == 'Y' || check == 'y'); 
      
         String task22 = "\nAfter hearing the installment plans, you were interested and now you need to make a deccision.";
         typingEffect(task22);
         
         do {
         String task23 = "\n\n         [1] Pay in Full\n         [2] Installment Plan";
         typingEffect(task23);
         String task24 = "\n         How will you pay?: ";
         typingEffect(task24);
         int hwpay = a.nextInt();
         
      if (hwpay == 1) {
         String task25 = "\nYou decided to Pay in Full and now it's time to check the television out!";
         typingEffect(task25);
         String task26 = "\n\nYou: I'm paying in full cash.\nCashier: You're going to pay in full cash. It'll be 37,999 pesos";
         typingEffect(task26);
         String task27 = "\n\nYou handed the money and said \"Thank you\" to the cashier.\n\nCashier: Here's your receipt.";
         typingEffect(task27);
         
         System.out.print("\n\n        Product Name:\n   Samsung UHD 4K AU7002\n\n      (Pricing Details)\n   Original Price: 37,999\n   Amount Due: 38,000\n   Change: 1.00");
         
         String task28 = "\n\nAfter all the transactions, you and your family finally got the television and left the store with a big smile on your faces.";
         typingEffect(task28);    
       } else if (hwpay == 2) {
            installmentSamsung(a);
       } else {
         String task25 = "\nInvalid Input!\n\nPress Enter to Input Again.";
         typingEffect(task25);
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty()); 
}
 
   private static void installmentSamsung (Scanner a) { // this will run if the player decided to avail the installment plan
      String text1 = "\nYou: I want to avail your installment plan.";
      typingEffect(text1);
      String text2 = "\nCashier: Great! Please choose your installment plan.";
      typingEffect(text2);
      
      do { // do-while in case the player will input an invalid input
      String text3 = "\n\n [1] 4,939.87 down payment, 3% interest, 6 months to pay\n [2] 4,179.89 down payment, 5% interest, 12 months to pay\n [3] 3,799.9 down payment, 8% interest, 18 months to pay"; // switch statement for multiple options
      typingEffect(text3);
      String text4 = "\n         Enter your Choice: ";
      typingEffect(text4);
      int choice = a.nextInt();
      
      switch (choice) {
      case 1: // 3
         String text5 = "\nCashhier: Great! Please provide the following information for the contract.";
         typingEffect(text5);
            
         System.out.print("\n\nDate Today: ");
         String date = a.next();
         System.out.print("Customer's Name: ");
         String name = a.next();
         System.out.print("Customer's Address: ");
         String address = a.next();
         
         String mes12 = "\n                                PAYMENT AGREEMENT             \n\nI understand and agree that I am financially responsible for payment of Samsung UHD 4K AU7002\nreceived in the amount stated below. I agree to pay in the time period stated below.";
         typingEffect(mes12);
         String mes22 = "\n\nI understand that any remaining balance not paid in full will accrue a monthly interest.\n\nCustomer Name: " + name + "\nCustomer's Address: " + address + "\n\nPayments shall be deemed deliquent if not received at the payment date.";
         typingEffect(mes22);
         String mes32 = " If any\nscheduled payment related to the agreement is deemed deliquent during the term of\nthe agreement, the agreement shall be considered to be in default, and the entire\namount and interest owed shall be due and payable immediately.";
         typingEffect(mes32);
         
         String text6 = "\n\nCashier: Thank you. Your down payment will be 10% from the full cash price. See details below.";
         typingEffect(text6);
         
         System.out.print("\n\n            Product Name:           ");
         System.out.print("\n         Samsung UHD 4K AU7002           ");
         System.out.print("\n\n          (Pricing Details)           ");
         System.out.print("\n        Original Price: 37,999           ");
         System.out.print("\n        Down Payment: 4,939,87          ");
         System.out.print("\n        Monthly Installment: 6,333.67          ");
         
         String text7 = "\n\nYou: Got it! Here's my down payment. Thank you!";
         typingEffect(text7);
         String text8 = "\n\nAfter all the transactions, you and your family finally got the television and left the store with a big smile on your faces.";
         typingEffect(text8);
      break;
      case 2: // 5
         String text51 = "\nCashhier: Great! Please provide the following information for the contract.";
         typingEffect(text51);
            
         System.out.print("\n\nDate Today: ");
          date = a.next();
         System.out.print("Customer's Name: ");
          name = a.next();
         System.out.print("Customer's Address: ");
          address = a.next();
         
         String mes11 = "\n                                PAYMENT AGREEMENT             \n\nI understand and agree that I am financially responsible for payment of Samsung UHD 4K AU7002\nreceived in the amount stated below. I agree to pay in the time period stated below.";
         typingEffect(mes11);
         String mes21 = "\n\nI understand that any remaining balance not paid in full will accrue a monthly interest.\n\nCustomer Name: " + name + "\nCustomer's Address: " + address + "\n\nPayments shall be deemed deliquent if not received at the payment date.";
         typingEffect(mes21);
         String mes31 = " If any\nscheduled payment related to the agreement is deemed deliquent during the term of\nthe agreement, the agreement shall be considered to be in default, and the entire\namount and interest owed shall be due and payable immediately.";
         typingEffect(mes31);
         
         String text61 = "\n\nCashier: Thank you. Your down payment will be 10% from the full cash price. See details below.";
         typingEffect(text61);
         
         System.out.print("\n\n            Product Name:           ");
         System.out.print("\n         Samsung UHD 4K AU7002           ");
         System.out.print("\n\n          (Pricing Details)           ");
         System.out.print("\n        Original Price: 37,999           ");
         System.out.print("\n        Down Payment: 4,179.89          ");
         System.out.print("\n        Monthly Installment: 3,167          ");
         
         String text71 = "\n\nYou: Got it! Here's my down payment. Thank you!";
         typingEffect(text71);
         String text81 = "\n\nAfter all the transactions, you and your family finally got the television and left the store with a big smile on your faces.";
         typingEffect(text81);
      break;
      case 3: // 8
         String text52 = "\nCashhier: Great! Please provide the following information for the contract.";
         typingEffect(text52);
            
         System.out.print("\n\nDate Today: ");
          date = a.next();
         System.out.print("Customer's Name: ");
          name = a.next();
         System.out.print("Customer's Address: ");
          address = a.next();
         
         String mes1 = "\n                                PAYMENT AGREEMENT             \n\nI understand and agree that I am financially responsible for payment of Samsung UHD 4K AU7002\nreceived in the amount stated below. I agree to pay in the time period stated below.";
         typingEffect(mes1);
         String mes2 = "\n\nI understand that any remaining balance not paid in full will accrue a monthly interest.\n\nCustomer Name: " + name + "\nCustomer's Address: " + address + "\n\nPayments shall be deemed deliquent if not received at the payment date.";
         typingEffect(mes2);
         String mes3 = " If any\nscheduled payment related to the agreement is deemed deliquent during the term of\nthe agreement, the agreement shall be considered to be in default, and the entire\namount and interest owed shall be due and payable immediately.";
         typingEffect(mes3);
         
         String text62 = "\n\nCashier: Thank you. Your down payment will be 10% from the full cash price. See details below.";
         typingEffect(text62);
         
         System.out.print("\n\n            Product Name:           ");
         System.out.print("\n         Samsung UHD 4K AU7002           ");
         System.out.print("\n\n          (Pricing Details)           ");
         System.out.print("\n        Original Price: 37,999           ");
         System.out.print("\n        Down Payment: 3,779.9          ");
         System.out.print("\n        Monthly Installment: 2,111.50          ");
         
         String text72 = "\n\nYou: Got it! Here's my down payment. Thank you!";
         typingEffect(text72);
         String text82 = "\n\nAfter all the transactions, you and your family finally got the television and left the store with a big smile on your faces.";
         typingEffect(text82);
      break;
      default:
         String text92 = "\n\nInvalid Choice!\n\nPress Enter to Choose Again.";
         typingEffect(text92);
         a.nextLine(); 
         continue; 
      }
         break;
      } while (a.nextLine().isEmpty());
}

   private static void handleGameStart3 (Scanner a) { // this is the third and last scenario the player will play
         String three1 = "\nAfter purchasing the television at the appliances store, the next thing to do is take a leisurely stroll at the mall.\nAfter a few minutes, hunger sets in, and your family is taking turns voting where to eat-\nwhether to dine at a restaurant or head home and order online for takeout.";
         typingEffect(three1);
         String three2 = "\n\nEveryone has already given their thoughts on where to eat, now it is your turn to decide.";
         typingEffect(three2);
         
         do {
         System.out.print("\n\n        [1] Dine at a Restaurant\n        [2] Go Home and Order Online\n          What is your choice?: "); // if-else statement for more conditions
         int thchoice = a.nextInt();
         
         if (thchoice == 1) { // dine
            String three3 = "\nYou really wanted to spend the day with your family outside so you chose to dine at a restaurant. ";
            typingEffect(three3);
            String three4 = "\nYou heard about a restaurant renowned for its Bulalo and Goat viands.\nExcited about the prospect of dining there, you invited your family, and they gladly said yes to dine at the restaurant.";
            typingEffect(three4);
            String three5 = "\nYou and your family went to the restaurant, and as soon as you arrived, the restaurant staff warmly welcomed your family.";
            typingEffect(three5);
            String three6 = "\n\nCashier: Welcome to Ramyan's Kambingan and Bulaloan! What's your order?";
            typingEffect(three6);
            
            pointOfSale(a); // calling to access the private static method
            
            String three7 = "\nCashier: Got it! Please choose your table and we’ll serve your food as soon as it’s ready.";
            typingEffect(three7);
            String three8 = "\n\nYou chose a table for dining and patiently awaited the arrival of your food. Once your meal was served, you began to enjoy it.";
            typingEffect(three8);
            String three9 = "\nFollowing your meal, you engaged in a quick chika with your family.\nEventually, you concluded your dining experience and proceeded to settle the bill at the cashier before heading home.";
            typingEffect(three9);
            String three10 = "\n\nAt the cashier...";
            typingEffect(three10);
            String three11 = "\n\nYou: Hi, the food was great. Can I get our bill?\nCashier: We're glad you liked the food. But before I'll give you your bill, I have a challenge for you. The challenge can give you a discount on your bill.";
            typingEffect(three11);
            
            do {
            System.out.print("\n\n        [1] I'll take the challenge.\n        [2] I'm sorry, we have to go now.\n        What is your choice?: "); // if-else statment for complex conditions
            int thhchoice = a.nextInt();
            
               if (thhchoice == 1) {
                  String three12 = "\nYou: Wow! Sure, I'll take the challenge.\nCashier: Great! The challenge is you try to guess your own bill, and you have three attempts.";
                  typingEffect(three12);
                  String three13 = "\n         If you get it right on the first try, you'll enjoy a 25% discount.\n         However, if you don't guess correctly after three attempts, no discount will be applied.\n         Go ahead and make your first guess!";
                  typingEffect(three13);
                  
                  guessBill(a);
                  
               } else if (thhchoice == 2) {
                  String three14 = "\nYou: I'm sorry, we have to go now.";
                  typingEffect(three14);
                  String three15 = "\nCashier: No worries, your total bill is " + totalOrder;
                  typingEffect(three15);
                  
                System.out.print("\n\n               Receipt                 ");
                  System.out.print("\n    Ramyam's Kambingan and Bulaloan    ");
                System.out.print("\n\n       Rice: " + rice + " x " + hwr + " = " + totalRice);
                  System.out.print("\n       Viand: " + viand + " x " + hwv + " = " + totalViand);
                  System.out.print("\n       Drink: " + bev + " x " + hwd + " = " + totalDrink);
                  System.out.print("\n       Dessert: " + des + " x " + hwds + " = " + totalDessert);
                System.out.print("\n\n          Total Bill: " + totalOrder);
                  
                  String three16 = "\n\nYou: Cool, thank you for the amazing food.";
                  typingEffect(three16);
             
               } else {
                  String text92 = "\n\nInvalid Choice!\n\nPress Enter to Choose Again.";
                  typingEffect(text92);
                  a.nextLine(); 
                  continue; 
               }
                  break;
               } while (a.nextLine().isEmpty());
               
          } else if (thchoice == 2) { // online
             String  love = "\nSeeing the exhaustion on everyone's faces, you empathized with the collective weariness and made the relatable choice to call it a day.\nYou decided to head home and just order online for take-out.";
             typingEffect(love);
             String love1 = "\nUpon reaching home, you opened your phone to place an order.";
             typingEffect(love1);
             String love2 = "\n\nOpening Grabe Foode...";
             typingEffect(love2);
             
             grabeFoode(a);
              
           } else {   
               String text92 = "\n\nInvalid Choice!\n\nPress Enter to Choose Again.";
               typingEffect(text92);
               a.nextLine(); 
               continue; 
           }
                break;
           } while (a.nextLine().isEmpty());             
}
      
   private static double totalOrder2 = 0; // declaring separately to utilize variables anywhere; allowing the program to jump not just to go down and read in order
   private static int burger, fries, chick, drink, cb, ccb, cbd, hwb, cf, crf, ctf, hwf, ct, scs, gcw, hwc, cs, cl, t, hwcd, totalBurger = 0, totalFries = 0, totalChick = 0, totalDrink2 = 0;
        
   private static void grabeFoode (Scanner a) {
   
   System.out.print("\n\n          CRAZY DONALD       ");
     System.out.print("\n       We'll Make You Fat!        ");
    
   do { 
   System.out.print("\n\n[1] P90 Crazy Burger\n[2] P120 Crazy Classic Cheeseburger\n[3] P140 Crazy Bacon Deluxe Burger\nChoose a Burger: ");
   burger = a.nextInt();
   
   if (burger == 1) {
      cb = 90;
      System.out.print("How many? ");
      hwb = a.nextInt();
      totalBurger += cb * hwb;
   } else if (burger == 2) {
      ccb = 120;
      System.out.print("How many? ");
      hwb = a.nextInt();
      totalBurger += ccb * hwb;
   } else if (burger == 3) {
      cbd = 140;
      System.out.print("How many? ");
      hwb = a.nextInt();
      totalBurger += cbd * hwb; 
   } else {
      System.out.print("Invalid Input!\nPress Enter to Input Again");        
      a.nextLine(); 
      continue; 
   }
      break; 
   } while (a.nextLine().isEmpty());
   
   do {
   System.out.print("\n\n[1] P45 Crazy Fries\n[2] P65 Crazier Fries\n[3] P85 Craziest Fries\nChoose a Fries: ");
   fries = a.nextInt();
   
   if (fries == 1) {
      cf = 45;
      System.out.print("How many? ");
      hwf = a.nextInt();
      totalFries += cf * hwf;
   } else if (fries == 2) {
      crf = 65;
      System.out.print("How many? ");
      hwf = a.nextInt();
      totalFries += crf * hwf;
   } else if (fries == 3) {
      ctf = 85;
      System.out.print("How many? ");
      hwf = a.nextInt();
      totalFries += ctf * hwf; 
   } else {
      System.out.print("Invalid Input!\nPress Enter to Input Again");        
      a.nextLine(); 
      continue; 
   }
      break; 
   } while (a.nextLine().isEmpty());
   
   do {
   System.out.print("\n\n[1] P150 Crazy Crispy Chicken Tenders\n[2] P135 Crazy Spicy Chicken Sandwich\n[3] P99 Crazy Grilled Chicken Wrap\nChoose a Chicken: ");
   chick = a.nextInt();
   
   if (chick == 1) {
      ct = 45;
      System.out.print("How many? ");
      hwc = a.nextInt();
      totalChick += ct * hwc;
   } else if (chick == 2) {
      scs = 65;
      System.out.print("How many? ");
      hwc = a.nextInt();
      totalChick += scs * hwc;
   } else if (chick == 3) {
      gcw = 85;
      System.out.print("How many? ");
      hwc = a.nextInt();
      totalChick += gcw * hwc; 
   } else {
      System.out.print("Invalid Input!\nPress Enter to Input Again");        
      a.nextLine(); 
      continue; 
   }
      break; 
   } while (a.nextLine().isEmpty());
   
   do {
   System.out.print("\n\n[1] P20 Crazy Soda\n[2] P30 Crazy Lemonade\n[3] P10 Crazy Tubig\nChoose a Drink: ");
   drink = a.nextInt();
   
   if (drink == 1) {
      cs = 20;
      System.out.print("How many? ");
      hwcd = a.nextInt();
      totalDrink2 += cs * hwcd;
   } else if (drink == 2) {
      cl = 30;
      System.out.print("How many? ");
      hwcd = a.nextInt();
      totalDrink2 += cl * hwcd;
   } else if (drink == 3) {
      t = 85;
      System.out.print("How many? ");
      hwcd = a.nextInt();
      totalDrink2 += t * hwcd; 
   } else {
      System.out.print("Invalid Input!\nPress Enter to Input Again");        
      a.nextLine(); 
      continue; 
   }
      break; 
   } while (a.nextLine().isEmpty()); 
   
   totalOrder2 = totalBurger + totalFries + totalChick + totalDrink2; // process
   
             String love3 = "\nCheck Your Order.";
             typingEffect(love3);
             
             System.out.print("\n\n          CRAZY DONALD       ");
               System.out.print("\n       We'll Make You Fat!        ");
              System.out.print("\n\n       Burger: " + burger + " x " + hwb + " = " + totalBurger);
                System.out.print("\n       Fries: " + fries + " x " + hwf + " = " + totalFries);
                System.out.print("\n       Chicken: " + chick + " x " + hwc + " = " + totalChick);
                System.out.print("\n       Drink: " + drink + " x " + hwcd + " = " + totalDrink2);
              System.out.print("\n\n         Subtotal: " + totalOrder2);
              
              String love4 = "\n\nIs your Order Correct? [y/n]: ";
              typingEffect(love4);
              char ordercheck = a.next().charAt(0);
              
              if (ordercheck == 'n' || ordercheck == 'N') {
                  String love5 = "\n\nChange Order? [y/n]: ";
                  typingEffect(love5);
                  char change = a.next().charAt(0);
                
                  if (change == 'y' || change == 'Y') {
                     grabeFoode(a);
                  } else if (change == 'n' || change == 'N') {
                     handleGameEnd3(a);
                  }   
              } else {
                  do {
                  System.out.print("\n[1] 1km - 3km = P15\n[2] 3.5km - 5km = P30\n[3] 5.5km - 7km = P50\nWhere to deliver? ");
                  int deliver = a.nextInt();
                  
                  if (deliver == 1) {                
                     double km1 = totalOrder2 + 15;
                       System.out.print("\n          CRAZY DONALD       ");
                       System.out.print("\n       We'll Make You Fat!        ");
                     System.out.print("\n\n       Burger: " + burger + " x " + hwb + " = " + totalBurger);
                       System.out.print("\n       Fries: " + fries + " x " + hwf + " = " + totalFries);
                       System.out.print("\n       Chicken: " + chick + " x " + hwc + " = " + totalChick);
                       System.out.print("\n       Drink: " + drink + " x " + hwcd + " = " + totalDrink2);
                     System.out.print("\n\n         Subtotal: " + totalOrder2);
                       System.out.print("\n         Delivery Fee: P15 ");
                       System.out.print("\n         Total: " + km1);
                     
                     ending2(a);

                     
                  } else if (deliver == 2) {       
                     double km2 = totalOrder2 + 30;                  
                     System.out.print("\n\n          CRAZY DONALD       ");
                       System.out.print("\n       We'll Make You Fat!        ");
                     System.out.print("\n\n       Burger: " + burger + " x " + hwb + " = " + totalBurger);
                       System.out.print("\n       Fries: " + fries + " x " + hwf + " = " + totalFries);
                       System.out.print("\n       Chicken: " + chick + " x " + hwc + " = " + totalChick);
                       System.out.print("\n       Drink: " + drink + " x " + hwcd + " = " + totalDrink2);
                     System.out.print("\n\n         Subtotal: " + totalOrder2);
                       System.out.print("\n         Delivery Fee: P30 ");
                       System.out.print("\n         Total: " + km2);
                     
                     ending2(a);

                     
                  } else if (deliver == 3) {          
                     double km3 = totalOrder2 + 50;                   
                     System.out.print("\n\n          CRAZY DONALD       ");
                       System.out.print("\n       We'll Make You Fat!        ");
                     System.out.print("\n\n       Burger: " + burger + " x " + hwb + " = " + totalBurger);
                       System.out.print("\n       Fries: " + fries + " x " + hwf + " = " + totalFries);
                       System.out.print("\n       Chicken: " + chick + " x " + hwc + " = " + totalChick);
                       System.out.print("\n       Drink: " + drink + " x " + hwcd + " = " + totalDrink2);
                     System.out.print("\n\n         Subtotal: " + totalOrder2);
                       System.out.print("\n         Delivery Fee: P50 ");
                       System.out.print("\n         Total: " + km3);

                     ending2(a);
                     
                  } else {
                     System.out.print("Invalid Input!\nPress Enter to Input Again");        
                     a.nextLine(); 
                     continue; 
                  }
                     break; 
                  } while (a.nextLine().isEmpty());        
          }
}
   private static void ending2 (Scanner a) { // this will run and will be the ending if the player chooses to order online
   
                  String love6 = "\n\nPlace Order? [y/n] ";
                  typingEffect(love6);
                  char order = a.next().charAt(0); 
                  
                  if (order == 'y' || order == 'Y') {
                     String love7 = "\nGrabe Foode: You order is in the kitchen. We'll let you know it it's out for delivery.";
                     typingEffect(love7);
                     String love8 = "\nGrabe Foode: Your food is on its way. Don't forget to rate your rider.";
                     typingEffect(love8);                    
                     String love9 = "\n\nYour food arrived...";
                     typingEffect(love9);
                     String love10 = "\n\nEveryone’s anticipation peaked as the doorbell rang with the arrival of your delectable feast.\nExcitement filled the air as you unpacked the foods.\nWith smiles all around, your family gathered at the table, savoring each delicious bite, laughter echoing through the room.";
                     typingEffect(love10);
                     String love11 = "\n\nYou're down to the final item on your agenda for the day off.\nHowever, you are so tired already that you decided to take care of yourself and truly have a rest day. \nYou cancelled your last agenda which is to hang out with your friends and went into your room, expressing gratitude to yourself for the enjoyable day.\nNow, it's time to unwind and embrace a restful night's sleep.";
                     typingEffect(love11);
                     
                     System.out.print("\n\n                                THE END :)\n                          THANK YOU FOR PLAYING!\n\n                   by Castaneda, Hanah Julan - BSIT IS-1A");

                  } else {
                     String love5 = "\n\nChange Order? [y/n]: ";
                     typingEffect(love5);
                     char change = a.next().charAt(0);
                
                     if (change == 'y' || change == 'Y') {
                        grabeFoode(a);
                     } else if (change == 'n' || change == 'N') {
                        handleGameEnd3(a);
                     }   
                  }
}

   private static double totalOrder = 0, discountedBill = 0, discount = 0.50; // declaring separately to utilize variables anywhere; allowing the program to jump not just to go down and read in order
   private static int pr, fr, hwr, bl, sl, cal, hwv, bj, pep, md, hwd, hl, lf, mf, hwds, rice, viand, bev, des, totalRice = 0, totalViand = 0, totalDrink = 0, totalDessert = 0; 
   
   private static void pointOfSale (Scanner a) {
      
      do {
      System.out.print("\n\n[1] P10 Plain Rice\n[2] P15 Fried Rice\nChoose a Rice: ");
      rice = a.nextInt();
      
      if (rice == 1) {
         pr = 10;
         System.out.print("How many? ");
         hwr = a.nextInt();
         totalRice += pr * hwr;
      } else if (rice == 2) {
         fr = 15;
         System.out.print("How many? ");
         hwr = a.nextInt();
         totalRice += fr * hwr;
      } else {
         System.out.print("Invalid Input!\nPress Enter to Input Again");        
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty());

      do {
      System.out.print("\n\n[1] P100 Bulalo\n[2] P95 Sinampalokan\n[3] P89 Caldereta\nChoose a Viand: ");
      viand = a.nextInt();
      
      if (viand == 1) {
         bl = 100;
         System.out.print("How many? ");
         hwv = a.nextInt();
         totalViand += bl * hwv;
      } else if (viand == 2) {
         sl = 95;
         System.out.print("How many? ");
         hwv = a.nextInt();
         totalViand += sl * hwv;
      } else if (viand == 3) {
         cal = 89;
         System.out.print("How many? ");
         hwv = a.nextInt();
         totalViand += cal * hwv;
      } else {
         System.out.print("Invalid Input!\nPress Enter to Input Again");        
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty());
    
      do {
      System.out.print("\n\n[1] P15 Buko Juice\n[2] P12 Pepsi\n[3] P12 Mountain Dew\nChoose a Drink: ");
      bev = a.nextInt();
      
      if (bev == 1) {
         bj = 15;
         System.out.print("How many? ");
         hwd = a.nextInt();
         totalDrink += bj * hwd;
      } else if (bev == 2) {
         pep = 12;
         System.out.print("How many? ");
         hwd = a.nextInt();
         totalDrink += pep * hwd;
      } else if (bev == 3) {
         md = 12;
         System.out.print("How many? ");
         hwd = a.nextInt();
         totalDrink += md * hwd;
      } else {
         System.out.print("Invalid Input!\nPress Enter to Input Again");        
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty());
            
      do {
      System.out.print("\n\n[1] P69 Halo Halo\n[2] P80 Leche Flan\n[3] P50 Mango Float\nChoose a Dessert: ");
      des = a.nextInt();
      
      if (des == 1) {
         hl = 69;
         System.out.print("How many? ");
         hwds = a.nextInt();
         totalDessert += hl * hwds;
      } else if (des == 2) {
         lf = 80;
         System.out.print("How many? ");
         hwds = a.nextInt();
         totalDessert += lf * hwds;
      } else if (des == 3) {
         mf = 50;
         System.out.print("How many? ");
         hwds = a.nextInt();
         totalDessert += mf * hwds;
      } else {
         System.out.print("Invalid Input!\nPress Enter to Input Again");        
         a.nextLine(); 
         continue; 
      }
         break; 
      } while (a.nextLine().isEmpty());
      
      totalOrder = totalRice + totalViand + totalDrink + totalDessert;
      discountedBill = totalOrder * discount;
} 
 
   private static void guessBill (Scanner a) { // this will run if the player accepts the challenge in acquiring a discount

        int numberOfGuesses = 3; // the user has only 3 attempts in guessing the amount
        double targetNumber = totalOrder; 
        boolean wonDiscount = false; // this variable could be updated later to true if a discount condition is met, and it would remain false otherwise

        for (int i = 0; i < numberOfGuesses; i++) {
            String game0 = "\n\nEnter your guess: ";
            typingEffect(game0);
            int userGuess = a.nextInt();

            if (userGuess == targetNumber) {
                wonDiscount = true;
                String game1 = "Cashier: Congratulations! You won a 25% discount. Your discounted bill is: " + discountedBill;
                typingEffect(game1);
                
                System.out.print("\n\n               Receipt                 ");
                  System.out.print("\n    Ramyam's Kambingan and Bulaloan    ");
                System.out.print("\n\n        Rice: " + rice + " x " + hwr + " = " + totalRice);
                  System.out.print("\n        Viand: " + viand + " x " + hwv + " = " + totalViand);
                  System.out.print("\n        Drink: " + bev + " x " + hwd + " = " + totalDrink);
                  System.out.print("\n        Dessert: " + des + " x " + hwds + " = " + totalDessert);
                System.out.print("\n\n        Subtotal Bill: " + totalOrder);
                  System.out.print("\n        Discount: " + discount);
                  System.out.print("\n        Total Payable: " + discountedBill);
                
                String game12 = "\n\nYou: Yey! Thanks for the yummy food.";
                typingEffect(game12);  
                
                ending1(a);
                break;
            } 
            
            if (i < numberOfGuesses - 1) { // to be executed if the condition is true
                String game2 = "Cashier: It's okay. You still have " + (numberOfGuesses - i - 1) + " guesses remaining.";
                typingEffect(game2);
            } else {
                String game3 = "\nCashier: I'm sorry, you get no discount.\nYour bill is P" + targetNumber;
                typingEffect(game3);
                String game4 = "\n\nYou: It's okay, Thanks for the delicious food.";
                typingEffect(game4);               
                
                  System.out.print("\n\n               Receipt                 ");
                  System.out.print("\n    Ramyam's Kambingan and Bulaloan    ");
                System.out.print("\n\n         Rice: " + rice + " x " + hwr + " = " + totalRice);
                  System.out.print("\n         Viand: " + viand + " x " + hwv + " = " + totalViand);
                  System.out.print("\n         Drink: " + bev + " x " + hwd + " = " + totalDrink);
                  System.out.print("\n         Dessert: " + des + " x " + hwds + " = " + totalDessert);
                System.out.print("\n\n          Total Bill: " + totalOrder);
                
                ending1(a);
           }
         }
}

   private static void ending1 (Scanner a) { // this is the ending if the player will choose to dine at the restaurant
   
         String go1 = "\n\nYou handed the money and departed from the restaurant wearing a smile, having treated your entire family to an exceptional dining experience filled with delectable dishes.";
         typingEffect(go1);
         String go2 = "\nNow, you make your way back home.";
         typingEffect(go2);
         String love11 = "\n\nYou're down to the final item on your agenda for the day off.\nHowever, you are so tired already that you decided to take care of yourself and truly have a rest day. \nYou cancelled your last agenda which is to hang out with your friends and went into your room, expressing gratitude to yourself for the enjoyable day.\nNow, it's time to unwind and embrace a restful night's sleep.";
         typingEffect(love11);
                     
         System.out.print("\n\n                                THE END :)\n                          THANK YOU FOR PLAYING!\n\n                   by Castaneda, Hanah Julan - BSIT IS-1A");
}

   private static void typingEffect(String text) { // this is the code for the typing effect and it can be applied to String data  
      try {
         for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(10); // the number inside the parenthesis is the speed of the typing effect and you can change it into any number; lower value = fast speed and higher value = slower speed
         }
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   } 
}