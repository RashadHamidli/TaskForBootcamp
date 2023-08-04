package com.company.lesson19.task1;


public class WorkerDetails {
    private String workerName,workerSurname,workerJob;
    private double workerMoney;
    private int workerNo,workerOffDay;

    public WorkerDetails(int workerNo,String workerName, String workerSurname, String workerJob, double workerMoney){
        this.workerNo = workerNo;
        this.workerName = workerName;
        this.workerSurname = workerSurname;
        this.workerJob = workerJob;
        this.workerMoney = workerMoney;
        if(workerJob != null) {
            if (workerJob.contains("Mühendis"))
                workerOffDay = 30;
            else
                workerOffDay = 14;
        }
        else
            workerOffDay = 0;
    }
    public String toString(){
        return "["+workerNo+"]\t\t\t"+workerName+"\t\t\t"+workerSurname+"\t\t\t"+workerJob+"\t\t\t"+workerMoney+" TL\t\t\t"+workerOffDay+" Gün";
    }
}
