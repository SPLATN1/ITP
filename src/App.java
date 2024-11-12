import java.util.ArrayList;

class Bill {
    private String billID;
    private String name;
    private double amount;

    public Bill(String billID, String name, double amount) {
        this.billID = billID;
        this.name = name;
        this.amount = amount;
    }

    public String getBillID() {
        return billID;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
class Patient {
    private String uniqueID;
    private String name;
    private Bill bill;

    public Patient(String uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.bill = null;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void payBill() {
        if (bill != null) {
            System.out.println(name + " paid the bill with ID: " + bill.getBillID() + " of amount: " + bill.getAmount());
        } else {
            System.out.println("No bill to pay.");
        }
    }
}
class Reseptionist {
    private String uniqueID;
    private String name;

    public Reseptionist(String uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
    }
    public void giveAppointment(Patient patient) {
        System.out.println("Appointment given to " + patient.getName() + " by " + name);
    }

    public void generateBill(Patient patient, double amount) {
        String billID = "B-" + patient.getUniqueID();
        Bill bill = new Bill(billID, "Bill for " + patient.getName(), amount);
        patient.setBill(bill);
        System.out.println("Bill generated for " + patient.getName() + ". Bill ID: " + bill.getBillID() + ", Amount: " + amount);
    }
}
class Doctor {
    private String uniqueID;
    private String name;
    public Doctor(String uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
    }

    public void checkPatient(Patient patient) {
        System.out.println(name + " is checking patient: " + patient.getName());
    }
}
public class App {
    public static void main(String[] args) {
        Patient p1 = new Patient("John", "Doe");
        Reseptionist r1 = new Reseptionist("John", "Doe");
        Doctor d1 = new Doctor("John", "Doe");
        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(p1);
        Object rec = null;
        rec = patients.toArray();
    }
}