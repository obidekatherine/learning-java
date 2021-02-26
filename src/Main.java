 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("jude","Fred","Art",3.70,2023);
        StudentProfile profileTwo = new StudentProfile("Simone","Hastings","Science",3.85,2022);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);  


    //***********************************************************************//

    //public static void main(String[] args) {
        //Triangle triangleA = new Triangle(15, 8,15, 8,17);
        //Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

       // double triangleAArea = triangleA.findArea();
      //  System.out.println(triangleAArea);

       // double triangleBArea = triangleB.findArea();
        //System.out.println(triangleBArea);

       // System.out.println(triangleA.sideLenThree);
       // System.out.println(triangleB.base);

        //System.out.println(Triangle.numOfSides);

        //Triangle.findreal()? --> Math.pow(2,3)?



//****************************************************************************************************//

    //public static double salaryCalculator(double hoursPerWeek,double amountPerHour,int vacationDays) {
       // if (hoursPerWeek < 0) {
        //    return -1;
        //}

        //if (amountPerHour < 0) {
        //    return -1;
       // }

       // double weeklyPaycheck = hoursPerWeek * amountPerHour;
      //  double unPaidTime = vacationDays * amountPerHour * 8;
       // return (weeklyPaycheck * 52) - unPaidTime;
    //}

    //public static void main(String[] args) {
        //double salary = salaryCalculator(40,15, 8);
        //System.out.println(salary);


//********************************************************************************************************//

  //  public static double calculateTotalMealPrice(double listedMealPrice,double tipRate,double taxRate) {
     //   double tip = tipRate * listedMealPrice;
     //   double tax  = taxRate * listedMealPrice;
     //   double result = listedMealPrice + tip + tax;
     //   return result;
  //  }

    //public static void main(String[] args) {
      //  double groupTotalMealPrice = calculateTotalMealPrice(100,.2,.08);
       // System.out.println(groupTotalMealPrice);

        //double individualMealPrice =  groupTotalMealPrice / 5;
        //System.out.println(individualMealPrice);





//************************************************************************************************************//

   // public static void calculateTotalMealPrice(double listedMealPrice,double tipRate,double taxRate) {
        //double tip = tipRate * listedMealPrice;
       // double tax  = taxRate * listedMealPrice;
        //double result = listedMealPrice + tip + tax;
        //System.out.println("Your total meal price is " + result);
   // }

    //public static void main(String[] args) {
        //calculateTotalMealPrice(15, .2, .08);
        //calculateTotalMealPrice(25, .18, .08);


//*******************************************************************************//


   // public static void announceDeveloperTeaTime() {
       // System.out.println("Waiting for developer tea time...");
       // System.out.println("Type in a random word and press Enter to start developer tea time");
       // Scanner input = new Scanner(System.in);
        //input.next();
       // System.out.println("It's developer tea time!");
    //}

    //public static void main(String[] args) {
       // System.out.println("Welcome to your new job");

       // announceDeveloperTeaTime();

       // System.out.println("Write code");
       // System.out.println("Review code");

       // announceDeveloperTeaTime();

       // System.out.println("Get promoted!");






//**********************************************************************************//

        //System.out.println("Let's calculate the area of a triangle");

        //Scanner input = new Scanner(System.in);

        //System.out.println("Please input the base of the triangle (in inches).");
        //double base = input.nextDouble();

        //while (base <= 0) {
          //  System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            //base = input.nextDouble();
        //}
        //System.out.println("Please input the height of the triangle (in inches).");
        //double height =  input.nextDouble();
        //while (height <= 0) {
          //  System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            //height = input.nextDouble();
       // }

        //double area = (base * height) / 2;
        //System.out.println("The area is " + area);



//*******************************************************************************//

        // String question = "What is the largest planet in our solar system?";
       // String choiceOne = "earth";
        //String choiceTwo = "jupiter";
       // String choiceThree = "saturn";

       // String correctAnswer = choiceTwo;

        //System.out.println(question);

        //System.out.println("Choose one of the following: " +choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

       // Scanner scanner = new Scanner(System.in);

       // String input = scanner.next();

       // if(correctAnswer.equals(input.toLowerCase())) {
           // System.out.println("Congrats! That's the correct answer");
        //} else {
          //  System.out.println("You are incorrect. The correct answer is " + correctAnswer);
      //  }


//*****************************************************************************************//
        // Scanner input = new Scanner(System.in);
        //boolean isOnRepeat = true;
        //while(isOnRepeat) {
            //System.out.println("Playing current song");
            //System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            //String userInput =input.next();

            //if(userInput.equals("yes")) {
                //isOnRepeat = false;
            //}
        //}
        //System.out.println("Playing next song");


//***********************************************************************************//


        //System.out.println("Pick a number between 1 and 10");
        //Scanner scanner = new Scanner(System.in);

        //int inputtedNum = scanner.nextInt();

        //if (inputtedNum < 5) {
            //System.out.println("Enjoy the good luck a friend brings you");
        //} else {
            //System.out.println("Your shoe selection will make you very happy today");
        //}


//***************************************************************************************//

        //double studentGPA =3.45;
       // String studentFirstName = "Kayla";
        //String studentLastName = "Hings";
        //System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        //System.out.println("What do you want to Update it to?");

        //Scanner input = new Scanner(System.in);
        //studentGPA =  input.nextDouble();

        //System.out.println(studentFirstName + " " + studentLastName +" now has a GPA of " + studentGPA);

        
//********************************************************************************//

        //int studentAge = 15
        //double studentGPA =3.45;
        //char studentFirstInitial = 'K';
        //char studentLastInitial = 'H';
        //boolean hasPerfectAttendance = true;
        //String stuentName = "Kayla Hings";

        //System.out.println(studentAge);
        //System.out.println(studentGPA);
        //System.out.println(studentFirstInitial);
        //System.out.println(studentLastInitial);
        //System.out.println(hasPerfectAttendance);
        //System.out.println(stuentName);
    }
}
