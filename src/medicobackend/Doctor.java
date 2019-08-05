package medicobackend;

//Good old bean
public class Doctor {
    
    public String fname,mname,lname,phone,email,licNo,dob;
    public long createdAt;
    
    public String getFName() {
        return fname;
    }
    
    public String getMName() {
        return mname;
    }
    
    public String getLName() {
        return lname;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getLicNo() {
        return licNo;
    }
    
    public String getDOB() {
        return dob;
    }
    
    public long getCreatedAt() {
        return createdAt;
    }
    
    public void setFName(String fname) {
        this.fname = fname;
    }
    
    public void setMName(String mname) {
        this.fname = mname;
    }
    
    public void setLName(String lname) {
        this.fname = lname;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setLicNo(String licNo) {
        this.licNo = licNo;
    }
    
    public void setDOB(String dob) {
        this.dob = dob;
    }
    
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
    
}
