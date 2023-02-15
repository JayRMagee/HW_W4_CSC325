package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList --DONE
        ((Executive) staffList[0]).pay();
        ((Intern) staffList[1]).pay();
        ((StaffEmployee) staffList[2]).pay();
        ((TempEmploee) staffList[3]).addHours(40);
        ((StaffEmployee) staffList[4]).pay();
        ((StaffEmployee) staffList[5]).pay();
        ((StaffEmployee) staffList[6]).pay();
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
