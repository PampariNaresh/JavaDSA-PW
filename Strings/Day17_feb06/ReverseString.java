class ReverseString {
    public static void main(String args[] ) {
        StringBuilder sb = new StringBuilder("PWSKILLS");
        sb.reverse();
        sb.setCharAt(6,'W');
        sb.setCharAt(7,'P');
        System.out.println(sb);
    }
}