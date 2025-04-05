import java.util.Scanner;
import java.io.*;
public class CUSTOMERSUPPORTBOT {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Hello, Welcome to the Customer Support Chatbot for IT101 Shoe Store  |");
        System.out.println("What is your concern:                                                |");
        System.out.println("a. Ordering Concern                                                  |");
        System.out.println("b. Payment Concern                                                   |");
        System.out.println("c. Delivery Concern                                                  |");
        System.out.println("d. Return/Refund Concern                                             |");
        System.out.println("e. Available Shoes                                                   |");
        System.out.println("---------------------------------------------------------------------|");
        System.out.println("Type ex to exit the chatbot                                          |");
        System.out.println("---------------------------------------------------------------------|");
        System.out.println(" ");
        while (true) {
            System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("                                            | (Type ex to exit the chatbot)             |");
            System.out.print("                                            | Type the letter of your concern: ");
            if (sc.hasNextLine()) {
                String concern = sc.nextLine();
                System.out.println("                                            |                                           |");
                System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                System.out.println(" ");
                switch (concern) {
                    case "a":
                        System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                        System.out.println("                                            | What is your question about ordering?      |");
                        System.out.print("                                            | Question: ");
                        String question = sc.nextLine();
                        System.out.println("                                            |                                            |");
                        System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
                        System.out.println(" ");
                        if (question.toUpperCase().contains("HOW TO") || question.toUpperCase().contains("STEPS") || question.toUpperCase().contains("HOW DO") || question.toUpperCase().contains("HOW") || question.toUpperCase().contains("HAVE") || question.toUpperCase().contains("PHYSICAL")) {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("Hello! These are the steps on how to otder                                   |");
                            System.out.println("Steps to Order:                                                              |");
                            System.out.println("1. Provide a screenshot of the shoes you want                                |");
                            System.out.println("2. If the shoe model and the shoe size is available, proceed to the next step|");
                            System.out.println("3. Fill out the customer details form (Name, Address, Contact #)             |");
                            System.out.println("4. Submit the form and proceed to the next step                              |");
                            System.out.println("5. Send the total payment to 0955-782-0897 (P**LO S.)                        |");
                            System.out.println("6. Wait for the notification that your order has been shipped                |");
                            System.out.println("7. If you wish to order in person, please visit our physical store at 17th   |");
                            System.out.println("Street, Nazareth, Cagayan de Oro City                                        |");
                            System.out.println("------------------------------------------------------------------------------");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question.toUpperCase().contains("NOT") || question.toUpperCase().contains("RECEIVED") || question.toUpperCase().contains("ARRIVED") || question.toUpperCase().contains("HASN'T")) {
                            System.out.println("------------------------------------------------------------------------------");
                            System.out.println("Hello! If your order has not arrived during the estimated time, Please contact|");
                            System.out.println("your courier service                                                          |");
                            System.out.println("If your order still has not arrived after reaching out to your courier service|");
                            System.out.println("please seek additional support from our support team                          |");
                            System.out.println("------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question.toUpperCase().contains("MANY") || question.toUpperCase().contains("MULTIPLE") || question.toUpperCase().contains("MORE THAN ONE") || question.toUpperCase().contains("DISCOUNT")) {
                            System.out.println("------------------------------------------------------------------------------");
                            System.out.println("Hello! These is the discount chart for our store for multiple orders          |");
                            System.out.println("Discount Chart:                                                               |");
                            System.out.println("2 purchases - 5% Discount                                                     |");
                            System.out.println("If you purchase 4 pairs at once, you will receive an extra pair of your choice|");
                            System.out.println("------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else {
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("                                                                             |");
                            System.out.println("I'm sorry, we could not find a solution for your problem, Please try again   |");
                            System.out.println("                                                                             |");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("a. Ordering Concern                                                          |");
                            System.out.println("b. Payment Concern                                                           |");
                            System.out.println("c. Delivery Concern                                                          |");
                            System.out.println("d. Return/Refund Concern                                                     |");
                            System.out.println("e. Available Shoes                                                           |");
                            System.out.println("-----------------------------------------------------------------------------|");
                        }
                        break;
                    case "b":
                        System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                        System.out.println("                                            | What is your question about payment?      |");
                        System.out.print("                                            | Question: ");
                        String question1 = sc.nextLine();
                        System.out.println("                                            |                                           |");
                        System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                        System.out.println(" ");
                        if (question1.toUpperCase().contains("MODES") || question1.toUpperCase().contains("CARD") || question1.toUpperCase().contains("COD") || question1.toUpperCase().contains("CASH ON DELIVERY") || question1.toUpperCase().contains("BANK") || question1.toUpperCase().contains("ONLINE") || question1.toUpperCase().contains("PAYMAYA") || question1.toUpperCase().contains("GCASH") || question1.toUpperCase().contains("CAN") || question1.toUpperCase().contains("WITH")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! These are the modes of payment for our store                                |");
                            System.out.println("Modes of Payment:                                                                  |");
                            System.out.println("Cash on Delivery (Only for Mindanao Area)                                          |");
                            System.out.println("Online Payment Options: GCash, Paymaya, Online Bank Transfer like BPO and Landbank |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question1.toUpperCase().contains("SHIPPING FEE") || question1.toUpperCase().contains("SHIPPING") || question1.toUpperCase().contains("AREA") || question1.toUpperCase().contains("LUZON") || question1.toUpperCase().contains("VISAYAS") || question1.toUpperCase().contains("MINDANAO") || question1.toUpperCase().contains("CITY") || question1.toUpperCase().contains("MUCH")) {
                            System.out.println("------------------------------------------------------------------------------");
                            System.out.println("Hello! These are the shipping fees per area                                   |");
                            System.out.println("Shipping Fee Chart:                                                           |");
                            System.out.println("Mindanao Area - 70PHP                                                         |");
                            System.out.println("Visayas Area - 120PHP                                                         |");
                            System.out.println("Luzon Area - 150PHP                                                           |");
                            System.out.println("------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else {
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("                                                                             |");
                            System.out.println("I'm sorry, we could not find a solution for your problem, Please try again   |");
                            System.out.println("                                                                             |");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("a. Ordering Concern                                                          |");
                            System.out.println("b. Payment Concern                                                           |");
                            System.out.println("c. Delivery Concern                                                          |");
                            System.out.println("d. Return/Refund Concern                                                     |");
                            System.out.println("e. Available Shoes                                                           |");
                            System.out.println("-----------------------------------------------------------------------------|");
                        }
                        break;
                    case "c":
                        System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
                        System.out.println("                                            | What is your question about delivery?     |");
                        System.out.print("                                            | Question: ");
                        String question2 = sc.nextLine();
                        System.out.println("                                            |                                           |");
                        System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                        System.out.println(" ");
                        if (question2.toUpperCase().contains("WHEN") || question2.toUpperCase().contains("LONG") || question2.toUpperCase().contains("HOW LONG") || question2.toUpperCase().contains("WEEKS") || question2.toUpperCase().contains("ESTIMATED") || question2.toUpperCase().contains("DAYS")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! These are the estimated days for delivery per area                          |");
                            System.out.println("Estimated days for delivery:                                                       |");
                            System.out.println("Mindanao Area: 1 - 2 days                                                          |");
                            System.out.println("Visayas Area: 3 - 5 days                                                           |");
                            System.out.println("Luzon Area: 5 - 7 days                                                             |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;                            
                        }
                        else if (question2.toUpperCase().contains("TRACK") || question2.toUpperCase().contains("WAYBILL") || question2.toUpperCase().contains("COURIER") || question2.toUpperCase().contains("JNT") || question2.toUpperCase().contains("J&T") || question2.toUpperCase().contains("NINJAVAN") || question2.toUpperCase().contains("LALAMOVE")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! This is how to track your order                                             |");
                            System.out.println("Steps to tracking orders:                                                          |");
                            System.out.println("1. A waybill will be sent once your order has been shipped                         |");
                            System.out.println("2. You can track your order on the J&T Website or App                              |");
                            System.out.println("3. Head to the tracking section and enter your waybill to track                    |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question2.toUpperCase().contains("DO") || question2.toUpperCase().contains("SHIP") || question2.toUpperCase().contains("DELIVER") || question2.toUpperCase().contains("DELIVER TO") || question2.toUpperCase().contains("WHERE")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! To answer your question, we deliver to anywhere nationwide                  |");
                            System.out.println("                                                                                   |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else {
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("                                                                             |");
                            System.out.println("I'm sorry, we could not find a solution for your problem, Please try again   |");
                            System.out.println("                                                                             |");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("a. Ordering Concern                                                          |");
                            System.out.println("b. Payment Concern                                                           |");
                            System.out.println("c. Delivery Concern                                                          |");
                            System.out.println("d. Return/Refund Concern                                                     |");
                            System.out.println("e. Available Shoes                                                           |");
                            System.out.println("-----------------------------------------------------------------------------|");
                        }
                        break;
                    case "d":
                        System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                        System.out.println("                                            | What is your question about returning/refunding?  |");
                        System.out.print("                                            | Question: ");
                        String question3 = sc.nextLine();
                        System.out.println("                                            |                                                   |");
                        System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                        System.out.println(" ");
                        if (question3.toUpperCase().contains("RETURN") || question3.toUpperCase().contains("RECEIVED") || question3.toUpperCase().contains("REFUND") || question3.toUpperCase().contains("POLICY") || question3.toUpperCase().contains("DAMAGE")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! This is the return/refund policy of our store                               |");
                            System.out.println("ITEMS CAN BE RETURNED/REFUNDED IF:                                                 |");
                            System.out.println("a. Item is damaged                                                                 |");
                            System.out.println("b. Item is of the wrong size                                                       |");
                            System.out.println("c. Item is in the wrong colorway                                                   |");
                            System.out.println("ITEMS CANNOT BE RETURNED/REFUNDED IF:                                              |");
                            System.out.println("a  Item has been worn outside of the customer's home                               |");
                            System.out.println("b. Item has been worn more than once                                               |");
                            System.out.println("                                                                                   |");
                            System.out.println("If you wish to avail for a refund please contact us on our page                    |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("Type ex to exit the chatbot                                                  |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question3.toUpperCase().contains("SWITCH") || question3.toUpperCase().contains("SWAP") || question3.toUpperCase().contains("CHANGE") || question3.toUpperCase().contains("DIFFERENT")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! To answer your question, You can only switch/swap your item if:             |");
                            System.out.println("a. Item is unused                                                                  |");
                            System.out.println("b. Item is of the wrong size                                                       |");
                            System.out.println("c. Item is in the wrong colorway                                                   |");
                            System.out.println("d. Any other valid reason                                                          |");
                            System.out.println("If your concern does not belong to said categories, you cannot swap your item      |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("Type ex to exit the chatbot                                                  |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else {
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("                                                                             |");
                            System.out.println("I'm sorry, we could not find a solution for your problem, Please try again   |");
                            System.out.println("                                                                             |");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("a. Ordering Concern                                                          |");
                            System.out.println("b. Payment Concern                                                           |");
                            System.out.println("c. Delivery Concern                                                          |");
                            System.out.println("d. Return/Refund Concern                                                     |");
                            System.out.println("e. Available Shoes                                                           |");
                            System.out.println("-----------------------------------------------------------------------------|");
                        }
                        break;
                    case "e":
                        System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                        System.out.println("                                            | What is your question about the available shoes   |");
                        System.out.print("                                            | Question: ");
                        String question4 = sc.nextLine();
                        System.out.println("                                            |                                                   |");
                        System.out.println("                                            |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                        System.out.println(" ");
                        if (question4.toUpperCase().contains("SHOES") || question4.toUpperCase().contains("AVAILABLE") || question4.toUpperCase().contains("MODEL") || question4.toUpperCase().contains("PAIRS") || question4.toUpperCase().contains("HAVE") || question4.toUpperCase().contains("HOW")) {
                            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
                            System.out.println("|                                                                                         |");
                            System.out.println("| The current available shoes for our store are:                                          |");
                            System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
                            System.out.println("|     Brand     |     Models     |       Colorways       |     Sizes      |   Price       |");
                            System.out.println("| _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _|");
                            System.out.println("|               |    Spezial     |       Blue, Red       | 38, 39, 43, 45 |   P5,800.00   |");
                            System.out.println("|               |----------------|-----------------------|----------------|---------------|");
                            System.out.println("|     Adidas    |     Samba      |     Black, White      | 36, 41, 42, 43 |   P6,800.00   |");
                            System.out.println("|               |----------------|-----------------------|----------------|---------------|");
                            System.out.println("|               |    Gazelle     |        Black          |   43, 44, 45   |   P5,400.00   |");
                            System.out.println("| _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _|");
                            System.out.println("|               |                |                       |                |               |");
                            System.out.println("|      New      |    NB 1906R    |  White Metallic Gold  | 38, 39, 41, 44 |   P10,485     |");
                            System.out.println("|               |----------------|-----------------------|----------------|---------------|");
                            System.out.println("|    Balance    |     NB 530     |   White Silver Navy   |     37, 45     |   P6,200      |");
                            System.out.println("| _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ |");
                            System.out.println("|               |                |                       |                |               |");
                            System.out.println("|               | Gel Kayano 14  |  Cream Black, Black   |   41, 43, 45   |   P12,800     |");
                            System.out.println("|     Asics     |----------------|-----------------------|----------------|---------------|");
                            System.out.println("|               |   Gel - NYC    |     Oyster Grey       |     43, 45     |   P11,850     |");
                            System.out.println("| _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _|");
                            System.out.println("|               |                |                       |                |               |");
                            System.out.println("|               |   Vomero - 5   | Photon Dust, Wolf Grey| 39, 41, 43, 44 |   P7,200      |");
                            System.out.println("|     Nike      |----------------|-----------------------|----------------|---------------|");
                            System.out.println("|               |   P - 6000     |    Metallic Silver    |       45       |   P5,200      |");
                            System.out.println("| _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("Type ex to exit the chatbot                                                  |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else if (question4.toUpperCase().contains("RESTOCK") || question4.toUpperCase().contains("RE-STOCK") || question4.toUpperCase().contains("WHEN")) {
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Hello! To answer your question, Our store re-stocks twice every month to ensure    |");
                            System.out.println("that our clients will find what they're looking for.                               |");
                            System.out.println("                                                                                   |");
                            System.out.println("Please check again in a couple days/weeks                                          |");
                            System.out.println("-----------------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("                                          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                            System.out.println("                                          |                                                                        |");
                            System.out.print("                                          | I hope we answered your question, do you have any other concerns?: ");
                            String followup = sc.nextLine();
                            if (followup.toUpperCase().contains("YE")) {
                                System.out.println("                                          |                                                                        |");
                                System.out.println("                                          | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("Type ex to exit the chatbot                                                  |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println(" ");
                            }
                            else if (followup.toUpperCase().contains("N")) {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                                System.out.println("                                                                             |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                return;
                            }
                            else {
                                System.out.println("                                                                                                                   |");
                                System.out.println("                                            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
                                System.out.println(" ");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("                                                                             |");
                                System.out.println("Invalid Input, Please try again                                              |");
                                System.out.println("-----------------------------------------------------------------------------|");
                                System.out.println("a. Ordering Concern                                                          |");
                                System.out.println("b. Payment Concern                                                           |");
                                System.out.println("c. Delivery Concern                                                          |");
                                System.out.println("d. Return/Refund Concern                                                     |");
                                System.out.println("e. Available Shoes                                                           |");
                                System.out.println("-----------------------------------------------------------------------------|");
                            }
                            break;
                        }
                        else {
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("                                                                             |");
                            System.out.println("I'm sorry, we could not find a solution for your problem, Please try again   |");
                            System.out.println("                                                                             |");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println(" ");
                            System.out.println("-----------------------------------------------------------------------------|");
                            System.out.println("a. Ordering Concern                                                          |");
                            System.out.println("b. Payment Concern                                                           |");
                            System.out.println("c. Delivery Concern                                                          |");
                            System.out.println("d. Return/Refund Concern                                                     |");
                            System.out.println("e. Available Shoes                                                           |");
                            System.out.println("-----------------------------------------------------------------------------|");
                        }
                        break;
                    case "ex":
                        System.out.println("-----------------------------------------------------------------------------|");
                        System.out.println("                                                                             |");
                        System.out.println("Thank you for using our chatbot, I hope we solved your problem               |");
                        System.out.println("                                                                             |");
                        System.out.println("-----------------------------------------------------------------------------|");
                        return;
                    default:
                        System.out.println("-----------------------------------------------------------------------------|");
                        System.out.println("                                                                             |");
                        System.out.println("Invalid Input, Please try again                                              |");
                        System.out.println("-----------------------------------------------------------------------------|");
                        System.out.println("a. Ordering Concern                                                          |");
                        System.out.println("b. Payment Concern                                                           |");
                        System.out.println("c. Delivery Concern                                                          |");
                        System.out.println("d. Return/Refund Concern                                                     |");
                        System.out.println("e. Available Shoes                                                           |");
                        System.out.println("-----------------------------------------------------------------------------|");
                    }
            }
            else {
                System.out.println("Invalid Input, Please try again");
            }
            
        }
    }
}