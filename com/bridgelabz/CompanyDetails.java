package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyDetails {

        ArrayList<EmployeeDetails> employeeDetails;

        {
            employeeDetails = new ArrayList<>();
        }

        Scanner sc =new Scanner(System.in);

        public CompanyDetails() {
        }

        public EmployeeDetails addDetails(){
            EmployeeDetails person =new EmployeeDetails();
            System.out.println("Enter Name of the employee: ");
            person.setEmpName(sc.nextLine());
            System.out.println("Enter the age of employee: ");
            person.setAge(sc.nextLine());
            System.out.println("Enter the Phone Number of the person: ");
            person.setPhoneNumber(sc.nextLine());
            System.out.println("City: ");
            person.setCity(sc.nextLine());
            System.out.println("State: ");
            person.setState(sc.nextLine());
            System.out.println("Department of employee: ");
            person.setDepartment(sc.nextLine());
            System.out.println("Create the new Contact");
            return person;
        }
        public void addContacts(){
            EmployeeDetails addContacts =addDetails();
            employeeDetails.add(addContacts);
            System.out.println();
            System.out.println("Added successfully");
        }
        public void edit(){
            boolean isContactFound=false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of the person: ");
            int name =sc.nextInt();
            System.out.println("For Update: ");
            System.out.println("\n a)EmpName \n b)Age \n c)PhoneNumber \n d)City \n e) State \n f) Department");
            char update =sc.next().charAt(0);
            switch (update){
                case 'a':{
                    String updated = sc.nextLine();
                    String EmpName =updated;
                    System.out.println("Name is updated");
                    break;
                }
                case 'b': {
                    String updated = sc.nextLine();
                    String Age = updated;
                    System.out.println("Age is updated");
                    break;
                }
                case 'c':
                {
                    String updated = sc.nextLine();
                    String Phonenumber =updated;
                    System.out.println("Phonenumber is updated");
                    break;
                }
                case 'd':{
                    String updated = sc.nextLine();
                    String City =updated;
                    System.out.println("city is updated");
                    break;
                }
                case 'f':{
                    String updated = sc.nextLine();
                    String State =updated;
                    System.out.println("State is updated");
                    break;
                }
                case 'g':{
                    String updated = sc.nextLine();
                    String Department =updated;
                    System.out.println("Department is updated");
                    break;
                } default:{
                    System.out.println("No changes needed");
                }
                if (isContactFound){
                    System.out.println("contact uploaded successfully");
                }else {
                    System.out.println("contact not found");
                }
            }
        }
        void displayContact(){
            for (EmployeeDetails person : employeeDetails){
                System.out.println(person);
            }
        }
    }




