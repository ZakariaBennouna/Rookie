import java.util.Scanner;

public class Lab4 {

        public static void main(String[] args) {

            // Initialize Scanner and all variables needed
            Scanner scnr = new Scanner(System.in);

            // String that user inputs
            String userString;

            // Changes char in string to number
            int charToNumber = 0;

            // init final decimal
            long decimal = 0;

            // Ask User
            System.out.print("Enter a hexadecimal number: ");
            userString = scnr.next();
            String computedString = userString.toLowerCase();

            // if that gets the '0x' out of the String
            if (computedString.charAt(0) == '0' && computedString.charAt(1) == 'x') {
                computedString = computedString.substring(2, computedString.length());
            }


            // Loops through each character in the string
            for (int i = 0; i < computedString.length(); i++) {

                char character = computedString.charAt(computedString.length() - i - 1);

                // If Statements handle all letters and numbers and turns them into
                // their integer value
                if (character == 'a') {
                    charToNumber = 10;
                }
                else if (character == 'b') {
                    charToNumber = 11;
                }
                else if (character == 'c') {
                    charToNumber = 12;
                }
                else if (character == 'd') {
                    charToNumber = 13;
                }
                else if (character == 'e') {
                    charToNumber = 14;
                }
                else if (character == 'f') {
                    charToNumber = 15;
                }
                else if (character == '1') {
                    charToNumber = 1;
                }
                else if (character == '2') {
                    charToNumber = 2;
                }
                else if (character == '3') {
                    charToNumber = 3;
                }
                else if (character == '4') {
                    charToNumber = 4;
                }
                else if (character == '5') {
                    charToNumber = 5;
                }
                else if (character == '6') {
                    charToNumber = 6;
                }
                else if (character == '7') {
                    charToNumber = 7;
                }
                else if (character == '8') {
                    charToNumber = 8;
                }
                else if (character == '9') {
                    charToNumber = 9;
                }


                // Final Sum
                decimal = (long)(decimal + charToNumber * Math.pow(16, i));

            }
            import java.util.Scanner;

            public class Main {

                public static void main(String[] args) {

                    // Initialize Scanner and all variables needed
                    Scanner scnr = new Scanner(System.in);

                    // String that user inputs
                    String userString;

                    // Changes char in string to number
                    int charToNumber = 0;

                    // init final decimal
                    long decimal = 0;

                    // Ask User
                    System.out.print("Enter a hexadecimal number: ");
                    userString = scnr.next();
                    String computedString = userString.toLowerCase();

                    // if that gets the '0x' out of the String
                    if (computedString.charAt(0) == '0' && computedString.charAt(1) == 'x') {
                        computedString = computedString.substring(2, computedString.length());
                    }


                    // Loops through each character in the string
                    for (int i = 0; i < computedString.length(); i++) {

                        char character = computedString.charAt(computedString.length() - i - 1);

                        // If Statements handle all letters and numbers and turns them into
                        // their integer value
                        if (character == 'a') {
                            charToNumber = 10;
                        }
                        else if (character == 'b') {
                            charToNumber = 11;
                        }
                        else if (character == 'c') {
                            charToNumber = 12;
                        }
                        else if (character == 'd') {
                            charToNumber = 13;
                        }
                        else if (character == 'e') {
                            charToNumber = 14;
                        }
                        else if (character == 'f') {
                            charToNumber = 15;
                        }
                        else if (character == '1') {
                            charToNumber = 1;
                        }
                        else if (character == '2') {
                            charToNumber = 2;
                        }
                        else if (character == '3') {
                            charToNumber = 3;
                        }
                        else if (character == '4') {
                            charToNumber = 4;
                        }
                        else if (character == '5') {
                            charToNumber = 5;
                        }
                        else if (character == '6') {
                            charToNumber = 6;
                        }
                        else if (character == '7') {
                            charToNumber = 7;
                        }
                        else if (character == '8') {
                            charToNumber = 8;
                        }
                        else if (character == '9') {
                            charToNumber = 9;
                        }


                        // Final Sum
                        decimal = (long)(decimal + charToNumber * Math.pow(16, i));

                    }
                    System.out.print("Omae mai wai mou shin darui?");
                    System.out.println("Your number is " + decimal + " in decimal");
                    //make a change to your lab and add it to your repository again

                }
            }
            import java.util.Scanner;

            public class Main {

                public static void main(String[] args) {

                    // Initialize Scanner and all variables needed
                    Scanner scnr = new Scanner(System.in);

                    // String that user inputs
                    String userString;

                    // Changes char in string to number
                    int charToNumber = 0;

                    // init final decimal
                    long decimal = 0;

                    // Ask User
                    System.out.print("Enter a hexadecimal number: ");
                    userString = scnr.next();
                    String computedString = userString.toLowerCase();

                    // if that gets the '0x' out of the String
                    if (computedString.charAt(0) == '0' && computedString.charAt(1) == 'x') {
                        computedString = computedString.substring(2, computedString.length());
                    }


                    // Loops through each character in the string
                    for (int i = 0; i < computedString.length(); i++) {

                        char character = computedString.charAt(computedString.length() - i - 1);

                        // If Statements handle all letters and numbers and turns them into
                        // their integer value
                        if (character == 'a') {
                            charToNumber = 10;
                        }
                        else if (character == 'b') {
                            charToNumber = 11;
                        }
                        else if (character == 'c') {
                            charToNumber = 12;
                        }
                        else if (character == 'd') {
                            charToNumber = 13;
                        }
                        else if (character == 'e') {
                            charToNumber = 14;
                        }
                        else if (character == 'f') {
                            charToNumber = 15;
                        }
                        else if (character == '1') {
                            charToNumber = 1;
                        }
                        else if (character == '2') {
                            charToNumber = 2;
                        }
                        else if (character == '3') {
                            charToNumber = 3;
                        }
                        else if (character == '4') {
                            charToNumber = 4;
                        }
                        else if (character == '5') {
                            charToNumber = 5;
                        }
                        else if (character == '6') {
                            charToNumber = 6;
                        }
                        else if (character == '7') {
                            charToNumber = 7;
                        }
                        else if (character == '8') {
                            charToNumber = 8;
                        }
                        else if (character == '9') {
                            charToNumber = 9;
                        }


                        // Final Sum
                        decimal = (long)(decimal + charToNumber * Math.pow(16, i));

                    }
                    System.out.print("Omae mai wai mou shin darui?");
                    System.out.println("Your number is " + decimal + " in decimal");
                    //make a change to your lab and add it to your repository again

                }
            }
            import java.util.Scanner;

            public class Main {

                public static void main(String[] args) {

                    // Initialize Scanner and all variables needed
                    Scanner scnr = new Scanner(System.in);

                    // String that user inputs
                    String userString;

                    // Changes char in string to number
                    int charToNumber = 0;

                    // init final decimal
                    long decimal = 0;

                    // Ask User
                    System.out.print("Enter a hexadecimal number: ");
                    userString = scnr.next();
                    String computedString = userString.toLowerCase();

                    // if that gets the '0x' out of the String
                    if (computedString.charAt(0) == '0' && computedString.charAt(1) == 'x') {
                        computedString = computedString.substring(2, computedString.length());
                    }


                    // Loops through each character in the string
                    for (int i = 0; i < computedString.length(); i++) {

                        char character = computedString.charAt(computedString.length() - i - 1);

                        // If Statements handle all letters and numbers and turns them into
                        // their integer value
                        if (character == 'a') {
                            charToNumber = 10;
                        }
                        else if (character == 'b') {
                            charToNumber = 11;
                        }
                        else if (character == 'c') {
                            charToNumber = 12;
                        }
                        else if (character == 'd') {
                            charToNumber = 13;
                        }
                        else if (character == 'e') {
                            charToNumber = 14;
                        }
                        else if (character == 'f') {
                            charToNumber = 15;
                        }
                        else if (character == '1') {
                            charToNumber = 1;
                        }
                        else if (character == '2') {
                            charToNumber = 2;
                        }
                        else if (character == '3') {
                            charToNumber = 3;
                        }
                        else if (character == '4') {
                            charToNumber = 4;
                        }
                        else if (character == '5') {
                            charToNumber = 5;
                        }
                        else if (character == '6') {
                            charToNumber = 6;
                        }
                        else if (character == '7') {
                            charToNumber = 7;
                        }
                        else if (character == '8') {
                            charToNumber = 8;
                        }
                        else if (character == '9') {
                            charToNumber = 9;
                        }


                        // Final Sum
                        decimal = (long)(decimal + charToNumber * Math.pow(16, i));

                    }
                    System.out.print("Omae mai wai mou shin darui?");
                    System.out.println("Your number is " + decimal + " in decimal");
                    //make a change to your lab and add it to your repository again

                }
            }
            System.out.println("NANI!?");
            System.out.println("Your number is " + decimal + " in decimal");

        }
    }
