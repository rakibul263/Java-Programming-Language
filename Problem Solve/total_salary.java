import java.util.*;

import java.io.*;

public class total_salary {

    public static int totalSalary(int basic, char grade) {

        double hra = (basic * 0.20);

        double da = (basic * 0.50);

        double pf = (basic * 0.11);

        double allowance = 0;

        if (grade == 'A')
            allowance = 1700;

        else if (grade == 'B')
            allowance = 1500;

        else
            allowance = 1300;

        int totalSalary = (int) Math.round(basic + hra + da + allowance - pf);

        return totalSalary;

    }

}
