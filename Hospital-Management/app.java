import admin.*;
import doctor.*;
import patient.*;
import medical.*;
import appointment.*;
import java.util.*;
import bill.*;

class startApp {
    public void adminC() {
        admin ad = new admin();
        ad.adminStart();
    }

    public void doctorC() {
        doctor doc = new doctor();
        doc.doctorStart();
    }

    public void patientC() {
        patient pat = new patient();
        pat.patientStart();
    }

    public void medicalC() {
        medical med = new medical();
        med.medicalStart();
    }

    public void billC() {
        billGenerater billg = new billGenerater();
        billg.billStart();
    }

    public void appointmentC() {
        appointmentMangement appointM = new appointmentMangement();
        appointM.appointMangementStart();
    }

    void start() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("");
        System.out.println(" YOU ARE WELCOME TO CITY HOSPITAL ");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("");
        adminC();
        doctorC();
        patientC();
        medicalC();
        appointmentC();
        billC();
        System.out.println("7. Exit from Hospital ");
        System.out.println(" ");
        admin admin = new admin();
        doctor doctor = new doctor();
        patient patient = new patient();
        medical medical = new medical();
        billGenerater billGenerater = new billGenerater();
        appointmentMangement appointmentMangement = new appointmentMangement();
        System.out.println("Select any Option ");
        int option = 0;
        Scanner scan = new Scanner(System.in);

        try {
            option = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("Enter Number ");
            System.out.println(" ");
            start();
        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Error ");
            System.out.println(" ");
            start();
        } finally {
            // scan.close();
        }

        if (option == 1) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to host area ");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            admin.adminOption();

        } else if (option == 2) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to Doctor Area ");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            doctor.doctorOption();
        } else if (option == 3) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to Patient Area");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            patient.patientOption();
        } else if (option == 4) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to Medical Record Management Area ");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            medical.medicalOption();
        } else if (option == 5) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to Appointment Management Area ");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            appointmentMangement.appointMangementOption();
        } else if (option == 6) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("Welcome to Bill Generater Counter ");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            billGenerater.billGenetateroption();
        } else if (option == 7) {
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("");
            System.out.println("close");
            System.out.println();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }
    }

}

public class app {
    public static void main(String[] args) {
        startApp startApp = new startApp();
        startApp.start();
    }

}