package com.gradedproject.q1;

class HrDepartment extends SuperDepartment {
    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Complete your documents submission";
    }
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }

}
