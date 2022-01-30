package com.heloworld;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Accounts {

    public class Account {

        String name;
        String amount;

        public Account(String name, String amount) {
            super();
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String toString() {
            return this.getName() + ", " + this.getAmount();
        }

    }

    public  void writer(ArrayList<Account> datArrayList) throws IOException {

        PrintWriter pw = null;
        FileOutputStream fo = null;
        File file = null;
        try {
            file = new File("output.txt");
            pw = new PrintWriter(new FileOutputStream(file));
            fo = new FileOutputStream(file);
            int datList = datArrayList.size();
            for (int i = 0; i < datList; i++) {
                pw.write(datArrayList.get(i).toString() + "\n");
            }
        } finally {
            pw.flush();
            pw.close();
            fo.close();
        }

    }

    public static void main(String args[]) {
        Accounts Writer = new Accounts();
        ArrayList<Account> datArrayList = new ArrayList<Account>();
        Account account = Writer.new Account("Avi" , " 5000");
      //  Account account2 = Writer.new Account("Tom" , " 1000");
        datArrayList.add(account);

        try {
            Writer.writer(datArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}