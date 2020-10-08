package com.company;

class product {
    private String exchange;
    private String contractCode;
    private int month;
    private int year;

    product(product Future){
        exchange = Future.exchange;
        contractCode = Future.contractCode;;
        month = Future.month;
        year = Future.year;
    }
    product(String ex, String con, int mth, int yr){
        exchange = ex;
        contractCode = con;
        month = mth;
        year = yr;
    }
    product(){
    exchange = String.valueOf(-1);
    contractCode = String.valueOf(-1);
    month = Integer.parseInt(null);
    year = Integer.parseInt(null);

    }
    class stockproduct extends product{
        String ticker;
        stockproduct(String ex, String tr){
            exchange = ex;
            ticker = tr;

        }
    }
    class Demostockproduct{
        public void main(String[] args){
            stockproduct mystockproduct1 = new stockproduct("1000", "15");
            System.out.println("The exchange is: " + exchange + " and the tickness is : " + ticker);
        }
    }
}
