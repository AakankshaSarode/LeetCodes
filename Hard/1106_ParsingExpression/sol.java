class Solution {
    private boolean sol(int[] i, String s) {
        char exp = s.charAt(i[0]); // store the expression present at first
        boolean tPresent = false, fPresent = false; // declare variables to check if 'true' or 'false' is present

        i[0] += 2; // skip '(' and move to the expression inside it

        while (s.charAt(i[0] - 1) != ')') { // if closing bracket is skipped, then break
            char ch = s.charAt(i[0]);

            if (ch == 't') {
                tPresent = true;
            } else if (ch == 'f') {
                fPresent = true;
            } else { // if another operator with other brackets is present
                boolean rec = sol(i, s); // recursive call and calculate the value
                if (rec) {
                    tPresent = true;
                } else {
                    fPresent = true;
                }
            }
            i[0] += 2; // skip ','
        }
        i[0]--; // go to index after this ')'

        if (exp == '|') return tPresent; // if 'true' is present, return true
        if (exp == '&') return !fPresent; // if 'false' is present, return false

        // if '!' is there
        if (tPresent) return false;
        return true;
    }

    public boolean parseBoolExpr(String expression) {
        int[] i = {0};
        return sol(i, expression);
    }
}
