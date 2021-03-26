import java.util.Scanner;
public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    public void milestone1(int num1, int num2){        
        if(num1 < num2){
            for(int i = num1+1; i < num2; i++){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                    if(i % num1 == 0){
                        break;
                    }            
                }
            }
        }
        else{
            for(int i = num2+1; i < num1; i++){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                    if(i % num2 == 0){
                        break;
                    }            
                }
            }
        }
        System.out.println();
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner){
        int sum = 0;
        double avg = 0;
        double count = 0;
        System.out.println("Enter some numbers:");
        while(true){
            int num = scanner.nextInt();
            if(num < 0){
                break;
            }
            sum += num;
            count++;
        }
        avg = sum / count;
        System.out.println("The average is: " + String.format("%.2f", avg));
    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }
}