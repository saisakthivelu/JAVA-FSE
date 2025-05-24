import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//  1.Hello World Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
// 2. Simple Calculator
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice!!!");
        }
        scanner.close();
    }
}

//3. Even or Odd Checker
import java.util.Scanner;
 class HelloWorld{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println(num+" is an Even Number");
        }
        else{
            System.out.println(num+" is an Odd Number");
        }
    }
}

//Leap Year Checker
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}

// 5. Multiplication Table
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int val=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" X "+val+" = "+i*val);
        }
        sc.close();
    }
}

//6. Data Type Demonstration
public class HelloWorld {
    public static void main(String[] args) {
        int inte = 42;
        float Float = 3.14f;
        double Double = 3.1415926535;
        char Char = 'A';
        boolean Boolean = true;
        System.out.println("int value: " + inte);
        System.out.println("float value: " + Float);
        System.out.println("double value: " + Double);
        System.out.println("char value: " + Char);
        System.out.println("boolean value: " + Boolean);
    }
}
//7. Type Casting Example
public class HelloWorld {
    public static void main(String[] args) {
        int inte = 25;
        double Double = (double) inte;
        double Double2 = 9.78;
        int inte2 = (int) Double2;
        System.out.println("Original double value: " + Double2);
        System.out.println("After casting to int: " + inte2);
        System.out.println("Original int value: " + inte);
        System.out.println("After casting to double: " + Double);
    }

//8. Operator Precedence
public class HelloWorld {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        // Multiplication (*) has higher precedence than addition (+)
        // So: 10 + (5 * 2) = 10 + 10 = 20

        int result2 = (10 + 5) * 2;
        // Parentheses have the highest precedence
        // So: (10 + 5) = 15, then 15 * 2 = 30

        int result3 = 100 / 10 + 5 - 3;
        // Division (/) comes first, then addition (+) and subtraction (-) left to right
        // So: (100 / 10) = 10, 10 + 5 = 15, 15 - 3 = 12

        int result4 = 10 + 4 * 3 / 2 - 1;
        // First: 4 * 3 = 12, then 12 / 2 = 6
        // So: 10 + 6 - 1 = 15
        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        System.out.println("Result of 100 / 10 + 5 - 3 = " + result3);
        System.out.println("Result of 10 + 4 * 3 / 2 - 1 = " + result4);
    }
}

//9. Grade Calculator
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark scored out of 100: ");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("You got A grade");
        } else if (mark >= 80) {
            System.out.println("You got B grade");
        } else if (mark >= 70) {
            System.out.println("You got C grade");
        } else if (mark >= 60) {
            System.out.println("You got D grade");
        } else if (mark >= 0) {
            System.out.println("You got F grade");
        } else {
            System.out.println("Invalid input. Marks must be between 0 and 100.");
        }

        sc.close();
    }
}

//10. Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + target);
                break;
            }
        }
        sc.close();
    }
}


//11. Factorial Calculator
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
            int res = 1;
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            System.out.println("Factorial of " + num + " is: " + res);
        sc.close();
    }
}

// 12. Method Overloading
public class HelloWorld {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(10, 20));
        System.out.println("Sum of two doubles: " + add(5.5, 4.5));
        System.out.println("Sum of three integers: " + add(1, 2, 3));
    }
}
// 13. Recursive Fibonacci
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=get.nextInt();
        int res;
        int first =0;
        int second =1;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n,first,second));
    }
    static int fibonacci(int n, int first, int second) {
        if (n == 0)
            return first;
        if (n == 1)
            return second;
        return fibonacci(n - 1, second, first + second);
    }
}
// 14. Array Sum and Average
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

// 15. String Reversal
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String ");
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        String res=str.toString();
        System.out.println("Reversed string is: "+res);
    }
}

// 16. Palindrome Checker
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
    }
}

//17. Class and Object Creation
class car{
    String make;
    String model;
    int year;
    void display(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}
class  HelloWorld{
    public static void main(String[] args) {
        car car1=new car();
        car1.make="Suzuki";
        car1.model="Swift";
        car1.year=2020;
        car1.display();
    }
}

//18. Inheritance Example
class Animal{
    void Makesound(){
        System.out.println("Some sounds");
    }
}
class Dog extends Animal {
    void Makesound(){
        System.out.println("Bark!!!");
    }
}
class HelloWorld{
    public static void main(String[] args) {
        Animal a=new Animal();
        Dog b=new Dog();
        a.Makesound();
        b.Makesound();
    }
}

// 19. Interface Implementation
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}

