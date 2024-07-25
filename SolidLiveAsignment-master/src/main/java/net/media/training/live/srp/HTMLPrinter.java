package net.media.training.live.srp;

public class HTMLPrinter {
    public String printHTML(Employee employee) {  // Changed return type to String
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";  // Fixed parentheses


        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";

        employee.calculateTotalLeavesLeft();

        str += "<span>" + employee.getTotalLeavesLeft() + "</span>";
        return str + "</div> </div>";
    }
}
