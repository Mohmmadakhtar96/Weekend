import java.util.ArrayList;
public class Teams {
    private ArrayList<Doctor> doctors ;

    public Teams(ArrayList<Doctor> doctors) { 
        this.doctors = doctors;
     }

     public void add(Doctor doctor) {
         doctors.add(doctor);
     }

     public void remove(Doctor doctor) {
         doctors.remove(doctor);
     }

}
