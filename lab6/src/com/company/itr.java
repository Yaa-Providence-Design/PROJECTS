package com.company;
public interface itr {
    interface Product{
        void exchange(String ex);
        void contractCode(String con);
        void month(int mth);
        void year(int yr);
    }
    class futureProduct implements Product{
        String exchange;
        String concontractCode;
        int month;
        int year;
        @Override
        public void exchange(String ex) {
          exchange = newexcahnge;
        }

        @Override
        public void contractCode(String con) {
            concontractCode = newContractCode;
        }

        @Override
        public void month(int mth) {
            month = newMonth;
        }

        @Override
        public void year(int yr) {
            year = newYear;
        }
    public void printStates(){
            System.out.println("Exchange: " + exchange + "contractCode: " + contractCode);
        }
    }
    class stockProduct{
        public static void main (String[] args){

        }
    }

}
