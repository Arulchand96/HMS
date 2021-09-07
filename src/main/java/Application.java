import buisnessobject.*;
import dao.Appointment_statusDAO;
import dao.PatientDAO;
import dao.Report;
import entity.Time;
import entity.CurrentDate;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import java.util.Calendar;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application extends DoctorBO
{
    public static void main(String args[]) {
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        Hospital l = new Hospital();
        Appointment_status a = new Appointment_status();
        Doctor d = new Doctor();
        Patient p = new Patient();
        Medicine m = new Medicine();
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6=1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Hospitals  2.Doctors   3.Patients  4.Medicines  5.Appointments   6.visitors  7.Reports 8.Time and Date  ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **Hospitals**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2. Existing Hospitals List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                HospitalBO hospitalBO = new HospitalBO();
                                hospitalBO.createHospital();


                                break;
                            }
                            case 2: {

                                HospitalBO hospitalBO = new HospitalBO();
                                hospitalBO.viewHospital();

                            }
                            break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }

                }
                break;


                case 2:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                DoctorBO doctorBO = new DoctorBO();
                                doctorBO.createDoctor();

                                break;
                            }
                            case 2:
                            {

                                DoctorBO doctorBO=new DoctorBO();
                                doctorBO.viewDoctor();


                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                PatientBO patientBO=new PatientBO();
                                patientBO.createPatient();

                                break;
                            }
                            case 2:
                            {

                                PatientBO patientBO=new PatientBO();
                                patientBO.viewPatient();



                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }

                 case 4:
                 {

                     s3 = 1;
                     System.out.println("--------------------------------------------------------------------------------");
                     System.out.println("                     **MEDICINE SECTION**");
                     System.out.println("--------------------------------------------------------------------------------");
                     while (s3 == 1)
                     {
                         System.out.println("1.Add New Entry\n2. Existing Medicines List");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                             {
                                 MedicineBO medicineBO=new MedicineBO();
                                 medicineBO.createMedicine();
                                 break;
                             }
                             case 2:
                             {
                                 MedicineBO medicineBO=new MedicineBO();
                                 medicineBO.viewMedicine();
                                 break;
                             }
                         }
                         System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                         s3 = input.nextInt();
                     }
                     break;
                 }

                case 5:
                {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **APPOINTMENT STATUS**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1) {
                        int b = 1, c = 2;
                        System.out.println("1.Add New Entry  2.Existing List ");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Appointment_statusBO appointment_statusBO = new Appointment_statusBO();
                                appointment_statusBO.createAppointment_status();
                                break;
                            }


                            case 2: {
                                Appointment_statusBO appointment_statusBO = new Appointment_statusBO();
                                appointment_statusBO.viewAppointment_status();


                                break;


                            }


                        }


                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s6 = input.nextInt();

                    break;

                }


                case 6:
                {

                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **Visitors**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Visitors\n2. Existing visitors List\n 3.Need to admit");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createVisitor();

                                break;
                            }
                            case 2:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.viewVisitor();

                                break;
                            }
                            case 3:
                            {
                                InPatientBO inPatientBO=new InPatientBO();
                                inPatientBO.update();

                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }

                case 7:
                {

                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **Reports**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println(" 1.Patient details for the patient name/id\n 2.List of visit for the patient Id\n 3.The visit details for given date range\n 4.List of patient who needs the followup visit\n 5.The list of patient by doctor\n 6.In-patient list\n 7.Out-patient list\n 8.Display the today’s visited patient");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {

                                PatientBO PatientBO=new PatientBO();
                                PatientBO.createReportOne();

                                break;
                            }
                            case 2:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createReportTwo();

                                break;
                            }
                            case 3:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createReportThree();

                                break;
                            }
                            case 4:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createReportFour();

                                break;
                            }
                            case 5:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createReportFive();

                                break;
                            }
                            case 6:
                            {
                                System.out.println("IP patients list");
                                PatientDAO patientDAO=new PatientDAO();
                                patientDAO.reportSix();

                                break;
                            }
                            case 7:
                            {
                                System.out.println("OP patients list");
                                PatientDAO patientDAO=new PatientDAO();
                                patientDAO.reportSeven();

                                break;

                            }
                            case 8:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createReportEight();

                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }


                case 8:
                {

                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **Time and Date**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println(" 1.Current time as string in 12hrs format\n 2.Current time as string in 24hrs format\n 3.current date in string format\n 4.Method to return current date ");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                Time time=new Time();
                                time.currentTimeTwelve();
                                break;
                            }
                            case 2:
                            {
                                Time time=new Time();
                                time.currentTimeTwentyFour();
                                break;
                            }
                            case 3:
                            {
                                CurrentDate date=new CurrentDate();
                                date.currentDate();
                                break;
                            }
                            case 4:
                            {
                                CurrentDate date=new CurrentDate();
                                date.returnCurrentDate();
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }



                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }

            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }

        }
    }


