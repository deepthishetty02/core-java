class FacebookRunner {
    public static void main(String[] args) {

        Facebook obj1 = new Facebook("Deepu", "deepu@gmail.com", 500, 1111111111L, true);
        obj1.display();

        Facebook obj2 = new Facebook("Anu", "anu@gmail.com", 300, 2222222222L, false);
        obj2.display();

        Facebook obj3 = new Facebook("Meena", "meena@gmail.com", 450, 3333333333L, true);
        obj3.display();

        Facebook obj4 = new Facebook("Kiran", "kiran@gmail.com", 700, 4444444444L, true);
        obj4.display();

        Facebook obj5 = new Facebook("Vijay", "vijay@gmail.com", 250, 5555555555L, false);
        obj5.display();

        Facebook obj6 = new Facebook("Gundi", "gundi@gmail.com", 600, 6666666666L, true);
        obj6.display();

        Facebook obj7 = new Facebook("Varshini", "var@gmail.com", 350, 7777777777L, false);
        obj7.display();
    }
}