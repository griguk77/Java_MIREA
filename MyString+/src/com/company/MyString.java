package com.company;

import java.util.Arrays;

public final class MyString {
    private char[] c = new char[0];

    public MyString() {}

    public MyString(char[] c){
        this.c = c;
    }

    public MyString(MyString original) {
        this.c = original.c;
    }

    public MyString(String original) {
        this.c = original.toCharArray();
    }

    public int length() {
        return c.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.c);
    }

    public MyString concat(MyString obj){
        int n = this.c.length;
        char[] cc = new char[n+obj.c.length];
        System.arraycopy(this.c, 0, cc, 0, n);
        int m = 0;
        for (int i = n; i < n+obj.c.length; i++){
            cc[i] = obj.c[m];
            m++;
        }
        return new MyString(cc);
    }

    public char charAt(int i){
        return this.c[i];
    }

    public int compareTo(MyString anotherString) {
        int com = 0;
        for (int i = 0; i < Math.min(this.length(), anotherString.length()); i++) {
            if (this.charAt(i) != anotherString.charAt(i)) {
                com = this.charAt(i) - anotherString.charAt(i);
                break;
            }
        }
        return com;
    }

    public MyString subString(int beginIndex, int endIndex) {
        char[] res = new char[endIndex - beginIndex + 1];
        for (int i = beginIndex; i <= endIndex; i++) {
            res[i - beginIndex] = charAt(i);
        }
        return new MyString(res);
    }

    public boolean equals(MyString obj) {
        if (this.c.length != obj.c.length){
            return false;
        }
        for (int i = 0; i < this.c.length; i++){
            if (this.c[i] != obj.c[i]){
                return false;
            }
        }
        return true;
    }

    public MyString trim(){
        char[] cc = new char[this.c.length-1];
        System.arraycopy(c, 0, cc, 0, cc.length);
        return new MyString(cc);
    }

    public boolean isEmpty(){
        return this.c.length == 0;
    }
}