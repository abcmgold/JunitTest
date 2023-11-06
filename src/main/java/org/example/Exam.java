package org.example;

public class Exam {
    public boolean isPassed(int diemToan, int diemLy) {
        if (diemToan >= 70 && diemLy >= 70) {
            return true;
        }
        else if ((diemToan + diemLy) / 2 >= 80) {
            return  true;
        }
        return false;
    }
}
