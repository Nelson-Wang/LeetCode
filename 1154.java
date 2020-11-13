package com;

/**
 * Created by wWX945273 on 2020/11/12.
 */

/**
 1154. Day of the Year

 Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 Example 1:

 Input: date = "2019-01-09"
 Output: 9
 Explanation: Given date is the 9th day of the year in 2019.
 Example 2:

 Input: date = "2019-02-10"
 Output: 41
 Example 3:

 Input: date = "2003-03-01"
 Output: 60
 Example 4:

 Input: date = "2004-03-01"
 Output: 61
 */
public class Solution1154 {
    public boolean isLeapYear(int year){
        if (year % 100 == 0){
            if (year%400==0) return true;
            return false;
        }
        return year % 4 == 0;
    }

    public int dayOfYear(String date) {
        String[] split = date.trim().split("-");
        int year = Integer.valueOf(split[0]);
        int month = Integer.valueOf(split[1]);
        int day = Integer.valueOf(split[2]);

        int[] months = new int[12];
        for (int i=0; i<months.length; i++){
            if (i==1){
                if (isLeapYear(year)){
                    months[i] = 29;
                }else {
                    months[i] = 28;
                }
            }else if (i==0 || i==2 || i==4 || i==6 || i==7 || i==9 || i==11){
                months[i] = 31;
            }else {
                months[i] = 30;
            }
        }
        int sum = 0;
        for (int j=0; j<month-1; j++){
            sum += months[j];
        }
        return sum+day;
    }

    public static void main(String[] args) {
        Solution1154 solution1154 = new Solution1154();
        String date = "2200-03-01";
        int i = solution1154.dayOfYear(date);
        System.out.println(i);
    }
}
