class CellPhoneRunner {

    public static void main(String[] args) {

        System.out.println(CellPhone.getContactName(9876543210L));
        System.out.println(CellPhone.getContactName(8765432109L));
        System.out.println(CellPhone.getContactName(7654321098L));
        System.out.println(CellPhone.getContactName(6543210987L));
        System.out.println(CellPhone.getContactName(5432109876L));
        System.out.println(CellPhone.getContactName(4321098765L));
        System.out.println(CellPhone.getContactName(3210987654L));
        System.out.println(CellPhone.getContactName(2109876543L));
        System.out.println(CellPhone.getContactName(1098765432L));
        System.out.println(CellPhone.getContactName(9988776655L));
        System.out.println(CellPhone.getContactName(9123456780L));
        System.out.println(CellPhone.getContactName(9234567891L));
        System.out.println(CellPhone.getContactName(9345678912L));
        System.out.println(CellPhone.getContactName(9456789123L));
        System.out.println(CellPhone.getContactName(9567891234L));
		
		System.out.println(CellPhone.getContactName(1111111111L));

    }
}