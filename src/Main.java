import models.Classroom;
import models.Invoice;
import models.Students;
import models.subject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Classroom information

        Classroom  c1= new Classroom("Lobtuche","Akash Giri",26,26,101,false,true);
        Classroom c2= new Classroom("Khumbila","MOhan Pradhan",30,28,102,false,true);
        Classroom c3= new Classroom("Yala","Bishnu Pandey",26,26,103,true,false);

//        Subject information

        subject s1= new subject("Math","Bishnu Pandey,Mohan Pradhan",00,75,28);
        subject s2 = new subject("Chemistry","Sagina Maharjan,Dhanswor Younghan,Ram Daras Pandey",00,75,28);
        subject s3= new subject("Physics","Akash Giri,Mazina Rajupadhaye,Madhu Sudhan",00,75,28);
        subject s4= new subject("English","Prakash Kc",00,75,28);
        subject s5= new subject("Nepali","Yubraj Aryal",00,75,28);
        subject s6= new subject("Java","Prayush Shrestha",00,50,18);
        subject s7= new subject("Python","Umesh Regmi",00,50,18);

//     Student information

        Students std1 = new Students("Ritesh Paudel",25047,12,"Khumbil");



        Date d1 = new Date("2024-09-11:10:00:08");
        Date d2 = new Date("2024-09-11:15:00:08");


//    Invoice information
        Invoice i1 = new Invoice(std1,202,d1,d2,40000.50);





    }
}