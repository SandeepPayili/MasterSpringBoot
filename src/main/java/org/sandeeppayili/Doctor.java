package org.sandeeppayili;

public class Doctor implements Staff{

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
//
//    private Nurse nurse;

    public void assist(){
        System.out.println("Doctor is Assisting..............");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}