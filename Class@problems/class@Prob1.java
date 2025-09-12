class student {
    private int sno;
    private String sname;
    private double fee;

  public void read() {
       
        sno = Integer.parseInt(System.console().readLine());
        sname = System.console().readLine();
        fee = Double.parseDouble(System.console().readLine());
    }

    public void print() {
        System.out.printf("%d %s %.2f\n", sno, sname, fee);
    }
}



class program1212 {
    public static void main(String[] args) {
        student s;
        s = new student();
        s.read();
        s.print();
    }
}