//
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter second integer: ");
        int second = sc.nextInt();
        try {
            int result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

//21. Custom Exception
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Access granted.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

// File Writing
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String input = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        sc.close();
    }
}

//23. File Reading
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

//24. ArrayList Example
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many student names do you want to enter: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            students.add(sc.nextLine());
        }
        System.out.println("Student names: ");
        for(String str:students){
            System.out.println(str);
        }
    }
}

//Hashmap example
import java.util.Map;
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many students do you want to enter: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            map.put(id,name);
        }
        System.out.println("enter id to search: ");
        int search=sc.nextInt();
        if(map.containsKey(search)){
            System.out.println("Student name: "+map.get(search));
        }
        else{
            System.out.println("Student id not found");
        }
    }
}

// 26. Thread Creation
class MyThread extends Thread {
    String message;

    MyThread(String msg) {
        this.message = msg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 is running");
        MyThread t2 = new MyThread("Thread 2 is running");

        t1.start();
        t2.start();
    }
}

// 27.Lambda Expressions
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sakthi");
        names.add("Sai");
        names.add("Velu");
        names.add("Vel");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
// 28.stream API
import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}

// 29. Records (Java 16+)
import java.util.*;
        import java.util.stream.Collectors;

record Person(String name, int age) {}

public class HelloWorld {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ravi", 22),
                new Person("Anita", 17),
                new Person("Kiran", 30)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
// 30. Pattern Matching for switch (Java 21)
public class HelloWorld {
    public static void main(String[] args) {
        printTypeInfo("hello");
        printTypeInfo(42);
        printTypeInfo(3.14);
        printTypeInfo(true);
    }

    static void printTypeInfo(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            default -> System.out.println("Unknown type");
        }
    }
}

//31. Basic JDBC Connection
import java.sql.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root@123");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        }
        rs.close();
        stmt.close();
        con.close();
    }
}
//32. Insert and Update Operations in JDBC
import java.sql.*;

class StudentDAO {
    Connection con;

    StudentDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root@123");
    }

    void insertStudent(int id, String name) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO students(id, name) VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        ps.close();
    }

    void updateStudent(int id, String name) throws SQLException {
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();
    }

    void close() throws SQLException {
        con.close();
    }
}

//33. Transaction Handling in JDBC
import java.sql.*;

public class HelloWorld {
    public static void transferMoney(Connection con, int fromId, int toId, int amount) throws SQLException {
        try {
            con.setAutoCommit(false);
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setInt(1, amount);
            debit.setInt(2, fromId);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setInt(1, amount);
            credit.setInt(2, toId);
            credit.executeUpdate();

            con.commit();
        } catch (SQLException e) {
            con.rollback();
            throw e;
        } finally {
            con.setAutoCommit(true);
        }
    }
}

//34. Create and Use Java Modules
module com.utils {
        exports com.utils;
        }
        package com.utils;

public class StringUtils {
    public static String greet(String name) {
        return "Hello, " + name;
    }
}
    module com.greetings {
        requires com.utils;
        }
        package com.greetings;

        import com.utils.StringUtils;

public class GreetingApp {
    public static void main(String[] args) {
        System.out.println(StringUtils.greet("User"));
    }
}
//35. TCP Client-Server Chat
//server.java
import java.net.*;
        import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client: " + line);
            System.out.print("Server: ");
            String response = userInput.readLine();
            out.println(response);
        }
        socket.close();
        server.close();
    }
}
//client.java

import java.net.*;
        import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = userInput.readLine()) != null) {
            out.println(line);
            System.out.println("Server: " + in.readLine());
        }
        socket.close();
    }
}
//36. HTTP Client API (Java 11+)
import java.net.http.*;
        import java.net.URI;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}
//37. Using javap to Inspect Bytecode
public class HelloWorld {
    public void greet() {
        System.out.println("Hello");
    }
}
//38. Decompile a Class File
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

//39. Reflection in Java
import java.lang.reflect.*;

public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello via reflection");
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("HelloWorld");
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("sayHello");
        method.invoke(obj);
    }
}
//40. Virtual Threads (Java 21)
public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual thread running");
            });
        }
        Thread.sleep(2000);
    }
}
//41. Executor Service and Callable
import java.util.concurrent.*;
        import java.util.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = List.of(
                () -> "Task 1 result",
                () -> "Task 2 result",
                () -> "Task 3 result"
        );

        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }

        executor.shutdown();
    }
}
