class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); 
        
        Mother m2 = new Mother();
        m2.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
