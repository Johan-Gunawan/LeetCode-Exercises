class Solution {
    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        return decoder(chars, new StringBuilder());
    }

    public String decoder(char[] chars, StringBuilder result) {
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                StringBuilder strTimes = new StringBuilder();
                while (Character.isDigit(chars[i])) {
                    strTimes.append(chars[i]);
                    i++;
                }
                i--;
                boolean needRepeat = false;
                int j = i + 1;
                StringBuilder temp = new StringBuilder();
                StringBuilder stack = new StringBuilder();
                stack.append(chars[j]);
                while (true) {
                    j++;
                    if (chars[j] == '[') {
                        needRepeat = true;
                        stack.append(chars[j]);
                    } else if (chars[j] == ']') {
                        stack.setLength(stack.length() - 1);
                        if (stack.length() == 0) {
                            break;
                        }
                    }

                    temp.append(chars[j]);
                }

                int times = Integer.valueOf(strTimes.toString());
                if (needRepeat) {
                    for (int k = 0; k < times; k++) {
                        result.append(decoder(temp.toString().toCharArray(), new StringBuilder()));
                    }
                } else {
                    for (int k = 0; k < times; k++) {
                        result.append(temp);
                    }
                }
                i = j;
            } else {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }
}