class Hello{
    public static void main(String args[]) {
        System.out.println(4-9);
        System.out.println(4-0);
        int num =4;
        char ch='a';
        ch++;// Incrementing the character 'a' to 'b'
        boolean b = true;
        System.out.println(b);
        System.out.println(ch);
        System.out.println(num);
        int c =257;
        byte b1 = (byte) c; // Casting int to byte
        System.out.println(b1); // Output will be 1 due to overflow
        byte b3=10;
        byte b2=20;
        int result = b3 * b2; // Adding two bytes, result is 'promoted' to int
        System.out.println(result); // Output will be 30
        int z=10;
        int y=20;
        boolean isEqual = (z <= y); // Comparing two integers ,equal or greater than or less than
        System.out.println(isEqual); // Output will be false
        System.out.println(!isEqual);// Output will be true, negating the previous boolean value
        //bitwise operator
        int x = 5; // 0101 in binary
        int y1 = 3; // 0011 in binary
        int bitwiseAnd = x & y1; // Bitwise AND operation
        int bitwiseOr = x | y1; // Bitwise OR operation
        System.out.println("Bitwise AND: " + bitwiseAnd); // Output will be 1 (0001 in binary)
        System.out.println("Bitwise OR: " + bitwiseOr); // Output will be 7 (0111 in binary)
    }
}