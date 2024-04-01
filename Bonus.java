public class Bonus {
    private String ename;
    private String job;
    private int sal;
    private int comm;

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public int getSal() {
        return sal;
    }

    public int getComm() {
        return comm;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }
    @Override
    public String toString() {
        return "Employee Name: " + ename + ", Job: " + job + ", Salary: " + sal + ", Commission: " + comm;
    }
}