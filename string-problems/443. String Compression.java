class Solution {
    public int compress(char[] chars) {
        int counter = 0;
        int readPointer = 0;
        int writePointer = 0;
        while (readPointer < chars.length) {
            if (chars[writePointer] == chars[readPointer]) {
                counter++;
                readPointer++;
            } else {
                if (counter > 1) {
                    for (char num : String.valueOf(counter).toCharArray()) {
                        writePointer++;
                        chars[writePointer] = num;
                    }
                }
                writePointer++;
                chars[writePointer] = chars[readPointer];
                counter = 0;
            }
        }

        System.out.println(counter);
        if (counter > 1) {
            for (char num : String.valueOf(counter).toCharArray()) {
                writePointer++;
                chars[writePointer] = num;
            }
        }

        return writePointer + 1;
    }
}